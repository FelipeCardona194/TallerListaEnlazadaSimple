
package main2;


class ListaEnlazadaSimple {
     
    Nodo1 cabeza;
    Nodo1 siguiente;
    Nodo1 cola;
    int tamaño = 0;
    public ListaEnlazadaSimple(){
        
        cabeza = null;
        cola = null;
        tamaño = 0;
        
    }

    public Nodo1 getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo1 cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1 siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo1 getCola() {
        return cola;
    }

    public void setCola(Nodo1 cola) {
        this.cola = cola;
    }
 
    public int tamaño (){
        return tamaño;
    }
    
    public boolean estaVacia (){
        
        return (cabeza == null)?true:false;  
    }
    
    public void agregarCabeza(int dato) {

        if (cabeza == null) {
            cabeza = new Nodo1(dato);
        } else {

            Nodo1 temp = cabeza;

            Nodo1 nuevo = new Nodo1(dato);

            nuevo.setSiguiente(temp);

            cabeza = nuevo;
        }
        tamaño++;
    }
    public String localizar(int num) {

        Nodo1 temp = cabeza;
        int ind = 0;
        boolean encontrado;

       for (int i = 0; i < tamaño; i++) {

            if (temp.getValor () == num) {
                encontrado = true;
                ind = i + 1;
            } else {
                temp = temp.getSiguiente();
            }
        }
          if (encontrado = false) {
            return "El nodo no se ha encontrado";
        } else {
            return "El valor " + num + " Se ha encontrado en el nodo " + ind;
        }
    }
     public void recorrer() {

        Nodo1 temp = cabeza;

        for (int i = 0; i < tamaño; i++) {
            System.out.println("El valor del nodo " + (i + 1) + " Es : " + temp.getValor());
            temp = temp.getSiguiente();
        }
    }
     public void ultimo() {

        Nodo1 temp = cabeza;

        for (int i = 1; i <= tamaño; i++) {

            if (i == tamaño) {
                System.out.println("El ultimo nodo es: " + (i) + " Con el valor: " + temp.getValor());
            } else {
                temp = temp.getSiguiente();
            }
        }
    }
      public int getTamaño() {
        return tamaño;
    }
      public void agregarUltimo(Object obj){
     
        if(cola == null)
        {
            cola = new Nodo1(obj);
        }
        else 
        {
            Nodo1 temp = cola;
            Nodo1 nuevo = new Nodo1(obj);
            nuevo.enlazarSiguiente(temp);
            cola = nuevo;
        }
        tamaño++;
    }
        public Object agregarEnPosicion (int index){
           int contador = 0;
           Nodo1 tempo = siguiente;
           while (contador < index ){
               tempo = tempo.obtenerSiguiente();
               contador ++;
           }
           return tempo.obtenerValor();
        }
      
      public void suprimirCabeza(){
          cabeza = cabeza.obtenerSiguiente();
          tamaño--;
      }
      
      public void  suprimirCola (){
          cola = cola.obtenerSiguiente();
          tamaño--;
      }
      
      public void SuprimirEnPosicion(int index){
          if ( index == 0){
              cabeza = cabeza.obtenerSiguiente();
          }
          else {
              int contador = 0;
          Nodo1 temporal = cabeza;
          while (contador < index -1){
              temporal = temporal.obtenerSiguiente();
              contador++;
          }
          temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
              
          }
          tamaño --;
      }
      
}
/* Elaborado por: Andres Felipe Cardona Londoño
                  Juan David Arias Sanchez
*/