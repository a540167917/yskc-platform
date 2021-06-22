import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import org.junit.Test;

public class MybatisGenerator {
    @Test
    public void autoGenerate() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //项目位置
        String projectPath = "E:\\公司名字\\云上科创科技有限公司\\项目开发\\云上聊天项目\\云上科创管理平台\\2020-11-3\\yskc-platform";
        gc.setOutputDir(projectPath);
        gc.setAuthor("zgl");
        // 配置是否打开目录，false 为不打开（可选）
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        // 重新生成文件时是否覆盖，false 表示不覆盖（可选）
        gc.setFileOverride(true);
        // 配置主键生成策略，此处为 ASSIGN_ID（可选）
        gc.setIdType(IdType.ASSIGN_ID);
        // 配置日期类型，此处为 ONLY_DATE（可选）
        gc.setDateType(DateType.ONLY_DATE);

        gc.setSwagger2(true);
        // 默认生成的 service 会有 I 前缀
        gc.setServiceName("%sService");
        mpg.setGlobalConfig(gc);

        //包名配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName("yskc-platform");
        packageConfig.setParent("com.platform");
        mpg.setPackageInfo(packageConfig);

        // 数据源配置（需要修改）
        DataSourceConfig dsc = new DataSourceConfig();
        // 配置数据库 url 地址
        dsc.setUrl("jdbc:mysql://localhost:3306/db_ys_kc?serverTimezone=UTC");
//        // dsc.setSchemaName("testMyBatisPlus"); // 可以直接在 url 中指定数据库名
//        // 配置数据库驱动
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        // 配置数据库连接用户名
//        dsc.setUsername("root");
//        // 配置数据库连接密码
//        dsc.setPassword("aB123!45C");
//        mpg.setDataSource(dsc);
//        //模块名字
//        String pmsString1;
//        String pmsString2;
//        String pmsString3;
//        String pmsString4;
//        String pmsString5;
//
//        pmsString1 = "pms-mapper";
//        pmsString2 = "pms-controller";
//        pmsString3 ="pms-service";
//        pmsString4 = "pms-impl-provider";
//        pmsString5 = "pms-api";
//
//        //模块包名字
//        String pmsPage = "dl";
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("");
//        pc.setEntity("com.ys.kc."+pmsPage+".entity");
//        pc.setMapper("com.ys.kc."+pmsPage+".mapper");
//        pc.setService("com.ys.kc."+pmsPage+".service");
//        pc.setServiceImpl("com.ys.kc."+pmsPage+".service.impl");
//        pc.setController("com.ys.kc."+pmsPage+".controller");
//        mpg.setPackageInfo(pc);
//
//       // 自定义配置
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                // to do nothing
//            }
//        };
//        // 如果模板引擎是 freemarker
//        String templatePath = "/templates/mapper.xml.ftl";
//
//        // 自定义输出配置
//        List<FileOutConfig> focList = new ArrayList<>();
//        // 自定义配置会被优先输出
//        if(!pmsString1.equals("")){
//            focList.add(new FileOutConfig(templatePath) {
//                @Override
//                public String outputFile(TableInfo tableInfo) {
//                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                    return projectPath + "/"+pmsString1+"/src/main/resources/com/ys/kc/"+pmsPage+"/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//                }
//            });
//        }
//        if(!pmsString2.equals("")){
//        focList.add(new FileOutConfig("/templates/controller.java.ftl") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                return projectPath + "/"+pmsString2+"/src/main/java/com/ys/kc/"+pmsPage+"/controller/" + tableInfo.getEntityName() + "Controller" + StringPool.DOT_JAVA;
//            }
//        });
//        }
//        if(!pmsString3.equals("")) {
//            focList.add(new FileOutConfig("/templates/service.java.ftl") {
//                @Override
//                public String outputFile(TableInfo tableInfo) {
//                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                    return projectPath + "/" + pmsString3 + "/src/main/java/com/ys/kc/" + pmsPage + "/service/" + tableInfo.getEntityName() + "Service" + StringPool.DOT_JAVA;
//                }
//            });
//        }
//        if(!pmsString4.equals("")) {
//            focList.add(new FileOutConfig("/templates/serviceImpl.java.ftl") {
//                @Override
//                public String outputFile(TableInfo tableInfo) {
//                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                    return projectPath + "/" + pmsString4 + "/src/main/java/com/ys/kc/" + pmsPage + "/service/impl/" + tableInfo.getEntityName() + "ServiceImpl" + StringPool.DOT_JAVA;
//                }
//            });
//        }
//        if(!pmsString1.equals("")) {
//            focList.add(new FileOutConfig("/templates/mapper.java.ftl") {
//                @Override
//                public String outputFile(TableInfo tableInfo) {
//                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                    return projectPath + "/" + pmsString1 + "/src/main/java/com/ys/kc/" + pmsPage + "/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_JAVA;
//                }
//            });
//        }
//        if(!pmsString5.equals("")) {
//            focList.add(new FileOutConfig("/templates/entity.java.ftl") {
//                @Override
//                public String outputFile(TableInfo tableInfo) {
//                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                    return projectPath + "/" + pmsString5 + "/src/main/java/com/ys/kc/" + pmsPage + "/entity/" + tableInfo.getEntityName() + StringPool.DOT_JAVA;
//                }
//            });
//        }
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);
//
//        // 配置模板
//        TemplateConfig templateConfig = new TemplateConfig();
//        templateConfig.setEntity(null);
//        templateConfig.setController(null);
//        templateConfig.setService(null);
//        templateConfig.setServiceImpl(null);
//        templateConfig.setMapper(null);
//        templateConfig.setXml(null);
//        mpg.setTemplate(templateConfig);
//
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setTablePrefix(pc.getModuleName() + "_");
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        //对象风格 true表示去掉get/set
//        strategy.setEntityLombokModel(true);
//        //对象风格 true表示以RestController
//        strategy.setRestControllerStyle(true);
//        strategy.setInclude("pms_admin");
//        strategy.setControllerMappingHyphenStyle(false);
//        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//        mpg.execute();
    }
}
