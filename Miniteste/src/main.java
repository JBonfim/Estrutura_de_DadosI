
public class Main {

	public static void main(String[] args) {
		Colecao  c = new Colecao(10);
		int ad=30;
		for(int i =0;i<ad;i++){
			c.add("N"+i);
		}
		for(int i =0;i<ad;i++){
			System.out.print(c.get(i)+", ");
		}
		System.out.println("");
		c.addInicio("N 3");
		c.addInicio("N 8");
		c.addInicio("N 12");
		c.println();
		System.out.println("");
		c.add("N 100", 1);
		c.println();
		System.out.println("");
		c.removerInicio();
		c.println();		System.out.println("");
		c.remover(2);
		c.println();
		

	}

}
