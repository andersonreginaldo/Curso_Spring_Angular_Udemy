package io.github.andersonerginaldo.clientes.model.repository;

import io.github.andersonerginaldo.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
