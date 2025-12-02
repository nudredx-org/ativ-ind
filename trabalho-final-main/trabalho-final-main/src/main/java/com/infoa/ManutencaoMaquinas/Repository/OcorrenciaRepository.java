package com.infoa.ManutencaoMaquinas.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infoa.ManutencaoMaquinas.Models.Ocorrencia;
@Repository
public interface OcorrenciaRepository extends JpaRepository <Ocorrencia, Integer> {
}
