package com.agenciavorazes.pacotes.dto;

import com.agenciavorazes.pacotes.entities.Pacotes;

public class PacotesDTO {
	
	private Long IdPacotes;
	private String Origem;
	private String Destino;
	private float Preco;
	private String DataIda;
	private String DataVolta;

	
	public PacotesDTO(){
	}


	public PacotesDTO(Long idPacotes, String origem, String destino, float preco, String dataIda, String dataVolta) {
		this.IdPacotes = idPacotes;
		this.Origem = origem;
		this.Destino = destino;
		this.Preco = preco;
		this.DataIda = dataIda;
		this.DataVolta = dataVolta;
	}

	public PacotesDTO(Pacotes pacotes) {
		IdPacotes = pacotes.getIdPacotes();
		Origem = pacotes.getOrigem();
		Destino = pacotes.getDestino();
		Preco = pacotes.getPreco();
		DataIda = pacotes.getDataIda();
		DataVolta = pacotes.getDataVolta();
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
		return Preco;
	}


	public void setPreco(float preco) {
		Preco = preco;
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
	
	
	
}
