package com.study.deployment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/main")
public class MainController {

    String version = "2.0.1";

    @GetMapping
    public String checkVersion(){
        String msg = "현재 애플리케이션의 버전은 "+version+" 입니다\n" +
                "지금은 jenkins 파이프라인 구축 테스트 중입니다.";

        return msg;
    }
}
