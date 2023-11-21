package hn.unah.examen.servicios.serviciosImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.modelos.Cliente;
import hn.unah.examen.repositorios.ClienteRepository;
import hn.unah.examen.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

   @Autowired 
  private ClienteRepository clienteRepository;

@Override
public Cliente crearCliente(Cliente cliente) {
    clienteRepository.save(cliente);
    return cliente;
}

@Override
public List<Cliente> obtenerClientes() {
    return this.clienteRepository.findAll();
}

@Override
public String buscarCliente(Integer id) {
    Optional<Cliente> optionalCliente = this.clienteRepository.findById(id);
   if(optionalCliente.isPresent()){
    return "el cliente es :"+optionalCliente.get();
   }
   return "no se encontro"+id;
}
}

