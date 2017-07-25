package com.largh;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * Created by itfuyun（itfuyun@outlook.com）
 */
public class Gen {
    public static void main(String[] args) throws Exception {
        String templatePath = "E:\\IdeaProjects\\largh-codegen\\src\\main\\resources\\template";
        GeneratorFacade g = new GeneratorFacade();
        g.getGenerator().addTemplateRootDir(templatePath);
        //删除生成器的输出目录//
        g.deleteOutRootDir();
        g.generateByAllTable();
    }
}
