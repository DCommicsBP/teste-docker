package br.com.compasso.data.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.data.infraestructure.entity.Atividade;


@Repository
public interface AtividadeRepository extends JpaRepository<Atividade, Integer>{

}
