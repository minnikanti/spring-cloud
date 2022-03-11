package com.mypack.springcloudoauth2authorizationserver;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class MyBCryptPasswordEncoder {

    @Test
    void bcryptPasswordEncoder() {

        BCryptPasswordEncoder encoder4 = new BCryptPasswordEncoder(4);
        /*Users: user/user@123 admin/admin@123*/

        System.out.println("admin's Bcrypt encrypted password = " + encoder4.encode("admin@123"));
        System.out.println("user's Bcrypt encrypted password = " + encoder4.encode("user@123"));

        /* Users: Client: appclient/appclient@123*/
        System.out.println("appclient's Bcrypt encrypted password = " + encoder4.encode("appclient@123"));
    }
}