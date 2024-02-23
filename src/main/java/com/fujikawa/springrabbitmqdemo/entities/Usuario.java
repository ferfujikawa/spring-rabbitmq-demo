package com.fujikawa.springrabbitmqdemo.entities;

import java.util.UUID;

public class Usuario {

    private UUID id;

    private String login;

    private String senha;

    private String email;

    public Usuario(String login, String senha, String email) {

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

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", email=" + email + "]";
    }
}
