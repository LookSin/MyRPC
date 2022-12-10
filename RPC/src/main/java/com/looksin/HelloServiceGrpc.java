package com.looksin;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class HelloServiceGrpc {
    public static HelloServiceBlockingStub newBlockingStub(ManagedChannel channel) {
        return null;
    }

    public interface HelloServiceBlockingStub {
        HelloReply say(HelloRequest request);
    }

    public static abstract class HelloServiceImplBase {
        public abstract void say(HelloRequest req, StreamObserver<HelloReply> responseObserver);
    }
}
