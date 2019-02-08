package br.com.barrostech.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
@Named
@ViewScoped
public class Home implements Serializable {
	private static final long serialVersionUID = 1L;
	private String mensagem;

	@PostConstruct
	public void inicializar() {
		setMensagem("Projeto configurado");
		System.out.println("Projeto configurado");
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	

}
