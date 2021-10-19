package br.edu.ifce.lp2.email;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public record SmtpSendEmail(JavaMailSender mailSender) {
    
    public void apply(Set<String> receivers, String subject, String body) {
        try {

            var message = new SimpleMailMessage();
            message.setFrom("lp2.ifce@gmail.com");
            message.setTo(receivers.toArray(new String[0]));
            message.setSubject(subject);
            message.setText(body);

            mailSender.send(message);

        } catch (MailException e) {
            e.printStackTrace();
        }
    }

}
