package com.fc.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtTest {
    @Test
    public void encode(){
        Map<String,Object> header=new HashMap<>();
        header.put("alg","HS256");
        header.put("typ","JWT");
        HashMap<String,Object> payload=new HashMap<>();
        Calendar instance=Calendar.getInstance();
        instance.add(Calendar.SECOND,10);
        payload.put("id",1);
        payload.put("username","易烊千玺");
        payload.put("createTime",new Date());
        payload.put("lastAccessTime",new Date());
        payload.put("exp",instance.getTime());

        String token=JWT
                .create()
                .withHeader(header)
                .withPayload(payload)
                .sign(Algorithm.HMAC256("123456"));
        System.out.println(token);
    }
    @Test
    public void decode(){
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256("123456")).build();
        DecodedJWT decodedJWT=verifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJsYXN0QWNjZXNzVGltZSI6MTY0OTEzNzc3OCwiY3JlYXRlVGltZSI6MTY0OTEzNzc3OCwiaWQiOjEsInVzZXJuYW1lIjoi5piT54OK5Y2D5466In0.JNf44ZLWPp8n0kFr0d2aw0yXvWfzKWTDgwpag-pPYos");
        System.out.println(decodedJWT.getHeader());
        System.out.println(decodedJWT.getPayload());
        System.out.println(decodedJWT.getAlgorithm());
        System.out.println(decodedJWT.getSignature());
        System.out.println(decodedJWT.getExpiresAt());
        System.out.println(decodedJWT.getClaim("username"));
        System.out.println(decodedJWT.getClaim("createTime"));
        System.out.println(decodedJWT.getClaim("lastAccessTime"));
        System.out.println(decodedJWT.getClaim("info"));
    }
}
