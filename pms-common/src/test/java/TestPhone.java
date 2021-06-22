import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPhone {
    @Test
    public  void isPhone() {
           //电话号码
            String phone ="15756260817";
            System.out.println("长度为"+phone.length());
            System.out.println(phone.length()==11);
            String regex = "^((13[0-9])|(14[5,7,9])|(15([0-3]|[5-9]))|(166)|(17[0,1,3,5,6,7,8])|(18[0-9])|(19[8|9]))\\d{8}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(phone);
            System.out.println(m.matches());
    }
    @Test
    public  void isEmail() {
        //电子邮件
        String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern regex = Pattern.compile(check);
        Matcher matcher = regex.matcher("785421@qq.com");
        boolean isMatched = matcher.matches();
        System.out.println(isMatched);

    }
    @Test
    public  void isPassword() {
        //密码强度验证
        String check = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{9,16}$";
        Pattern regex = Pattern.compile(check);
//        Matcher matcher = regex.matcher("785421@qq.com");
        Matcher matcher = regex.matcher("13981aA@072421");
        boolean isMatched = matcher.matches();
        System.out.println(isMatched);
    }
    @Test
    public  void isAcronym() {
        //密码强度验证
        String word = "123456789aA";
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            System.out.println(c);
            System.out.println();
            System.out.println(Character.isUpperCase(c)); //判断大写字母
            System.out.println(Character.isLowerCase(c)); //判断小写字母
        }
    }
}

