package com.fujikawa.springrabbitmqdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fujikawa.springrabbitmqdemo.entities.Usuario;
import com.fujikawa.springrabbitmqdemo.services.CadastroUsuarioService;

@SpringBootApplication
public class SpringRabbitmqDemoApplication implements CommandLineRunner {

	private CadastroUsuarioService service;

	public SpringRabbitmqDemoApplication(CadastroUsuarioService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		cadastrarUsuario();
	}

	private void cadastrarUsuario() {
		
		Usuario usuario = new Usuario("Usuário 3", "padrao123", "usuario1@email.com");
		service.cadastrar(usuario);
	}

}
