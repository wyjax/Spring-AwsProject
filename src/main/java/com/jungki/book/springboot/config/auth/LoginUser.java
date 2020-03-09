package com.jungki.book.springboot.config.auth;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
// 이 어노테이션이 생성될 수 있는 위이츨 지정한다. > parameter로 지정되어 있으니 메소드의 파라미터로 선언된
// 객체에서만 사용 가능
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
    // @interface : 이 파일을 어노테이션 클래스로 지정한다.
    // LoginUser 라는 어노테이션이 새로 생긴거로 보면됨
}
