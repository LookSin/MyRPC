package com.looksin;

public interface HelloReply {


    static HelloReply newBuilder(){

        return null;
    }

    HelloReply setMessage(String s);
    String message = String.valueOf(1);
}
