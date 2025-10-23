package com.example.word_pdf_payment.util;

public class Util {

    public static String null2String(String s) {
        return s == null ? "" : s;
    }
    public static String ObjectAddStr(Object s) {
        if(s == null || s.equals("null") || s.equals("")){
            return "";
        }
        return s+"";
    }

}
