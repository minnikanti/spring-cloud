package com.mypack.springcloudoauth2authorizationserver;

import org.junit.jupiter.api.Test;

import java.util.Base64;

public class MyBase64Encoder {

    @Test
    void generateBase64EncodedValue() {

        // Get the Base64 password for appclient:appclient@123
        String appClient = Base64.getEncoder().encodeToString("appclient:appclient@123".getBytes());
        String admin = Base64.getEncoder().encodeToString("admin:admin@123".getBytes());
        String user = Base64.getEncoder().encodeToString("user:user@123".getBytes());

        // This Base64 password for appclient:appclient@123 will be used in the http
        // header when requesting the token
        System.out.println("appclient's Base64 Password is " + appClient);
        System.out.println("admin's Base64 Password is " + admin);
        System.out.println("user's Base64 Password is " + user);
    }
}
