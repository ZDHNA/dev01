package com.fc.test;

import com.fc.until.JwtUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JwtUtilTest {
    @Test
    public  void testCreate(){
        HashMap<String,Object> claim=new HashMap<>();
        claim.put("id","1");
        claim.put("username","易烊千玺");
        claim.put("exp",System.currentTimeMillis()+100*60*30);
        String token=JwtUtil.createToken(claim);
        System.out.println(token);
    }
    @Test
    public void testParse(){
        Map<String,Object> map=JwtUtil.getClaim("");
        Set<Map.Entry<String,Object>> entries=map.entrySet();
        for (Map.Entry<String,Object>entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }


}
