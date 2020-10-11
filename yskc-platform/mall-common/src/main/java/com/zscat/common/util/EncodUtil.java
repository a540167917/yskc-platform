package com.zscat.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;
/**
   *姓名:张古良
  *时间：2019.7.20
 * @author Administrator
 *
 */
public class EncodUtil {
	/**
	 *密码加密
	 * @param str
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	 public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		    //确定计算方法
		    MessageDigest md5=MessageDigest.getInstance("MD5");
		    BASE64Encoder base64en = new BASE64Encoder();
		    //加密后的字符串
		    String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
		    return newstr;
		  }
		 public static void main(String[] args) {
			try {
				System.out.println(EncodUtil.EncoderByMd5("123456"));
			} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
