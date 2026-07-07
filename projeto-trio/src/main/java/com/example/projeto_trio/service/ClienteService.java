package com.example.projeto_trio.service;


import com.example.projeto_trio.dto.ClienteRequestDTO;
import com.example.projeto_trio.dto.ClienteResponseDTO;
import com.example.projeto_trio.model.ClienteModel;
import com.example.projeto_trio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public List <ClienteResponseDTO> listarTodos(){
        return repository.findAll().stream().map(ClienteModel ->
                new ClienteResponseDTO(ClienteModel.getNome(),
                        ClienteModel.getEmail(),
                        ClienteModel.getTelefone())).toList();
    }
    public ClienteModel salvarCliente (ClienteRequestDTO requestDTO){
        if (repository.findBycpf(requestDTO.getCpf()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado. ❌");
        }

        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setNome(requestDTO.getNome());
        novoCliente.setEmail(requestDTO.getEmail());
        novoCliente.setTelefone(requestDTO.getTelefone());
        novoCliente.setCpf(requestDTO.getCpf());

        return  repository.save(novoCliente);
    }

    public ClienteModel atualizarCliente (Long id, ClienteRequestDTO requestDTO){
        ClienteModel novoCliente = repository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Cadastro de cliente não localizado. 🔎❌"));

        repository.findBycpf(requestDTO.getCpf()).ifPresent(clienteModel -> {
            if (!clienteModel.getId().equals(id)) {
                throw new RuntimeException("Cliente já cadastrado.❌");
            }
        });
        novoCliente.setNome(requestDTO.getNome());
        novoCliente.setEmail(requestDTO.getEmail());
        novoCliente.setTelefone(requestDTO.getTelefone());
        novoCliente.setCpf(requestDTO.getCpf());

        return  repository.save(novoCliente);
    }

    public void deletarCliente(Long id){
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cadastro de cliente não localizado.🔎❌");
        }
        repository.deleteById(id);
    }
}

