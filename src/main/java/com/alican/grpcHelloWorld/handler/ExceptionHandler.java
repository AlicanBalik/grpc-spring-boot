package com.alican.grpcHelloWorld.handler;

import io.grpc.Status;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.recovery.GRpcExceptionHandler;
import org.lognet.springboot.grpc.recovery.GRpcExceptionScope;
import org.lognet.springboot.grpc.recovery.GRpcServiceAdvice;

import javax.persistence.EntityExistsException;

@Slf4j
@GRpcServiceAdvice
public final class ExceptionHandler {

    @GRpcExceptionHandler
    public Status handle(IllegalArgumentException e, GRpcExceptionScope scope) {
        log.error("Illegal argument exception is called.");

        return Status.INVALID_ARGUMENT.withDescription(e.getMessage()).withCause(e);
    }

    @GRpcExceptionHandler
    public Status handle(EntityExistsException e, GRpcExceptionScope scope) {
        log.error("Entity Exists exception is called.");

        return Status.ALREADY_EXISTS.withDescription(e.getMessage()).withCause(e);
    }
}
