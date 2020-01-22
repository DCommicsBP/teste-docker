package br.com.compasso.data.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.data.infraestructure.entity.Sede;

@Repository
public interface SedeRepository extends JpaRepository<Sede, Integer>{

}
