package com.hari.rdhp.hari.project;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface slf4j {
	Logger log = LoggerFactory.getLogger(App.class);
	
	String value() default "";

}
