
public class Colecao {
	private String elemento[];
	private  int indeci ;
	public Colecao(int n){
		this.elemento = new  String[n];
		indeci = 0;
	}
	public void addInicio(String n){
		this.redimencionarray();
		for(int i= this.indeci; i>=0;i--){
			elemento[i+1]=elemento[i];
		}
		elemento[0]=n;
		indeci++;
		//add(n,0);
		

		
	}
	public void add(String val,int posic){
		this.redimencionarray();
		for(int i= this.indeci; i>=posic;i--){
			elemento[i+1]=elemento[i];
		}
		elemento[posic]=val;
		indeci++;
		
	}

	public void removerInicio(){
		int a =0;
        for(int i= 1; i<elemento.length;i++){
			elemento[a++]=elemento[i];
		}
        indeci--;
		
		
	}
	public void remover(int posicao){
		int a =posicao;
        for(int i= posicao+1; i<elemento.length;i++){
			elemento[a++]=elemento[i];
		}
        indeci--;
	}
	
	public void println(){
		for(int i=0;i<elemento.length;i++){
			System.out.print(elemento[i]+", ");
		}
	}
	
	private void redimencionarray(){
	    String elementoaux[];
		if(elemento.length==indeci){
			elementoaux = elemento;
			this.elemento = new String[elementoaux.length+10];
			for(int i =0;i<elementoaux.length;i++){
				String aux = elementoaux[i];
				elemento[i]=aux;
				
			}
		}
	}
	public void add(String n){
		
            this.redimencionarray();
			elemento[indeci] = n;
			indeci++;
	
	}
	public String get(int i)throws IndiciRuntimeException{
		for(int i2=0;i2<elemento.length;i2++){
			if(i2==i){
				return elemento[i2];
			}

		}
		 throw new IndiciRuntimeException("Indice Invalido");

	}

}
