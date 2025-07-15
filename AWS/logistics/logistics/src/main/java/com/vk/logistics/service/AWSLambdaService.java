package com.vk.logistics.service;

import org.springframework.stereotype.Service;

@Service
public class AWSLambdaService {
    public void triggerLambda(String functionName, Object payload) {
        // Use AWS SDK to invoke Lambda
        // For demo, just print
        System.out.println("Lambda triggered: " + functionName + " with payload " + payload);
    }
}
