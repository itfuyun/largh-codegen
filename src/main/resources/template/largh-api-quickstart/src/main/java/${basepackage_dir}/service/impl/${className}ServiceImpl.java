<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#list table.pkColumns as column>
<#assign pkJavaType = column.simpleJavaType>
</#list>
package ${basepackage}.service.impl;

import ${basepackage}.common.base.BaseServiceImpl;
import ${basepackage}.service.${className}Service;
import ${basepackage}.domain.${className};
import ${basepackage}.repository.${className}Repository;
import org.springframework.stereotype.Service;

@Service
public class ${className}ServiceImpl extends BaseServiceImpl<${className},${pkJavaType},${className}Repository> implements ${className}Service{
}
