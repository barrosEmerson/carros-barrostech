package br.com.barrostech.core.menu;


import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

public class MenuController {


	private Menu menu;

	@PostConstruct
	public void inicializar() {
		
		List<ItemMenu>itens = Arrays.asList(
		 new ItemMenu("Vender Meu veículo","/app/vender-meu-veiculo/vender-meu-veiculo.xhtml","fa fa-dashboard",false),
		 new ItemMenu("Meus anuncios","/app/meus-anuncios/meus-anuncios.xhtml","fa fa-dashboard",false),
		 new ItemMenu("Minhas Negociações","/app/minhas-negociacoes/minhas-negociacoes.xhtml","fa fa-dashboard",false),
		 new ItemMenu("Meu Perfil","/app/meu-perfil/meu-perfil.xhtml","fa fa-dashboard",false)
				);
		setMenu(new Menu(itens));
	}
	
	
	
	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	
	

}
