package com.fujikawa.springrabbitmqdemoproduccer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.fujikawa.springrabbitmqdemoproduccer.dtos.UsuarioDTO;

@Service
public class CadastroUsuarioService {

    private RabbitTemplate rabbitTemplate;

    public CadastroUsuarioService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public UsuarioDTO cadastrar(UsuarioDTO usuario) {

        enviarParaRabbit(usuario);

        return usuario;
    }

    private void enviarParaRabbit(UsuarioDTO usuario) {

        rabbitTemplate.convertAndSend("usuario.cadastrado", usuario);
   }
}
