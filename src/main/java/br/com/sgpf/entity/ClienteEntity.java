package br.com.sgpf.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente", schema = "GerenciamentoDePedidosFood")
public class ClienteEntity implements Serializable {
	
private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "idcliente")
		private long idCliente;
	
		@Column(name = "nome")
		private String nome;
	
		
		@Column(name = "cep")
		private String cep;
		
		@Column(name = "rua")
		private String rua;
		
		@Column(name = "telefone")
		private String telefone;
		
		@Column(name = "bairro")
		private String bairro;

		public long getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(long idCliente) {
			this.idCliente = idCliente;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getRua() {
			return rua;
		}

		public void setRua(String rua) {
			this.rua = rua;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

	

}
