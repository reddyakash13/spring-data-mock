package com.mmnaseri.utils.spring.data.sample.usecases.proxy;

/**
 * @author Milad Naseri (milad.naseri@cdk.com)
 * @since 1.0 (4/12/16, 7:54 PM)
 */
public class ErrorThrowingImplementation {

    public ErrorThrowingImplementation() {
        throw new RuntimeException();
    }
}
