package hn.unah.examen.modelos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
       
       @Id
       @Column(name = "idCliente")
     @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int idcliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaIngreso")
    private Date fechaingreso;

 @JsonIgnore
@ManyToOne
@JoinColumn(name ="idtipocliente", referencedColumnName = "idtipocliente")
 private Cliente cliente;



}
