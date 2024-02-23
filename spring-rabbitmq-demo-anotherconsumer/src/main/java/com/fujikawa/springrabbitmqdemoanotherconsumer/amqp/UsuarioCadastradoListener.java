package com.fujikawa.springrabbitmqdemoanotherconsumer.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fujikawa.springrabbitmqdemoanotherconsumer.dtos.UsuarioDTO;

@Component
public class UsuarioCadastradoListener {

    @RabbitListener(queues = "usuario.cadastrado.fazeroutracoisa")
    public void receberMensagem(UsuarioDTO usuario) {
        
        String mensagem = String.format(
            "Usuário Id '%s' cadastrado com login '%s'...\n" + 
            "Fazendo qualquer outra coisa...",
            usuario.getId(),
            usuario.getLogin());
        System.out.println(mensagem);
    }
}
