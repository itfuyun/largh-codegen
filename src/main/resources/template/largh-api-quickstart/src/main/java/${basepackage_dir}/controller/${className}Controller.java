<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#list table.pkColumns as column>
<#assign pkJavaType = column.simpleJavaType>
<#assign pkName = column.columnNameLower>
</#list>
package ${basepackage}.controller;

import java.util.List;

import ${basepackage}.common.util.result.Result;
import ${basepackage}.common.util.result.ResultKit;
import ${basepackage}.domain.${className};
import ${basepackage}.service.${className}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${classNameLower}")
public class ${className}Controller{
    @Autowired
    private ${className}Service ${classNameLower}Service;

    @GetMapping("/getById")
    public Result getById(${pkJavaType} ${pkName}){
        ${className} ${classNameLower} = ${classNameLower}Service.getById(${pkName});
        return ResultKit.OK(${classNameLower});
    }

    @GetMapping("/list")
    public Result list(${className} ${classNameLower}){
        List<${className}> ${classNameLower}List = ${classNameLower}Service.getList(${classNameLower});
        return ResultKit.OK(${classNameLower}List);
    }

    @PostMapping("/save")
    public Result save(${className} ${classNameLower}){
        ${className} ${classNameLower}Model = ${classNameLower}Service.save(${classNameLower});
        return ResultKit.OK(${classNameLower}Model);
    }
}
