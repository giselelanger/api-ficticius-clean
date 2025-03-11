package br.com.ficticius.api.veiculos.domain.model.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VeiculoDTO {
    private String nome;
    private String marca;
    private String modelo;
    private String anoFabricacao;
    private double qtdeCombustivelGasto;
    private double valorGasto;
	
	public VeiculoDTO(String nome, String marca, String modelo, String anoFabricacao, double qtdeCombustivelGasto, double valorGasto) {
	    this.nome = nome;
	    this.marca = marca;
	    this.modelo = modelo;
	    this.anoFabricacao = anoFabricacao;
	    this.qtdeCombustivelGasto = truncar(qtdeCombustivelGasto);
	    this.valorGasto = truncar(valorGasto);
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
	public double getValorGasto() {
		return valorGasto;
	}
	public void setValorGasto(double valorGasto) {
		this.valorGasto = valorGasto;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public double getQtdeCombustivelGasto() {
		return qtdeCombustivelGasto;
	}

	public void setQtdeCombustivelGasto(double qtdeCombustivelGasto) {
		this.qtdeCombustivelGasto = qtdeCombustivelGasto;
	}
	
	// Método para truncar em duas casas decimais
	   private double truncar(double valor) {
        return BigDecimal.valueOf(valor)
                .setScale(2, RoundingMode.DOWN)
                .doubleValue();
	   }

}