package ed.listaligada;

public class Celula {

    private Object elemento;
    
    private Celula anterior;
    
    private Celula proximo;
    
    
    
    public Celula(Object elemento) {
    	this(null,elemento);
    }
	
	public Celula(Celula proximo, Object elemento) {
		super();
		this.elemento = elemento;
		
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}
	
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
    
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	public Celula getAnterior() {
		return anterior;
	}
    

    
    
    
}