package br.com.agenda.model;
 
import java.util.Date;
 
public class Contato {
 
private int id;
 private String nome;
 private String sexo;
 private Date dataDeNascimento;
 private int idade;
 private Date dataCadastro;
 private String observacao;
 
 public String getObservacao() {
	return observacao;
}

public void setObservacao(String observacao) {
	this.observacao = observacao;
}

public int getId() {
 return id;
 }
 
 public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public Date getDataDeNascimento() {
	return dataDeNascimento;
}

public void setDataDeNascimento(Date dataDeNascimento) {
	this.dataDeNascimento = dataDeNascimento;
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
 
 public int getIdade() {
 return idade;
 }
 
 public void setIdade(int idade) {
 this.idade = idade;
 }
 
 public Date getDataCadastro() {
 return dataCadastro;
 }
 
 public void setDataCadastro(Date dataCadastro) {
 this.dataCadastro = dataCadastro;
 }
}