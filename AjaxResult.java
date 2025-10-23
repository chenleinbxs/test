package com.example.word_pdf_payment.util;

import java.io.InputStream;
import java.io.OutputStream;

public class AjaxResult {


    private InputStream in;

    private OutputStream out;

    private String code;

    private String infile;

    private String outfile;

    private String workflowid;

    private String requestid;

    public String getInfile() {
        return infile;
    }

    public void setInfile(String infile) {
        this.infile = infile;
    }

    public String getOutfile() {
        return outfile;
    }

    public void setOutfile(String outfile) {
        this.outfile = outfile;
    }

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public OutputStream getOut() {
        return out;
    }

    public void setOut(OutputStream out) {
        this.out = out;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWorkflowid() {
        return workflowid;
    }

    public void setWorkflowid(String workflowid) {
        this.workflowid = workflowid;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "in=" + in +
                ", out=" + out +
                ", code='" + code + '\'' +
                ", infile='" + infile + '\'' +
                ", outfile='" + outfile + '\'' +
                ", workflowid='" + workflowid + '\'' +
                ", requestid='" + requestid + '\'' +
                '}';
    }
}
