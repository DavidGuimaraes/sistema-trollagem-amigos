package co.davidguimaraes.stacontatos.resources;

import co.davidguimaraes.stacontatos.models.Contato;
import co.davidguimaraes.stacontatos.services.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api/contatos")
public class ContatoResource {

    @Autowired
    private ContatoService contatoService;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<Contato> listar(Pageable pageable) throws Exception{
        try {
            pageable = pageable.previousOrFirst();
            Page<Contato> contatos = contatoService.findAll(pageable);
            //return atividades.map(atividadeMapper::entityToDto);
            return contatos;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar dados: " + e.getMessage());
        }
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Contato pesquisarPeloId(@PathVariable(value = "id") BigInteger id) throws Exception {
        Contato contato = contatoService.findById(id);
        //return atividadeMapper.entityToDto(atividade);
        return contato;
    }
}
