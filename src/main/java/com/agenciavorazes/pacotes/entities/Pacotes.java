package com.agenciavorazes.pacotes.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pacotes implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPacotes;
	private String Origem;
	private String Destino;
	private float preco;
	private String DataIda;
	private String DataVolta;
	
	
	 @JsonIgnore
	 @OneToMany(mappedBy = "pacotes")
	 private List<Pacotes> pacotes = new ArrayList<Pacotes>();
	 
	public Pacotes(){	
	}


	public Pacotes(Long idPacotes, String origem, String destino, float preco, String dataIda, String dataVolta) {
		
		this.IdPacotes = idPacotes;
		this.Origem = origem;
		this.Destino = destino;
		this.preco = preco;
		this.DataIda = dataIda;
		this.DataVolta = dataVolta;
		
	}


	public Long getIdPacotes() {
		return IdPacotes;
	}


	public void setIdPacotes(Long idPacotes) {
		IdPacotes = idPacotes;
	}


	public String getOrigem() {
		return Origem;
	}


	public void setOrigem(String origem) {
		Origem = origem;
	}


	public String getDestino() {
		return Destino;
	}


	public void setDestino(String destino) {
		Destino = destino;
	}


	public float getPreco() {
		return preco;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public String getDataIda() {
		return DataIda;
	}


	public void setDataIda(String dataIda) {
		DataIda = dataIda;
	}


	public String getDataVolta() {
		return DataVolta;
	}


	public void setDataVolta(String dataVolta) {
		DataVolta = dataVolta;
	}


	public List<Pacotes> getPacotes() {
		return pacotes;
	}


	public void setPacotes(List<Pacotes> pacotes) {
		this.pacotes = pacotes;
	}
	

    @Override
       public int hashCode() {
       return Objects.hash(IdPacotes);
}
	
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacotes other = (Pacotes) obj;
		return Objects.equals(IdPacotes, other.IdPacotes);
	}
	

}
