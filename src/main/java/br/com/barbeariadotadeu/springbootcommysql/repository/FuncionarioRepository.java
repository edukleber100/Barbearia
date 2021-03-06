package br.com.barbeariadotadeu.springbootcommysql.repository;

import br.com.barbeariadotadeu.springbootcommysql.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
