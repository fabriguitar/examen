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
@Table(name = "tipocliente")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Tipocliente {

           @Column(name = "idTipoCliente")
           @Id
             private int idtipocliente;

           private String descripcion;

    @OneToMany(mappedBy = "tipoliente" ,cascade = CascadeType.ALL)
    private List<Cliente> cliente = new ArrayList<>();
}
