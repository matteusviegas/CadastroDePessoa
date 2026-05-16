package dev.java.CadastroDePessoa.Repository;

import dev.java.CadastroDePessoa.Model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}