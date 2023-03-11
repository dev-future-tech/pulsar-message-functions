package com.example.functions;

import com.example.model.TestMessage;
import java.util.function.Function;


public class WrapWordFunction implements Function<TestMessage, TestMessage> {

    @Override
    public TestMessage apply(TestMessage s) {
        String message = s.getMessage().toString();

        String newMsgStr = String.format("[%s]", message);
        s.setMessage(newMsgStr);
        return s;
    }
}
