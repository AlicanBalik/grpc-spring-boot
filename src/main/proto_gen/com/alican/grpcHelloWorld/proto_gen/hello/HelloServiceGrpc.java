package com.alican.grpcHelloWorld.proto_gen.hello;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: HelloService.proto")
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "com.alican.grpcHelloWorld.proto_gen.hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest,
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> METHOD_EXECUTE_HELLO =
      io.grpc.MethodDescriptor.<com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest, com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.alican.grpcHelloWorld.proto_gen.hello.HelloService", "ExecuteHello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest,
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> METHOD_EXECUTE_HELLO_STREAM =
      io.grpc.MethodDescriptor.<com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest, com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "com.alican.grpcHelloWorld.proto_gen.hello.HelloService", "ExecuteHelloStream"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> METHOD_EXECUTE_HELLO_EMPTY =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.alican.grpcHelloWorld.proto_gen.hello.HelloService", "ExecuteHelloEmpty"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    return new HelloServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void executeHello(com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_HELLO, responseObserver);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest> executeHelloStream(
        io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_EXECUTE_HELLO_STREAM, responseObserver);
    }

    /**
     */
    public void executeHelloEmpty(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXECUTE_HELLO_EMPTY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EXECUTE_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest,
                com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>(
                  this, METHODID_EXECUTE_HELLO)))
          .addMethod(
            METHOD_EXECUTE_HELLO_STREAM,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest,
                com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>(
                  this, METHODID_EXECUTE_HELLO_STREAM)))
          .addMethod(
            METHOD_EXECUTE_HELLO_EMPTY,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>(
                  this, METHODID_EXECUTE_HELLO_EMPTY)))
          .build();
    }
  }

  /**
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractStub<HelloServiceStub> {
    private HelloServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void executeHello(com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_HELLO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest> executeHelloStream(
        io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_EXECUTE_HELLO_STREAM, getCallOptions()), responseObserver);
    }

    /**
     */
    public void executeHelloEmpty(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_HELLO_EMPTY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse executeHello(com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE_HELLO, getCallOptions(), request);
    }

    /**
     */
    public com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse executeHelloEmpty(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXECUTE_HELLO_EMPTY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> executeHello(
        com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_HELLO, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse> executeHelloEmpty(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXECUTE_HELLO_EMPTY, getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_HELLO = 0;
  private static final int METHODID_EXECUTE_HELLO_EMPTY = 1;
  private static final int METHODID_EXECUTE_HELLO_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_HELLO:
          serviceImpl.executeHello((com.alican.grpcHelloWorld.proto_gen.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_HELLO_EMPTY:
          serviceImpl.executeHelloEmpty((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE_HELLO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeHelloStream(
              (io.grpc.stub.StreamObserver<com.alican.grpcHelloWorld.proto_gen.hello.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class HelloServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alican.grpcHelloWorld.proto_gen.hello.HelloServiceOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceDescriptorSupplier())
              .addMethod(METHOD_EXECUTE_HELLO)
              .addMethod(METHOD_EXECUTE_HELLO_STREAM)
              .addMethod(METHOD_EXECUTE_HELLO_EMPTY)
              .build();
        }
      }
    }
    return result;
  }
}
