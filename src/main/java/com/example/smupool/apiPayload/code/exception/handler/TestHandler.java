package com.example.smupool.apiPayload.code.exception.handler;

import com.example.smupool.apiPayload.code.BaseErrorCode;
import com.example.smupool.apiPayload.code.exception.GeneralException;

public class TestHandler extends GeneralException {
    public TestHandler(BaseErrorCode code) {
        super(code);
    }
}
