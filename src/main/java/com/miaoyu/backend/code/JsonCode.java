package com.miaoyu.backend.code;

public class JsonCode {
    public static int success = 10000;
    public static int error = 20000;
    public static int warring = 30000;

    public static int login(boolean isSuccess) {
        return isSuccess? success + 1: error + 1;
    }

    public static int permission(boolean isSuccess) {
        return isSuccess? success + 2: error + 2;
    }
}
