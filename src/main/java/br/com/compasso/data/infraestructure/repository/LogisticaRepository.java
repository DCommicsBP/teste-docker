package br.com.compasso.data.infraestructure.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.compasso.data.infraestructure.entity.Logistica;

@Repository
public interface LogisticaRepository extends JpaRepository<Logistica, Integer>{
	@Transactional
    default Logistica saveAndHydrate(Logistica save) {
        return this.save(this.save(save));
    }
}
