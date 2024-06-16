package com.example.smupool.controller;

import com.example.smupool.apiPayload.BaseResponse;
import com.example.smupool.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @GetMapping("/")
    public BaseResponse<String> test() {
        return BaseResponse.onSuccess("성공");
    }

    @GetMapping("/failed")
    public BaseResponse<String> failedTest() {
        testService.failedTest();
        return BaseResponse.onSuccess("성공!");
    }
}
