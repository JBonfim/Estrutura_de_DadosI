
public class Colecao {
	private String elemento[];
	private String elementoaux[];
	private  int tamanho = 0;
	public Colecao(int n){
		this.elemento = new  String[n];
	}
	public void add(String n){
		
		if(elemento.length==tamanho){
			elementoaux = elemento;
			this.elemento = new String[elementoaux.length+1];
			for(int i =0;i<elementoaux.length;i++){
				String aux = elementoaux[i];
				elemento[i]=aux;
			}
			elemento[elementoaux.length] = n;
			 tamanho++;
		}
		else{
			elemento[tamanho] = n;
			  tamanho++;
		}
		  
	       
		
	}
	public String get(int i)throws Exception{
		for(int i2=0;i2<elemento.length;i2++){
			if(i2==i){
				return elemento[i2];
			}

		}
		 throw new Exception("Indice Invalido");

	}

}
