package proyecto2vacas;
import javax.swing.JTextArea;
public class ListaAvion {
    public NodoAvion inicio,fin;
    //JTextArea area;
    private int listaSize=1;
    ListaMantenimiento lm;

    public ListaAvion() {
        inicio= fin= null;
    }
    
    public boolean estaVaciaVes(){
        return inicio==null;
    }
    public void agregarFinal(){ //es de tipo object porque los nodos los creamos de este tipo.
        if(estaVaciaVes()){
            inicio=fin=new NodoAvion(new Avion());// al momento de añadir elementos primero tenemos que verificar si la cabeza es nula, si lo es la cabeza va a ser igual a un nuevo nodo con el valor de objeto, se hace cuando la lista esta vacia
        }else{// cuando no esta vacia, o sea hay algo en la cabeza, cuando tenemos ya un inicio. lo que hay que hacer es crear un nodo aislado y luego colocarlo apuntando hacia la cabeza y este va a ser la nueva cabeza     
            
            NodoAvion nuevo=new NodoAvion(new Avion());// aqui el nodo nuevo está aislado
            nuevo.enlazarAnterior(fin); // setea el enlace anterior del nuevo a el culito actual
            fin.enlazarSiguiente(nuevo);//cambia el enlace siguiente del culito actual a el nuevo nodo
            fin=nuevo; // el nodo nuevo se vuelve el culito
        }
        listaSize++;// para llevar un registro de que tan grande es nuestra lista actual
    }

    //mostrar lista de inicio a fin
    public String mostrarInicio(int turno,JTextArea area){
        if (!estaVaciaVes()){
            NodoAvion auxiliar= inicio;
            String dato= "";
            while(auxiliar!=null){
                //System.out.println("["+auxiliar.avion.toString(turno)+"]<->");
                dato = dato+auxiliar.avion.toString(listaSize)+"\n------------------------------------------------------\n";
                auxiliar=auxiliar.siguiente;
            }
            return dato;
            //area.setText(dato);
            //System.out.println("");
        //System.out.println("------------------------------------");
        }else{
            return"Esta vacía ves\n";
            //System.out.println("La lista esta vacia");
        }
    }
    public void disminuirTurno(){
        if(inicio!=null){
            
            NodoAvion aux = inicio;
            NodoAvion antaux = null;
            while(aux!=null){
                int desabordaje = aux.avion.getTurnosDesabordaje()-1;
                aux.avion.setTurnosDesabordaje(desabordaje);
                aux=aux.siguiente;
            }
        }
    }
    public void eliminarPrimero(){
        if(listaSize==1){
            inicio=fin=null;
            System.out.println("se han eliminado todos");
        }else{
            inicio=inicio.obtenerSiguiente();
            lm.AgregarInicio(inicio.avion);
            inicio.enlazarAnterior(null); 
            
        }
        listaSize--;
    }
    public void eliminarUltimo(){
        if(listaSize==1){
            inicio=fin=null;
            System.out.println("se han eliminado todos");
        }else{
            fin=fin.obtenerAnterior();
            fin.enlazarSiguiente(null);
        }
        listaSize--;
    }
    public int size() {
        return listaSize;
    }
    public void eliminardef(int valor){
        NodoAvion avion = inicio;
        while(avion!=null){
            if (avion.avion.turnosDesabordaje==valor) {
                eliminarPrimero();
            }else if(avion==null){
                eliminarUltimo();
            }else{
                
            }
            avion=avion.siguiente;
        }
    }
    public NodoAvion delete(int num)
	{
		NodoAvion anterior=null;
		NodoAvion actual=inicio;
		while(actual!=null)
		{
			if(actual.avion.turnosDesabordaje==num)
			{
				if(anterior==null)
				{
					inicio=actual.siguiente;
					//inicio.anterior=null;
				}
				else{
					anterior.siguiente=actual.siguiente;
					NodoAvion temporal;
					temporal=actual.siguiente;
					//temporal.anterior=anterior;
				}
				return actual;
			}
			anterior=actual;
			actual=actual.siguiente;
		}
		if(num==fin.avion.turnosDesabordaje)
		{
			fin=actual.anterior;
			return actual;
		}
		return actual;
	}
    public void eliminar(int index){
        if(listaSize>0 && index<listaSize) {
            if(index==0){
                eliminarPrimero();
            }else if(index==listaSize-1){
                eliminarUltimo();
            }else{
                int contador=0; 
                NodoAvion temporal=inicio;
                while(contador<index-1){ // es menos uno porque quiero llegar
                    //al nodo anterior al del index, no llegar al mero index
                    temporal=temporal.obtenerSiguiente();
                    contador++;
                }
                temporal.enlazarSiguiente(
                    temporal.obtenerSiguiente().obtenerSiguiente() //enlaza al siguiente del siguiente, ahi ya lo tenemos. Solo funciona para nodos diferentes al de la cabeza
                ); // el metodo hace que el siguiente nodo de este sea otro nodo    
                temporal.obtenerSiguiente().enlazarAnterior(temporal);
                listaSize--;
            }
            
        }else{
            System.out.println("no hay elementos en existencia");
        }
        
    }
}
