package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}
