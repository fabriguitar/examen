package hn.unah.examen.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Vehiculos {
    
         @Id
        @Column(name = "idVehiculo")
        private int idvehiculo;

  private String marca;

  private int anio;

  private boolean disponible;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idTipoVehiculo")
  private Tipovehiculo tipovehiculo;

}
