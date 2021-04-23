package main2;


public class Nodo1 {
    
    Object valor;
    Nodo1 siguiente;
    
    public Nodo1 (Object valor){
        
       this.valor = valor;
       this.siguiente = null;
    }
    
    public Object obtenerValor(){
        
        return valor;
    }

    public void enlazarSiguiente(Nodo1 n){
    
    siguiente = n;
    }    
    
    public Nodo1 obtenerSiguiente (){
     
        return siguiente;   
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Nodo1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1 siguiente) {
        this.siguiente = siguiente;
    }
       
}
/* Elaborado por: Andres Felipe Cardona Londoño
                  Juan David Arias Sanchez
*/
