package hn.unah.examen.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.modelos.Cliente;
import hn.unah.examen.servicios.serviciosImpl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private ClienteServiceImpl clienteServiceImpl;
    
    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente){

        return this.clienteServiceImpl.crearCliente(cliente);
    }

     @GetMapping("/obtener/todos")
   public List<Cliente> obtenertodosclientes(){
    return this.clienteServiceImpl.obtenerClientes();
   }

   @GetMapping("/buscar{idcliente}")
  public String buscarCliente(@RequestParam(name = "idcliente")Integer idcliente){
    String cliente = clienteServiceImpl.buscarCliente(idcliente);

    if (cliente != null) {
      return "cliente :"+cliente;
      
    }
    return "no se encontro"+idcliente;
  }

}
