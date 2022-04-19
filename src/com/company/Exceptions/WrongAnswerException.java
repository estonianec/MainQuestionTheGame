package com.company.Exceptions;

import java.io.IOException;

public class WrongAnswerException extends IOException {
    public WrongAnswerException() {
        super();
    }

    public WrongAnswerException(String s) {
        super(s);
    }
}
