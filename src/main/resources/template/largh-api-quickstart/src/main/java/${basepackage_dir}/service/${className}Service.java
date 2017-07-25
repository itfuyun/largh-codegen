<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#list table.pkColumns as column>
<#assign pkJavaType = column.simpleJavaType>
</#list>
package ${basepackage}.service;

import ${basepackage}.common.base.BaseService;
import ${basepackage}.domain.${className};

public interface ${className}Service extends BaseService<${className},${pkJavaType}>{
}
