package com.example.smupool.apiPayload.code.exception.handler;

import com.example.smupool.apiPayload.code.BaseErrorCode;
import com.example.smupool.apiPayload.code.exception.GeneralException;

public class MemberHandler extends GeneralException{
    public MemberHandler(BaseErrorCode code) {
        super(code);
    }
}
