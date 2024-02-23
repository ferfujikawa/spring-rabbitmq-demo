package com.fujikawa.springrabbitmqdemoconsumer.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fujikawa.springrabbitmqdemoconsumer.dtos.UsuarioDTO;

@Component
public class UsuarioCadastradoListener {

    @RabbitListener(queues = "usuario.cadastrado.enviaremail")
    public void receberMensagem(UsuarioDTO usuario) {
        
        if (usuario.getEmail().isEmpty()) {
            throw new RuntimeException("E-mail vazio");
        }

        String mensagem = String.format(
            "Usuário Id '%s' cadastrado com login '%s'...\n" + 
            "Enviando e-mail com dados de acesso para %s...",
            usuario.getId(),
            usuario.getLogin(),
            usuario.getEmail());
        System.out.println(mensagem);
    }
}
