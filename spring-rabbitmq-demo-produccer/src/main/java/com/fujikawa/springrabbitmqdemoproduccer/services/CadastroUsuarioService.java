package com.fujikawa.springrabbitmqdemoproduccer.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.fujikawa.springrabbitmqdemoproduccer.entities.Usuario;

@Service
public class CadastroUsuarioService {

    private RabbitTemplate rabbitTemplate;

    public CadastroUsuarioService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public Usuario cadastrar(Usuario usuario) {

        enviarParaRabbit(usuario);

        return usuario;
    }

    private void enviarParaRabbit(Usuario usuario) {

        rabbitTemplate.convertAndSend("usuario.cadastrado", usuario);
   }
}
