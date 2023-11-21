package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Tipocliente;

public interface TipoclienteRepository extends JpaRepository <Tipocliente, Integer> {
    
}
