package br.com.ficticius.api.veiculos.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ficticius.api.veiculos.domain.model.Veiculo;
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
	
}