package dev.java.CadastroDePessoa.Controller;

import dev.java.CadastroDePessoa.Model.EnderecoModel;
import dev.java.CadastroDePessoa.Repository.EnderecoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    private final EnderecoRepository repository;

    public EnderecoController(EnderecoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<EnderecoModel> listar() {
        return repository.findAll();
    }

    @PostMapping
    public EnderecoModel salvar(@RequestBody EnderecoModel endereco) {
        return repository.save(endereco);
    }

    @PutMapping("/{id}")
    public EnderecoModel atualizar(@PathVariable Long id, @RequestBody EnderecoModel endereco) {
        endereco.setId(id);
        return repository.save(endereco);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}