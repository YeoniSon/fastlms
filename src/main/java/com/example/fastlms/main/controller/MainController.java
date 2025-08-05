package com.example.fastlms.main.controller;

// MainPage 클래스를 만드는 목적!!
// 매핑을 하기 위해서...
// 주소와(논리적인 주소 인터넷 주소) 물리적인 파일 (프로그래밍을 해야 하니깐) 매핑

// 하나의 주소에 대해서
// 어디서 매핑? 누가 매핑?
// 후보군? 클래스, 속성, 메소드

// http://localhost:8080/

import com.example.fastlms.components.MailComponents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MailComponents mailComponents;

    @RequestMapping("/") // 요청 매핑
    public String index() {

        return "index";
    }

    // 스프링 -> MVC (View -> 템플릿엔진 화면에 내용을 출력(html)
    // .NET -> MVC (View -> 출력)
    // python diango -> MTV(Template -> 화면 내용 출력)
    // 백엔드 -> View (화면에 보여진 부분) -> 프론트
    // View -> HTML ==> 웹페이지가
    // V -> json ==> API


    // request -> WEB -> SERVER
    // response -> SERVER -> WEB



    @RequestMapping("/error/denied")
    public String errorDenied() {
        return "error/denied";
    }
}
