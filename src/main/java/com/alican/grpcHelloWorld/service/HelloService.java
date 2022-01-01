package com.alican.grpcHelloWorld.service;

import com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest;
import com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public interface HelloService {

    void executeHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver);

    StreamObserver<HelloRequest> executeHelloStream(StreamObserver<HelloResponse> responseObserver);

    void executeHelloEmpty(Empty request, StreamObserver<HelloResponse> responseObserver);
}
