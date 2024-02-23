package com.fujikawa.springrabbitmqdemoconsumer.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fujikawa.springrabbitmqdemoconsumer.dtos.UsuarioDTO;

@Component
public class UsuarioCadastradoListener {

    @RabbitListener(queues = "usuario.cadastrado")
    public void receberMensagem(UsuarioDTO usuario) {
        
        String mensagem = String.format(
            "Usuário Id '%s' cadastrado com login '%s'...\n" + 
            "Enviando e-mail com dados de acesso para %s...",
            usuario.getId(),
            usuario.getLogin(),
            usuario.getEmail());
        System.out.println(mensagem);
    }
}
