package com.fujikawa.springrabbitmqdemoconsumer.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class UsuarioCadastradoListener {

    @RabbitListener(queues = "usuario.cadastrado")
    public void receberMensagem(Message mensagem) {
        System.out.println("Recebi a mensagem: " + mensagem.toString());
    }
}
