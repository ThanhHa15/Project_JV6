package edu.poly.duanjava6.bean;

import java.io.File;
import java.util.List;

public class MailInfo {
    private String from = "vuhhps38859@gmail.com", to, cc[], bcc[], subject, body;
    private List<File> attachments;

    public MailInfo(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
