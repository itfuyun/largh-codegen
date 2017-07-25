<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#list table.pkColumns as column>
<#assign pkJavaType = column.simpleJavaType>
</#list>
package ${basepackage}.repository;

import ${basepackage}.domain.${className};
import org.springframework.data.jpa.repository.JpaRepository;


public interface ${className}Repository extends JpaRepository<${className}, ${pkJavaType}> {
}