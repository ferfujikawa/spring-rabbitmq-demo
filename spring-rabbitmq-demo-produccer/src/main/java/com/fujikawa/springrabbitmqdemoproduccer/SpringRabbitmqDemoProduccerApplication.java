package com.fujikawa.springrabbitmqdemoproduccer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fujikawa.springrabbitmqdemoproduccer.dtos.UsuarioDTO;
import com.fujikawa.springrabbitmqdemoproduccer.services.CadastroUsuarioService;

@SpringBootApplication
public class SpringRabbitmqDemoProduccerApplication implements CommandLineRunner {

	private CadastroUsuarioService service;

	public SpringRabbitmqDemoProduccerApplication(CadastroUsuarioService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRabbitmqDemoProduccerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		cadastrarUsuario();
	}

	private void cadastrarUsuario() {
		
		UsuarioDTO usuario = new UsuarioDTO("Usuário 3", "padrao123", "usuario1@email.com");
		service.cadastrar(usuario);
	}

}
