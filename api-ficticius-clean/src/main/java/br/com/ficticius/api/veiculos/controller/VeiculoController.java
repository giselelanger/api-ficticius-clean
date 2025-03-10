package br.com.ficticius.api.veiculos.controller;
import br.com.ficticius.api.veiculos.domain.VeiculoService;
import br.com.ficticius.api.veiculos.domain.model.Veiculo;
import br.com.ficticius.api.veiculos.domain.model.dto.*;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/veiculos")


public class VeiculoController {
    private final VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo vehicle) {
        return service.saveVehicle(vehicle);
    }
    

    @GetMapping("/calcular-gastos")
    public List<VeiculoDTO> calcularGastos(@RequestBody CalculadoraRequest request) {
        return service.calcularGastos(request);
    }
}