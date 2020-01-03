package com.springcloud.mails;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailHelper {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String account;

    /**
     * 发送html邮件
     * @param from						发件人名称
     * @param to						收件邮箱
     * @param title						标题
     * @param content					内容
     * @throws MessagingException
     * @throws UnsupportedEncodingException
     */
    public void sendHTMLMail(String from, String to, String title, String content)throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        // 发件人：from <account>
        helper.setFrom(new InternetAddress(MimeUtility.encodeText(from) + "<" + this.account + ">"));
        helper.setTo(to);
        helper.setSubject(title);
        helper.setText(content, true);	//设置内容，第二个boolean参数表示内容是否为 html 格式的文件。
        javaMailSender.send(message);
    }
}
