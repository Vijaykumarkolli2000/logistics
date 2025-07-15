package com.vk.logistics.service;

import org.springframework.stereotype.Service;

@Service
public class S3Service {
    public void uploadLog(String key, String content) {
        // Use AWS SDK to upload to S3
        System.out.println("Uploading to S3: " + key);
    }
}
