package hn.unah.examen.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tipovehiculo {

     @Id
     @Column(name = "idTipoVehiculo")
    private int idtipovehiculo;

    private String descripcion;

    private double precioxhora;
     
    @OneToMany(mappedBy = "vehiculos", cascade = CascadeType.ALL)
    private List<Vehiculos>vehiculos = new ArrayList<>();
}
