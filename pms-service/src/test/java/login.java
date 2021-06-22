import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName login
 * @Description: 异构系统漏洞 挖掘平台 漏洞利用知识库
 * @Author 张古良
 * @Date 2019/12/21 10:46
 **/
public class login {
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
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMDDHHmmssSS");
            String account = simpleDateFormat.format(new Date());
            System.out.println(account);
            System.out.println(login.EncoderByMd5(account));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
