package hn.unah.examen.servicios.serviciosImpl;

import java.util.List;

import hn.unah.examen.modelos.Vehiculos;
import hn.unah.examen.repositorios.VehiculosRepository;
import hn.unah.examen.servicios.VehiculoService;

public class VehiculoServiceImpl implements VehiculoService {
    
    private VehiculosRepository vehiculosRepository;

    @Override
    public Vehiculos crearVehiculo(Vehiculos vehiculos) {
       vehiculosRepository.save(vehiculos);
       return vehiculos;
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
      return this.vehiculosRepository.findAll();
    }
}
