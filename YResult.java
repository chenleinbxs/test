package com.example.word_pdf_payment.util;

public class YResult {

    private String code = "404";
    private String ybdh;
    private String outurl;
    private String cfdd;
    private String po;
    public String getCfdd() {
        return cfdd;
    }

    public void setCfdd(String cfdd) {
        this.cfdd = cfdd;
    }

    public String getYbdh() {
        return ybdh;
    }

    public void setYbdh(String ybdh) {
        this.ybdh = ybdh;
    }

    public String getOuturl() {
        return outurl;
    }

    public void setOuturl(String outurl) {
        this.outurl = outurl;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPo() {
        return po;
    }

    public void setPo(String po) {
        this.po = po;
    }
}
