package gitspringboot.config.util;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: qiusp
 * @Description: 代码生成器
 * @Date: 2023/2/25 15:09
 */
public class GeneratorConfigssss {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://218.244.154.125:3306/pcos?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&serverTimezone=GMT%2B8&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true&allowMultiQueries=true","root","uddata123")
                // 全局配置
                .globalConfig((scanner, builder) -> builder
                        .author(scanner.apply("qiusp"))
                        .fileOverride()
                        // 开启 swagger 模式
                        .enableSwagger()
                        // 覆盖已生成文件
                        .fileOverride()
                        //禁止打开输出目录
                        .disableOpenDir()
                        //配置时间
                        .commentDate("yyyy-MM-dd")
                        // 指定输出目录
                        .outputDir(System.getProperty("G://generatorFile")+"/test")
                )
                // 包配置
                .packageConfig(builder -> {
                    // 设置父包名
                    builder.parent("com.demo.richText")
                            .entity("entity")
                            .controller("controller")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .pathInfo(Collections.singletonMap(OutputFile.mapper,System.getProperty("G://generatorFile")+"/test/mapper")); // 设置mapperXml生成路径
                })
                // 策略配置
                .strategyConfig((scanner, builder) -> builder
                        .addInclude(scanner.apply("请输入表名，多个英文逗号分隔:"))
                        //Entity 配置
                        .entityBuilder()
                        .formatFileName("%sEntity")
                        .enableLombok()
                        // .superClass(BaseEntity.class)
                        .disableSerialVersionUID()
                        .enableChainModel()
                        .enableTableFieldAnnotation()
                        .enableActiveRecord()
                        .naming(NamingStrategy.no_change)
                        .columnNaming(NamingStrategy.underline_to_camel)
                        .idType(IdType.AUTO)
                        //controller 配置
                        .controllerBuilder()
                        .formatFileName("%sController")
                        .enableRestStyle()
                        .enableHyphenStyle()
                        // .superClass(BladeController.class)
                        //service 配置
                        .serviceBuilder()
                        .formatServiceFileName("%sService")
                        // .superServiceClass(BaseServiceImpl.class)
                        .formatServiceImplFileName("I%sServiceImpl")
                        // .superServiceImplClass(BaseService.class)
                        //mapper 配置
                        .mapperBuilder()
                        .formatMapperFileName("%sMapper")
                        .superClass(BaseMapper.class)
                        .enableMapperAnnotation()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .formatXmlFileName("%sMapper")
                        .build())
                // .templateEngine(new FreemarkerTemplateEngine())
                        .execute();
    }


    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }

}
