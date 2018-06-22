package org.hyperledger.fabric.protos.peer;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Interface that provides support to chaincode execution. ChaincodeContext
 * provides the context necessary for the server to respond appropriately.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: peer/chaincode_shim.proto")
public final class ChaincodeSupportGrpc {

  private ChaincodeSupportGrpc() {}

  private static <T> io.grpc.stub.StreamObserver<T> toObserver(final io.vertx.core.Handler<io.vertx.core.AsyncResult<T>> handler) {
    return new io.grpc.stub.StreamObserver<T>() {
      private volatile boolean resolved = false;
      @Override
      public void onNext(T value) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture(value));
        }
      }

      @Override
      public void onError(Throwable t) {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.failedFuture(t));
        }
      }

      @Override
      public void onCompleted() {
        if (!resolved) {
          resolved = true;
          handler.handle(io.vertx.core.Future.succeededFuture());
        }
      }
    };
  }

  public static final String SERVICE_NAME = "protos.ChaincodeSupport";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage,
      org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> METHOD_REGISTER =
      io.grpc.MethodDescriptor.<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage, org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "protos.ChaincodeSupport", "Register"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChaincodeSupportStub newStub(io.grpc.Channel channel) {
    return new ChaincodeSupportStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChaincodeSupportBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChaincodeSupportBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChaincodeSupportFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChaincodeSupportFutureStub(channel);
  }

  /**
   * Creates a new vertx stub that supports all call types for the service
   */
  public static ChaincodeSupportVertxStub newVertxStub(io.grpc.Channel channel) {
    return new ChaincodeSupportVertxStub(channel);
  }

  /**
   * <pre>
   * Interface that provides support to chaincode execution. ChaincodeContext
   * provides the context necessary for the server to respond appropriately.
   * </pre>
   */
  public static abstract class ChaincodeSupportImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> register(
        io.grpc.stub.StreamObserver<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_REGISTER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER,
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage,
                org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>(
                  this, METHODID_REGISTER)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface that provides support to chaincode execution. ChaincodeContext
   * provides the context necessary for the server to respond appropriately.
   * </pre>
   */
  public static final class ChaincodeSupportStub extends io.grpc.stub.AbstractStub<ChaincodeSupportStub> {
    private ChaincodeSupportStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChaincodeSupportStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChaincodeSupportStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChaincodeSupportStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> register(
        io.grpc.stub.StreamObserver<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface that provides support to chaincode execution. ChaincodeContext
   * provides the context necessary for the server to respond appropriately.
   * </pre>
   */
  public static final class ChaincodeSupportBlockingStub extends io.grpc.stub.AbstractStub<ChaincodeSupportBlockingStub> {
    private ChaincodeSupportBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChaincodeSupportBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChaincodeSupportBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChaincodeSupportBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface that provides support to chaincode execution. ChaincodeContext
   * provides the context necessary for the server to respond appropriately.
   * </pre>
   */
  public static final class ChaincodeSupportFutureStub extends io.grpc.stub.AbstractStub<ChaincodeSupportFutureStub> {
    private ChaincodeSupportFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChaincodeSupportFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChaincodeSupportFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChaincodeSupportFutureStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Interface that provides support to chaincode execution. ChaincodeContext
   * provides the context necessary for the server to respond appropriately.
   * </pre>
   */
  public static abstract class ChaincodeSupportVertxImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(
        io.vertx.grpc.GrpcBidiExchange<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage, org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> exchange) {
      exchange.setReadObserver(asyncUnimplementedStreamingCall(METHOD_REGISTER, exchange.writeObserver()));
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_REGISTER,
            asyncBidiStreamingCall(
              new VertxMethodHandlers<
                org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage,
                org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>(
                  this, METHODID_REGISTER)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface that provides support to chaincode execution. ChaincodeContext
   * provides the context necessary for the server to respond appropriately.
   * </pre>
   */
  public static final class ChaincodeSupportVertxStub extends io.grpc.stub.AbstractStub<ChaincodeSupportVertxStub> {
    private ChaincodeSupportVertxStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChaincodeSupportVertxStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChaincodeSupportVertxStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChaincodeSupportVertxStub(channel, callOptions);
    }

    /**
     */
    public void register(io.vertx.core.Handler<
        io.vertx.grpc.GrpcBidiExchange<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage, org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>> handler) {
      final io.vertx.grpc.GrpcReadStream<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> readStream =
          io.vertx.grpc.GrpcReadStream.<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>create();

      handler.handle(io.vertx.grpc.GrpcBidiExchange.create(readStream, asyncBidiStreamingCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), readStream.readObserver())));
    }
  }

  private static final int METHODID_REGISTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChaincodeSupportImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChaincodeSupportImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.register(
              (io.grpc.stub.StreamObserver<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class VertxMethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChaincodeSupportVertxImplBase serviceImpl;
    private final int methodId;

    VertxMethodHandlers(ChaincodeSupportVertxImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          io.vertx.grpc.GrpcReadStream<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage> request0 = io.vertx.grpc.GrpcReadStream.<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>create();
          serviceImpl.register(
             io.vertx.grpc.GrpcBidiExchange.<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage, org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>create(
               request0,
               (io.grpc.stub.StreamObserver<org.hyperledger.fabric.protos.peer.ChaincodeShim.ChaincodeMessage>) responseObserver));
          return (io.grpc.stub.StreamObserver<Req>) request0.readObserver();
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class ChaincodeSupportDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.hyperledger.fabric.protos.peer.ChaincodeShim.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChaincodeSupportGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChaincodeSupportDescriptorSupplier())
              .addMethod(METHOD_REGISTER)
              .build();
        }
      }
    }
    return result;
  }
}
