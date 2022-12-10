package com.looksin;


import io.grpc.BindableService;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;



public  class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase implements BindableService {

    @Override
    public void say(HelloRequest req, StreamObserver<HelloReply> responseObserver){

        HelloReply reply = HelloReply.newBuilder().setMessage("Hello" + req.getName());
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    public HelloWorldServer build() {
        return null;
    }

    @Override
    public ServerServiceDefinition bindService() {
        return null;
    }
}




