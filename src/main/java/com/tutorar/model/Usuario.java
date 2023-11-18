package com.tutorar.model;

import java.sql.Date;
import java.util.List;

import com.tutorar.enums.UF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Usuario {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String cpf;
	
	@Column(nullable=false)
	private Date dtNasc;
	
	@Column(nullable=false)
	private String senha;

	@Column(nullable=false)
	private String telefone;
	
	@Column(nullable=false)
	private String endereco;
	
	@Column(nullable=false)
	private String cep;
	
    @Column
    @Enumerated(EnumType.STRING)
	private UF uf;

    @Column(nullable=false)
    private String cidade;
    
    @Column(nullable=false)
    private String bairro;
    
    @Column(nullable=false)
    private int numero;
    
    @Column
    private String complemento;
    
    @OneToMany
    @JoinColumn(name="usuario_id")
    private List<Aula> aula;

    @OneToOne
	@JoinColumn(unique=true)
    private Professor professor;
    
	//Construtor
	public Usuario() {

	}
	
	public Usuario(String nome, String email, String cpf, Date dtNasc, String senha, String telefone,
			String endereco, String cep, UF uf, String cidade, String bairro, int numero, String complemento,
			List<Aula> aula, Professor professor) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
		this.senha = senha;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.aula = aula;
		this.professor = professor;
	}
	
	public Usuario(Long id, String nome, String email, String cpf, Date dtNasc, String senha, String telefone,
			String endereco, String cep, UF uf, String cidade, String bairro, int numero, String complemento,
			List<Aula> aula, Professor professor) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dtNasc = dtNasc;
		this.senha = senha;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
		this.complemento = complemento;
		this.aula = aula;
		this.professor = professor;
	}


	//Acessores
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	public List<Aula> getAula() {
		return aula;
	}

	public void setAula(List<Aula> aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", dtNasc=" + dtNasc
				+ ", senha=" + senha + ", telefone=" + telefone + ", endereco=" + endereco + ", cep=" + cep + ", uf="
				+ uf + ", cidade=" + cidade + ", bairro=" + bairro + ", numero=" + numero + ", complemento="
				+ complemento + ", aula=" + aula + ", professor=" + professor + "]";
	}

	




	
	
	

	
}
