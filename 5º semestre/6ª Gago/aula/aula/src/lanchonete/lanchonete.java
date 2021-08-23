/**
 * 
 */
package lanchonete;

import java.util.List;
/**
 * @author gago
 *
 */
public class lanchonete {
	double preco;
	List<String> ingredientes;

	public lanchonete(double preco, List<String> ingredientes) {
		super();
		this.preco = preco;
		this.ingredientes = ingredientes;
	}

	public void cobrar() {
     System.out.println("Seu lanche custa " + preco);		
	}

}
