package com.alessandrajulia.apitreinamento.repository;

import com.alessandrajulia.apitreinamento.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}