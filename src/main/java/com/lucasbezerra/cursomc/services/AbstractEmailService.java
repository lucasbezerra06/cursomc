package com.lucasbezerra.cursomc.services;

import com.lucasbezerra.cursomc.domain.Cliente;
import com.lucasbezerra.cursomc.domain.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Date;

public abstract class AbstractEmailService implements EmailService{

    @Value("${default.sender}")
    private String sender;

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendOrderConfirmationEmail(Pedido obj) {
        SimpleMailMessage msg = prepareSimpleMailMessageFromPedido(obj);
        sendEmail(msg);
    }

    @Override
    public void sendOrderConfirmationHtmlEmail(Pedido obj) {
        try {
            MimeMessage mm = prepareMimeMessageFromPedido(obj);
            sendHtmlEmail(mm);
        } catch (MessagingException e) {
            sendOrderConfirmationEmail(obj);
        }

    }

    protected SimpleMailMessage prepareSimpleMailMessageFromPedido(Pedido obj){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(obj.getCliente().getEmail());
        msg.setFrom(sender);
        msg.setSubject("Pedido confirmado! Código: " + obj.getId());
        msg.setSentDate(new Date(System.currentTimeMillis()));
        msg.setText(obj.toString());

        return msg;
    }

    protected MimeMessage prepareMimeMessageFromPedido(Pedido obj) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mmh = new MimeMessageHelper(mimeMessage, true);
        mmh.setTo(obj.getCliente().getEmail());
        mmh.setFrom(sender);
        mmh.setSubject("Pedido confirmado! Código: " + obj.getId());
        mmh.setSentDate(new Date(System.currentTimeMillis()));
        mmh.setText(htmlFromTemplatePedido(obj), true);

        return mimeMessage;
    }

    protected String htmlFromTemplatePedido(Pedido obj){
        Context context = new Context();
        context.setVariable("pedido", obj);
        return templateEngine.process("email/confirmacaoPedido", context);
    }

    @Override
    public void sendNewPasswordEmail(Cliente cliente, String newPass) {
        SimpleMailMessage msg = prepareNewPasswordEmail(cliente, newPass);
        sendEmail(msg);
    }

    protected SimpleMailMessage prepareNewPasswordEmail(Cliente cliente, String newPass) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(cliente.getEmail());
        msg.setFrom(sender);
        msg.setSubject("Solicitação de nova senha");
        msg.setSentDate(new Date(System.currentTimeMillis()));
        msg.setText("Nova senha: " + newPass);

        return msg;
    }
}
