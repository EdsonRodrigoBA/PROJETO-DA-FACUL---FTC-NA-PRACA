package br.ftcnapra.Model;

public class Profissionais {
	
	private String profLogin;
	private String profNome;
	private String profCargo;
	private Area areaCodigo;
	
	public Area getAreaCodigo() {
		return areaCodigo;
	}
	public void setAreaCodigo(Area areaCodigo) {
		this.areaCodigo = areaCodigo;
	}
	public String getProfLogin() {
		return profLogin;
	}
	public void setProfLogin(String profLogin) {
		this.profLogin = profLogin;
	}
	public String getProfNome() {
		return profNome;
	}
	public void setProfNome(String profNome) {
		this.profNome = profNome;
	}
	public String getProfCargo() {
		return profCargo;
	}
	public void setProfCargo(String profCargo) {
		this.profCargo = profCargo;
	}

	public String getProfSenha() {
		return profSenha;
	}
	public void setProfSenha(String profSenha) {
		this.profSenha = profSenha;
	}
	private String profSenha;
}
