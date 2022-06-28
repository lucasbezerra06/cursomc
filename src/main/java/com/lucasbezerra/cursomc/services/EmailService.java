package com.lucasbezerra.cursomc.services;

import com.lucasbezerra.cursomc.damain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {
    void sendOrderConfirmationEmail(Pedido obj);
    void sendEmail(SimpleMailMessage msg);
}
