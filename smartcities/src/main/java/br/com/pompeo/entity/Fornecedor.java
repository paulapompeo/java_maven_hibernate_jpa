package br.com.pompeo.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

	@Id
	@SequenceGenerator(name = "fornecedor", sequenceName = "sq_tb_fornecedor", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor")
	@Column(name = "cd_fornecedor")
	private int id;

	@Column(name = "nm_fornecedor", nullable = false, length = 100)
	private String nome;

	@CreationTimestamp
	@Column(name = "dt_cadastro")
	private Calendar dataCadastro;

	@UpdateTimestamp
	@Column(name = "dt_modificacao")
	private Calendar dataModificacao;

	// precisa de um construtor vazio

	public Fornecedor() {
		super();
	}

	public Fornecedor(int id, String nome, Calendar dataCadastro, Calendar dataModificacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.dataModificacao = dataModificacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
