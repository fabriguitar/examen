package hn.unah.examen.servicios;

import java.util.List;


import hn.unah.examen.modelos.Vehiculos;

public interface VehiculoService {
    public Vehiculos crearVehiculo(Vehiculos vehiculos);

     public List<Vehiculos> obtenerVehiculos();
}
