package org.generation.minhaEscola.repository;

import java.util.List;

import org.generation.minhaEscola.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	public List<Aluno> findAllByNomeContainigIgnoreCase(String nome);
}
