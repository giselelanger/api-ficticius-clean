package br.com.ficticius.api.veiculos.domain;
import br.com.ficticius.api.veiculos.domain.model.Veiculo;
import br.com.ficticius.api.veiculos.domain.model.dto.CalculadoraRequest;
import br.com.ficticius.api.veiculos.domain.model.dto.VeiculoDTO;
import br.com.ficticius.api.veiculos.domain.repository.VeiculoRepository;

import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

	private final VeiculoRepository repository;
    public VeiculoService(VeiculoRepository repository) {
        this.repository = repository;
    }
    public Veiculo saveVehicle(Veiculo vehicle) {
        return repository.save(vehicle);
    }

    public List<VeiculoDTO> calcularGastos(CalculadoraRequest request) {
        return repository.findAll().stream()
            .map(v -> new VeiculoDTO(
                v.getNome(),
                v.getMarca(), 
                v.getModelo(),
                String.valueOf(v.getDataFabricacao().getYear()),
                qtdeCombustivelGasto(v, request),
                calcularValorGasto(v, request)
            ))
            .sorted(Comparator.comparingDouble(VeiculoDTO::getValorGasto))
            .collect(Collectors.toList());
    }

    private double qtdeCombustivelGasto(Veiculo v, CalculadoraRequest request) {
        return (request.getKmCidade() / v.getConsumoCidade()) + 
               (request.getKmRodovia() / v.getConsumoRodovia());
    }

    private double calcularValorGasto(Veiculo v, CalculadoraRequest request) {
        return qtdeCombustivelGasto(v, request) * request.getPrecoGasolina();
    }

}