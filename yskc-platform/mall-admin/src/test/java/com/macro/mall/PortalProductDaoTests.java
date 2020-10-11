package com.macro.mall;

import com.zscat.mall.admin.validator.SCaptchaValidator;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * https://gitee.com/zscat-platform/mall on 2018/8/27.
 * 前台商品查询逻辑单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PortalProductDaoTests {
    public static void main(String[] args) {
        SCaptchaValidator instance = new SCaptchaValidator(120,40,4,5);
        instance.createCode();
        System.out.println(instance.getCode());
    }
}
