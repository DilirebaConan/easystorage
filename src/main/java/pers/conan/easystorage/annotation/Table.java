package pers.conan.easystorage.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解：表
 */
@Target(ElementType.TYPE)  // 给类作注解
@Retention(RetentionPolicy.RUNTIME)  // 注解保留到运行环境里
public @interface Table {
    String name() default "";  // 表名
    String alias() default "";  // 表的别名
}
