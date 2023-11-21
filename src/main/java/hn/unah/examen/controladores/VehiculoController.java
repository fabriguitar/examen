package hn.unah.examen.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hn.unah.examen.modelos.Vehiculos;
import hn.unah.examen.servicios.serviciosImpl.VehiculoServiceImpl;

public class VehiculoController {

    private VehiculoServiceImpl vehiculoServiceImpl;
     
    @PostMapping("/crear")
    public Vehiculos crearVehiculos(@RequestBody Vehiculos vehiculos) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculos);
    }
    
    @GetMapping("/obtener/todos")
    public List<Vehiculos> obtenerVehiculos(){
        return this.vehiculoServiceImpl.obtenerVehiculos();
    }
}
