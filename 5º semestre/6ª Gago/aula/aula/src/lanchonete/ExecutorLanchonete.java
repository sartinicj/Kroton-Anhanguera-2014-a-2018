package lanchonete;

import java.util.ArrayList;
import java.util.List;

public class ExecutorLanchonete {
	public static void main(String[] args) {
		List<String> ingredientes = new ArrayList<>();
		ingredientes.add("hamburguer");
		ingredientes.add("queijo");
		ingredientes.add("bacon");

		Lanche xgago = new Lanche(5.0, ingredientes);
		xgago.cobrar();

	}
}
