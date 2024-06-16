package com.example.smupool.service;

import com.example.smupool.apiPayload.code.exception.handler.TestHandler;
import com.example.smupool.apiPayload.code.status.ErrorStatus;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void failedTest() {
        if (1==1) {
            throw new TestHandler(ErrorStatus._BAD_REQUEST);
        }
    }
}
