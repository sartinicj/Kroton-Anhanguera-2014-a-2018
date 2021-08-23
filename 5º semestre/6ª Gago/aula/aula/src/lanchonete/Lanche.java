/**
 * 
 */
package lanchonete;

import java.util.List;
/**
 * @author gago
 *
 */
public class Lanche {
	double preco;
	List<String> ingredientes;

	public Lanche(double preco, List<String> ingredientes) {
		super();
		this.preco = preco;
		this.ingredientes = ingredientes;
	}

	public void cobrar() {
     System.out.println("Seu lanche custa " + preco);		
	}

}
