package br.com.ficticius.api.veiculos.domain.model.dto;

public class CalculadoraRequest {
    private double precoGasolina;
    private double kmCidade;
    private double kmRodovia;
	public double getPrecoGasolina() {
		return precoGasolina;
	}
	public void setPrecoGasolina(double precoGasolina) {
		this.precoGasolina = precoGasolina;
	}
	public double getKmCidade() {
		return kmCidade;
	}
	public void setKmCidade(double kmCidade) {
		this.kmCidade = kmCidade;
	}
	public double getKmRodovia() {
		return kmRodovia;
	}
	public void setKmRodovia(double kmRodovia) {
		this.kmRodovia = kmRodovia;
	}
}