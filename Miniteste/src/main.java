
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Colecao c = new Colecao(10);
		for(int i =0;i<30;i++){
			c.add("N"+i);
		}
		for(int i =0;i<30;i++){
			try {
				System.out.print(c.get(i)+", ");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
