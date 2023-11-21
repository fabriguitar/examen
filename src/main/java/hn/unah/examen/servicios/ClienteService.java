package hn.unah.examen.servicios;

import java.util.List;

import hn.unah.examen.modelos.Cliente;

public interface ClienteService {
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public String buscarCliente(Integer id);
}
