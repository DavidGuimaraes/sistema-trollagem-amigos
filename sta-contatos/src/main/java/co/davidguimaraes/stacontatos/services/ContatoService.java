package co.davidguimaraes.stacontatos.services;

import co.davidguimaraes.stacontatos.models.Contato;
import co.davidguimaraes.stacontatos.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository dao;

    public Page<Contato> findAll(Pageable pageable){
        return this.dao.findAll(pageable);
    }

    public Contato findById(BigInteger id) throws Exception{
        Optional<Contato> contatoSalvo = this.dao.findById(id);
        if(contatoSalvo.isPresent()){
            return contatoSalvo.get();
        }else {
            throw new Exception("Não foi encontrada um contato com o id informado");
        }
    }
}
