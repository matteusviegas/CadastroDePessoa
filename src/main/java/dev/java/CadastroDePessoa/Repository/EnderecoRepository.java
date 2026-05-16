package dev.java.CadastroDePessoa.Repository;

import dev.java.CadastroDePessoa.Model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long> {
}