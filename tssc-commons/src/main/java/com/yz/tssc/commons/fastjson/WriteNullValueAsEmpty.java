package com.yz.tssc.commons.fastjson;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <p>
 *
 * </p>
 *
 * @author guozy
 * @create 2019/06/24
 */
@Retention(RUNTIME)
@Target({FIELD})
public @interface WriteNullValueAsEmpty {
    String value() default "true";
}
