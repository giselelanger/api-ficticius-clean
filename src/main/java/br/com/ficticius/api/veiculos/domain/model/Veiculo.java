package br.com.ficticius.api.veiculos.domain.model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private String modelo;
    private LocalDate dataFabricacao;
    private double consumoCidade;
    private double consumoRodovia;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public double getConsumoCidade() {
		return consumoCidade;
	}
	public void setConsumoCidade(double consumoCidade) {
		this.consumoCidade = consumoCidade;
	}
	public double getConsumoRodovia() {
		return consumoRodovia;
	}
	public void setConsumoRodovia(double consumoRodovia) {
		this.consumoRodovia = consumoRodovia;
	}
}