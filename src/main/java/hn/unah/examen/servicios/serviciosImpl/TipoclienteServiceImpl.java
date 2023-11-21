package hn.unah.examen.servicios.serviciosImpl;

import org.springframework.stereotype.Service;

import hn.unah.examen.modelos.Tipocliente;
import hn.unah.examen.repositorios.TipoclienteRepository;
import hn.unah.examen.servicios.TipoclienteService;

@Service
public class TipoclienteServiceImpl implements TipoclienteService{

private TipoclienteRepository tipoclienteRepository;

@Override
public Tipocliente crearTipocliente(Tipocliente tipocliente) {
       tipoclienteRepository.save(tipocliente);
        return tipocliente;
    }
}


    

