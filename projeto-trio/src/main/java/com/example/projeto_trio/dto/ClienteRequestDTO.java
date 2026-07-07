package com.example.projeto_trio.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ClienteRequestDTO {

    @NotBlank(message = "Nome é obrigatório ❌")
    private String nome;

    @NotBlank(message = "Telefone é obrigatório ❌")
    @Email(message = "Informe um e-mail válido ❌")
    private String email;

    @NotBlank(message = "Telefone é obrigatório ❌")
    @Size(min = 11, message = "Informe DDD + Números ❌")
    private String telefone;

    @NotBlank(message = "CPF é obrigário e deve Conter 11 dígitos ❌")
    @Size(max = 11, message = "CPF deve Conter 11 dígitos ❌")
    private String cpf;

    public ClienteRequestDTO() {
    }

    public ClienteRequestDTO(String nome, String email, String telefone, String cpf) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public @NotBlank(message = "Nome é obrigatório ❌") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório ❌") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Telefone é obrigatório ❌") @Email(message = "Informe um e-mail válido ❌") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Telefone é obrigatório ❌") @Email(message = "Informe um e-mail válido ❌") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Telefone é obrigatório ❌") @Size(min = 11, message = "Informe DDD + Números ❌") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigatório ❌") @Size(min = 11, message = "Informe DDD + Números ❌") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "CPF é obrigário e deve Conter 11 dígitos ❌") @Size(max = 11, message = "CPF deve Conter 11 dígitos ❌") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF é obrigário e deve Conter 11 dígitos ❌") @Size(max = 11, message = "CPF deve Conter 11 dígitos ❌") String cpf) {
        this.cpf = cpf;
    }
}
