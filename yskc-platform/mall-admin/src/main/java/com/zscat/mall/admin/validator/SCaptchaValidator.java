package com.zscat.mall.admin.validator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * @ClassName SCaptchaValidator
 * @Description: 验证码生成类
 * @Author 张古良
 * @Date 2019/12/21 9:29
 **/
public class SCaptchaValidator {
    // 图片的宽度。
    private int width=120;
    // 图片的高度。
    private int height=40;
    // 验证码字符个数
    private int codeCount=4;
    // 验证码干扰线数
    private int lineCount=50;
    // 验证码
    private String code=null;
    // 验证码图片Buffer
    private BufferedImage bufferedImg=null;
    //字符码
    private char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','0','1','2', '3', '4', '5', '6', '7', '8', '9'};
    //生成随机数
    private Random random = new Random();
    public SCaptchaValidator() {
    }

    /**
     *
     * @param width 宽度
     * @param height 高度
     */
    public SCaptchaValidator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     *
     * @param width 宽度
     * @param height 高度
     * @param codeCount 字符个数
     * @param lineCount 字符干扰线条数
     */
    public SCaptchaValidator(int width, int height, int codeCount, int lineCount) {
        this.width = width;
        this.height = height;
        this.codeCount = codeCount;
        this.lineCount = lineCount;
    }
   public void createCode(){
       //字符宽度
       int codeX = 0;
       //字体高度
       int fontHeight = 0;
       // 字体的高度
       fontHeight = height - 5;
       //每个字符的宽度
       codeX = width / (codeCount + 3);
       // 图像buffer
       bufferedImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
       Graphics2D g = bufferedImg.createGraphics();
       // 将图像填充为白色
       g.setColor(Color.WHITE);
       g.fillRect(0, 0, width, height);
       // 创建字体
       ImgFontByte imgFont = new ImgFontByte();
       Font font = imgFont.getFont(fontHeight);
       g.setFont(font);

       StringBuffer randomCode = new StringBuffer();
       // 随机产生验证码字符
       for (int i = 0; i < codeCount; i++) {
           String strRand = String.valueOf(codeSequence[random.nextInt(codeSequence.length)]);
           // 设置字体颜色
           g.setColor(getRandomColor());
           // 设置字体位置
           g.drawString(strRand, (i + 1) * codeX, getRandomNumber(height / 2) + 25);
           randomCode.append(strRand);
       }
       code = randomCode.toString();
   }
    /** 获取随机颜色 */
    private Color getRandomColor() {
        int r = getRandomNumber(255);
        int g = getRandomNumber(255);
        int b = getRandomNumber(255);
        return new Color(r, g, b);
    }
    /** 获取随机数 */
    private int getRandomNumber(int number) {
        return random.nextInt(number);
    }
    public void write(String path) throws IOException {
        OutputStream sos = new FileOutputStream(path);
        this.write(sos);
    }
    public void write(OutputStream sos) throws IOException {
        ImageIO.write(bufferedImg, "png", sos);
        sos.flush();
        sos.close();
    }
    public BufferedImage getBufferedImg(){
        return bufferedImg;
    }
    public String getCode() {
        return code;
    }
}
