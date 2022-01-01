package com.alican.grpcHelloWorld.service;

import com.alican.grpcHelloWorld.model.User;
import com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest;
import com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse;
import com.alican.grpcHelloWorld.repository.UserRepository;
import com.google.protobuf.Empty;
import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;

@Slf4j
@Service
@RequiredArgsConstructor
public final class HelloServiceImpl implements HelloService {

    private final UserRepository userRepository;

    @Override
    public void executeHello(final HelloRequest request, final StreamObserver<HelloResponse> responseObserver) {
        log.info("Payload received... " + request.getFirstName());

        if (request.getMapMap().isEmpty()) {
            throw new IllegalArgumentException("Empty map.");
        }

        final String username = request.getFirstName();
        final boolean existsByUsername = userRepository.existsByUsernameIgnoreCase(username);

        if (existsByUsername) {
            throw new EntityExistsException(String.format("Username %s already exists.", username));
        }

        final User user = new User(username, request.getLastName());
        userRepository.save(user);

        final HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(user.getId().toString())
                .setCreatedDate(Timestamp.newBuilder()
                        .setSeconds(user.getCreatedDate().getEpochSecond())
                        .setNanos(user.getCreatedDate().getNano()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<HelloRequest> executeHelloStream(final StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<>() {
            @Override
            public void onNext(HelloRequest value) {
                if (value.getMapMap().isEmpty()) {
                    throw new IllegalArgumentException("Empty map.");
                }

                responseObserver.onNext(HelloResponse.newBuilder()
                        .setGreeting(String.format("Hmmm %s - %s.", value.getFirstName(), value.getLastName()))
                        .build());
            }

            @Override
            public void onError(Throwable t) {
                log.error("onError func was triggered.");
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void executeHelloEmpty(final Empty request, final StreamObserver<HelloResponse> responseObserver) {
        responseObserver.onError(new IllegalStateException("nope."));
    }
}
