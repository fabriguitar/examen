package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Vehiculos;

public interface VehiculosRepository extends JpaRepository <Vehiculos , Integer> {
    
}
