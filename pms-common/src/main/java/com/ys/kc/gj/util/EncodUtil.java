package com.ys.kc.gj.util;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5密码加密
 */
public class EncodUtil {
    /**
     *密码加密
     * @param str
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String EncoderByMd5(String str){
        try {
            //确定计算方法
            MessageDigest md5=MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
          return newstr;
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "";
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
            return "";
        }
    }
}
