package com.alican.grpcHelloWorld.controller;

import com.alican.grpcHelloWorld.interceptor.LogInterceptor;
import com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest;
import com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse;
import com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceGrpc;
import com.alican.grpcHelloWorld.service.HelloService;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@RequiredArgsConstructor
@GRpcService(interceptors = {LogInterceptor.class})
public final class HelloController extends HelloServiceGrpc.HelloServiceImplBase {

    private final HelloService helloService;

    @Override
    public void executeHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        helloService.executeHello(request, responseObserver);
    }

    @Override
    public StreamObserver<HelloRequest> executeHelloStream(StreamObserver<HelloResponse> responseObserver) {
        return helloService.executeHelloStream(responseObserver);
    }

    @Override
    public void executeHelloEmpty(Empty request, StreamObserver<HelloResponse> responseObserver) {
        helloService.executeHelloEmpty(request, responseObserver);
    }
}
