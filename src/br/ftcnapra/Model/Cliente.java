package br.ftcnapra.Model;

import java.math.BigDecimal;
import java.util.Date;

public class Cliente {
	
	private Long cliCpf;
	private String cliNome;
	private String cliRg;
	private Date cliDataNascimento;
	private String cliNomeMae;
	private String cliCep;
	public String getCliEndereco() {
		return cliEndereco;
	}
	public void setCliEndereco(String cliEndereco) {
		this.cliEndereco = cliEndereco;
	}
	public String getCliEnderecoComplementoto() {
		return cliEnderecoComplementoto;
	}
	public void setCliEnderecoComplementoto(String cliEnderecoComplementoto) {
		this.cliEnderecoComplementoto = cliEnderecoComplementoto;
	}
	private String cliEndereco;
	private String cliEnderecoNumero;
	private String cliEnderecoComplementoto;
	private String cliBairro;
	private String cliCidde;
	private String cliUF;
	private String cliEmail;
	private String cliTelefone;
	private String cliCelular;
	private Date cliDataCadastro;
	private Date cliDataAlteracao;
	private Profissionais profissionais;
	private String cliPerfilAlteracao;
	private BigDecimal cliRenda;
	
	

	public BigDecimal getCliRenda() {
		return cliRenda;
	}
	public void setCliRenda(BigDecimal cliRenda) {
		this.cliRenda = cliRenda;
	}
	public Long getCliCpf() {
		return cliCpf;
	}
	public void setCliCpf(Long cliCpf) {
		this.cliCpf = cliCpf;
	}
	public String getCliNome() {
		return cliNome;
	}
	public void setCliNome(String cliNome) {
		this.cliNome = cliNome;
	}
	public String getCliRg() {
		return cliRg;
	}
	public void setCliRg(String cliRg) {
		this.cliRg = cliRg;
	}
	public Date getCliDataNascimento() {
		return cliDataNascimento;
	}
	public void setCliDataNascimento(Date cliDataNascimento) {
		this.cliDataNascimento = cliDataNascimento;
	}
	public String getCliNomeMae() {
		return cliNomeMae;
	}
	public void setCliNomeMae(String cliNomeMae) {
		this.cliNomeMae = cliNomeMae;
	}
	public String getCliCep() {
		return cliCep;
	}
	public void setCliCep(String cliCep) {
		this.cliCep = cliCep;
	}
	public String getCliEnderecoNumero() {
		return cliEnderecoNumero;
	}
	public void setCliEnderecoNumero(String cliEnderecoNumero) {
		this.cliEnderecoNumero = cliEnderecoNumero;
	}

	public String getCliBairro() {
		return cliBairro;
	}
	public void setCliBairro(String cliBairro) {
		this.cliBairro = cliBairro;
	}
	public String getCliCidde() {
		return cliCidde;
	}
	public void setCliCidde(String cliCidde) {
		this.cliCidde = cliCidde;
	}
	public String getCliUF() {
		return cliUF;
	}
	public void setCliUF(String cliUF) {
		this.cliUF = cliUF;
	}
	public String getCliEmail() {
		return cliEmail;
	}
	public void setCliEmail(String cliEmail) {
		this.cliEmail = cliEmail;
	}
	public String getCliTelefone() {
		return cliTelefone;
	}
	public void setCliTelefone(String cliTelefone) {
		this.cliTelefone = cliTelefone;
	}
	public String getCliCelular() {
		return cliCelular;
	}
	public void setCliCelular(String cliCelular) {
		this.cliCelular = cliCelular;
	}
	public Date getCliDataCadastro() {
		return cliDataCadastro;
	}
	public void setCliDataCadastro(Date cliDataCadastro) {
		this.cliDataCadastro = cliDataCadastro;
	}
	public Date getCliDataAlteracao() {
		return cliDataAlteracao;
	}
	public void setCliDataAlteracao(Date cliDataAlteracao) {
		this.cliDataAlteracao = cliDataAlteracao;
	}

	public Profissionais getProfissionais() {
		return profissionais;
	}
	public void setProfissionais(Profissionais profissionais) {
		this.profissionais = profissionais;
	}
	public String getCliPerfilAlteracao() {
		return cliPerfilAlteracao;
	}
	public void setCliPerfilAlteracao(String cliPerfilAlteracao) {
		this.cliPerfilAlteracao = cliPerfilAlteracao;
	}

	
	

}
