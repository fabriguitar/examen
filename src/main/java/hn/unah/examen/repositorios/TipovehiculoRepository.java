package hn.unah.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.modelos.Tipovehiculo;

public interface TipovehiculoRepository extends  JpaRepository <Tipovehiculo, Integer>{
    
}
