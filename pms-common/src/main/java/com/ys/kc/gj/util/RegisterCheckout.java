package com.ys.kc.gj.util;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 注册校验
 */
@Component
public class RegisterCheckout {
    /**
     * 电话校验
     * @param phone 电话号码
     * @return
     */
    public  boolean isPhone(String phone) {
        //电话号码
        String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);
        return m.matches();
    }

    /**
     * 电子邮箱校验
     * @param email 电子邮箱
     * @return
     */
    public  boolean isEmail(String email) {
        //电子邮件
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(email);
        boolean isMatched = matcher.matches();
        return isMatched;
    }

    /**
     * 密码校验
     * @param password
     * @return
     */
    public  boolean isPassword(String password) {
        //密码强度验证
        String check = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{9,16}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher(password);
        boolean isMatched = matcher.matches();
        return isMatched;
    }
}
