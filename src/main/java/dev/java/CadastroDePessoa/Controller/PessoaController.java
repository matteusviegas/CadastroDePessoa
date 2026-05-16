package dev.java.CadastroDePessoa.Controller;

import dev.java.CadastroDePessoa.Model.PessoaModel;
import dev.java.CadastroDePessoa.Repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaRepository repository;

    public PessoaController(PessoaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PessoaModel> listar() {
        return repository.findAll();
    }

    @PostMapping
    public PessoaModel salvar(@RequestBody PessoaModel pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("/{id}")
    public PessoaModel atualizar(@PathVariable Long id, @RequestBody PessoaModel pessoa) {
        pessoa.setId(id);
        return repository.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}