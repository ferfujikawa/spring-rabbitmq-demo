package com.fujikawa.springrabbitmqdemoproduccer.dtos;

import java.util.UUID;

public class UsuarioDTO {

    private UUID id;

    private String login;

    private String senha;

    private String email;

    public UsuarioDTO(String login, String senha, String email) {

        this.id = UUID.randomUUID();
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }
}
