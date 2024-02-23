package com.fujikawa.springrabbitmqdemoconsumer.dtos;

import java.util.UUID;

public class UsuarioDTO {

    private UUID id;

    private String login;

    private String senha;

    private String email;

    public UsuarioDTO(UUID id, String login, String senha, String email) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", email=" + email + "]";
    }
}

