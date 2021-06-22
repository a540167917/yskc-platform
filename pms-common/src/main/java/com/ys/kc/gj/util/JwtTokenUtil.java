package com.ys.kc.gj.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 验证码
 */
@Component
public class JwtTokenUtil {
    //设置过期时间
    private static final long EXPIRE_DATE=100000*60*60;
    //token秘钥
    private static final String TOKEN_SECRET = "ZCEQIUBFKSJBFJH2020BQWE";
    public static String token (String username,String password){
       try {
        String token = "";
        //过期时间
        Date date = new Date(System.currentTimeMillis()+EXPIRE_DATE);
        //秘钥及加密算法
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        //设置头部信息
        Map<String,Object> header = new HashMap();
        header.put("typ","JWT");
        header.put("alg","HS256");
        //携带username，password信息，生成签名
        token = JWT.create()
                .withHeader(header)
                .withClaim("username",username)
                .withClaim("password",password)
                .withExpiresAt(date)
                .sign(algorithm);
        return token;
       }catch (UnsupportedEncodingException e){
           e.printStackTrace();
       }
       return null;
    }
    public static boolean verify(String token){
        /**
         * @desc   验证token，通过返回true
         * @create 2019/1/18/018 9:39
         * @params [token]需要校验的串
         **/
        try {
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println(jwt.getExpiresAt());
            SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
           String str =  sdf.format(jwt.getExpiresAt());
            System.out.println(str);
            System.out.println(jwt.getClaims().get("username").asString());
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    //获取token信息
    public DecodedJWT getInformation(String token){
        try{
            Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT jwt = verifier.verify(token);
            return jwt;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
