package com.zscat.mall.admin.validator;

import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName ReadFontByteProperties
 * @Description: 读取文件字体类
 * @Author 张古良
 * @Date 2019/12/21 9:56
 **/
public class ReadFontByteProperties {
    static private String fontByteStr = null;
    static{
        loads();
    }
    synchronized static public void loads() {
        if (fontByteStr == null) {
            InputStream is = ReadFontByteProperties.class.getResourceAsStream("/fontByte.properties");
            Properties dbproperties = new Properties();
            try {
                dbproperties.load(is);
                fontByteStr = dbproperties.getProperty("fontByteStr").toString();
            }catch (Exception e){

            }
        }
    }
    public static String getFontByteStr() {
        if (fontByteStr == null)loads();
        return fontByteStr;
    }
}
