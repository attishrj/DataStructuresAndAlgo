package com.abstractinfo.and.interfaceinfo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface SmartPhones {
String OS();
int version();
}
