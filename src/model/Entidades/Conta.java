package model.Entidades;

import model.Exceção.ExcecaoConta;

public class Conta {
	
	private Integer numero;
	private String dono;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String dono, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.dono = dono;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(double quantidade) {
		saldo += quantidade;
		
	}
	
	public void retirada(double quantidade) {
		if(quantidade > getLimiteSaque()) {
			throw new ExcecaoConta("Erro de saque: Saque maior que limite de saque");
		}
		else if(quantidade > getSaldo()) {
			throw new ExcecaoConta("Erro de saque: Quantidade do saque maior que saldo");
		}else {
			saldo -= quantidade;
		}
	}
	
}
