<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#list table.pkColumns as column>
<#assign pkJavaType = column.javaType>
</#list>
package ${basepackage}.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "${table.sqlName}")
public class ${className}  implements java.io.Serializable{
    private static final long serialVersionUID = 1L;

<@generateFields/>
<@generateGetAndSet/>
}
<#macro generateFields>
<#list table.columns as column>
    /**
     * ${column.columnAlias!}
     */
    <#if column.pk>
    @Id
    <#else>
    <#if column.sqlName==column.columnNameLower>
    @Column
    <#else>
    @Column(name="${column.sqlName}")
    </#if>
    </#if>
    private ${column.simpleJavaType} ${column.columnNameLower};
</#list>

</#macro>

<#macro generateGetAndSet>
<#list table.columns as column>

    public void set${column.columnName}(${column.simpleJavaType} ${column.columnNameLower}) {
        this.${column.columnNameLower} = ${column.columnNameLower};
    }

    public ${column.simpleJavaType} get${column.columnName}() {
        return this.${column.columnNameLower};
    }
</#list>
</#macro>
