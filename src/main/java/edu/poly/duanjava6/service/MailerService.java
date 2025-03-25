package edu.poly.duanjava6.service;

import edu.poly.duanjava6.bean.MailInfo;
import jakarta.mail.MessagingException;

public interface MailerService {
    public void send(MailInfo mail) throws MessagingException;

    public void send(String to, String subject, String body) throws MessagingException;

    void queue(MailInfo mail) throws MessagingException;

    void queue(String to, String subject, String body) throws MessagingException;
}
