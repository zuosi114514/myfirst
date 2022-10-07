package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import java.io.IOException;
import java.util.Scanner;

@RestController
@Slf4j
public class DemoController {

    @RequestMapping("/test")
    public Result hhh(ServletRequest request) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        log.info(new Scanner(inputStream).useDelimiter("\\Z").next());
        return new Result(200, "OK", "wer");
    }
}
