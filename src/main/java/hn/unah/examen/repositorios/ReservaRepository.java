package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Reserva;

public interface ReservaRepository extends JpaRepository <Reserva, Integer> {
    
}
