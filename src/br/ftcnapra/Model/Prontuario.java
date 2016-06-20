package br.ftcnapra.Model;

import java.util.Date;

public class Prontuario {

	private Integer prontCodigo;
	private Date prontData;
	private Profissionais proflogin;
	private Cliente cliCPF;
	private String prontDescricao;
	private Area areaCodigo;
	
	public Integer getProntCodigo() {
		return prontCodigo;
	}
	public void setProntCodigo(Integer prontCodigo) {
		this.prontCodigo = prontCodigo;
	}
	public Date getProntData() {
		return prontData;
	}
	public void setProntData(Date prontData) {
		this.prontData = prontData;
	}
	public Profissionais getProflogin() {
		return proflogin;
	}
	public void setProflogin(Profissionais proflogin) {
		this.proflogin = proflogin;
	}
	public Cliente getCliCPF() {
		return cliCPF;
	}
	public void setCliCPF(Cliente cliCPF) {
		this.cliCPF = cliCPF;
	}
	public String getProntDescricao() {
		return prontDescricao;
	}
	public void setProntDescricao(String prontDescricao) {
		this.prontDescricao = prontDescricao;
	}
	public Area getAreaCodigo() {
		return areaCodigo;
	}
	public void setAreaCodigo(Area areaCodigo) {
		this.areaCodigo = areaCodigo;
	}
	
}
