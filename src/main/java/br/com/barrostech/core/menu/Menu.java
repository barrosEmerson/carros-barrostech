package br.com.barrostech.core.menu;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<ItemMenu>itens;

	public Menu(List<ItemMenu> itens) {

		this.itens = itens;
	}

	public List<ItemMenu> getItens() {
		return itens;
	}

	public void setItens(List<ItemMenu> itens) {
		this.itens = itens;
	}
	
	
}
