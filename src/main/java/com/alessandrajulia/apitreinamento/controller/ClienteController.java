package com.alessandrajulia.apitreinamento.controller;

import com.alessandrajulia.apitreinamento.model.Cliente;
import com.alessandrajulia.apitreinamento.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return  clienteRepository.save(cliente);
    }

    @DeleteMapping
    @ResponseStatus
    public void deletar(@RequestBody Cliente cliente){
        clienteRepository.delete(cliente);
    }
}
