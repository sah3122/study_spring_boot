package me.study.springbootautowired;

import java.lang.annotation.*;

//Annotation 사용시 Retentionpolicy를 class 이상으로 적용해야 한다.Class파일까지 남아있어야 하기 때문에
// 기본값 class
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@Documented
public @interface PerfLogging {

}
