package com.lucasbezerra.cursomc;

import com.lucasbezerra.cursomc.damain.*;
import com.lucasbezerra.cursomc.damain.enums.EstadoPagamento;
import com.lucasbezerra.cursomc.damain.enums.TipoCliente;
import com.lucasbezerra.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {}
}
