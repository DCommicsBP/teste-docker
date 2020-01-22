package br.com.compasso.data.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.data.infraestructure.entity.Resposta;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Integer>{

}
