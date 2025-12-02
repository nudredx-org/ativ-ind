package com.infoa.ManutencaoMaquinas.Repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infoa.ManutencaoMaquinas.Models.Tecnicos;
@Repository
public interface TecnicosRepository extends JpaRepository<Tecnicos, Integer> {
}
