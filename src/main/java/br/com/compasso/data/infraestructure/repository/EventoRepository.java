package br.com.compasso.data.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.data.infraestructure.entity.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer>{

}
