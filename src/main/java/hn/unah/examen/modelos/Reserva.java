package hn.unah.examen.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="reserva")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reserva {

     
     @Id
     @Column(name = "idReserva")
    private int idreserva;
       
    @Column(name = "idCliente")
    private int idcliente;

    private Date fecha;

    private int  idvehiculo;


    private int dias;

    private double total;


    
}
