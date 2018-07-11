package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
public class ListaEscritorio {
    public NodoEscritorio inicio,fin;
    //JTextArea area;
    private int listaSize=1;
//    ListaMantenimiento lm;

    public ListaEscritorio() {
        inicio= fin= null;
    }
    
    public boolean estaVaciaVes(){
        return inicio==null;
    }
    public void agregarFinal(){ //es de tipo object porque los nodos los creamos de este tipo.
        if(estaVaciaVes()){
            inicio=fin=new NodoEscritorio(new ColaPasajero());// al momento de añadir elementos primero tenemos que verificar si la cabeza es nula, si lo es la cabeza va a ser igual a un nuevo nodo con el valor de objeto, se hace cuando la lista esta vacia
        }else{// cuando no esta vacia, o sea hay algo en la cabeza, cuando tenemos ya un inicio. lo que hay que hacer es crear un nodo aislado y luego colocarlo apuntando hacia la cabeza y este va a ser la nueva cabeza     
            
            NodoEscritorio nuevo=new NodoEscritorio(new ColaPasajero());// aqui el nodo nuevo está aislado
            nuevo.enlazarAnterior(fin); // setea el enlace anterior del nuevo a el culito actual
            fin.enlazarSiguiente(nuevo);//cambia el enlace siguiente del culito actual a el nuevo nodo
            fin=nuevo; // el nodo nuevo se vuelve el culito
        }
        listaSize++;// para llevar un registro de que tan grande es nuestra lista actual
    }

    //mostrar lista de inicio a fin
    public String mostrarInicio(){
        if (!estaVaciaVes()){
            NodoEscritorio auxiliar= inicio;
            String dato= "";
            while(auxiliar!=null){
                //System.out.println("["+auxiliar.avion.toString(turno)+"]<->");
                dato = dato+auxiliar.cola.inicio.pasajero.toString()+"\n------------------------------------------------------\n";
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
            
            NodoEscritorio aux = inicio;
            NodoAvion antaux = null;
            while(aux!=null){
                int registro = aux.cola.inicio.pasajero.getTurnoRegis()-1;
                aux.cola.inicio.pasajero.setTurnoRegis(registro);
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
            //lm.AgregarInicio(inicio.cola);
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
        NodoEscritorio escritorio = inicio;
        while(escritorio!=null){
            if (escritorio.cola.inicio.pasajero.turnoRegis==valor) {
                eliminarPrimero();
            }else if(escritorio==null){
                eliminarUltimo();
            }else{
                
            }
            escritorio=escritorio.siguiente;
        }
    }
    public boolean delete(int num)
	{
		NodoEscritorio anterior=null;
		NodoEscritorio actual=inicio;
		while(actual!=fin)
		{
			if(actual.cola.inicio.pasajero.turnoRegis==num)
			{
				if(anterior==null)
				{
					inicio=actual.siguiente;
					inicio.anterior=null;
				}
				else{
					anterior.siguiente=actual.siguiente;
					NodoEscritorio temporal;
					temporal=actual.siguiente;
					temporal.anterior=anterior;
				}
				return true;
			}
			anterior=actual;
			actual=actual.siguiente;
		}
		if(num==fin.cola.fin.pasajero.turnoRegis)
		{
			fin=actual.anterior;
			return true;
		}
		return false;
	}
    public void eliminar(int index){
        if(listaSize>0 && index<listaSize) {
            if(index==0){
                eliminarPrimero();
            }else if(index==listaSize-1){
                eliminarUltimo();
            }else{
                int contador=0; 
                NodoEscritorio temporal=inicio;
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
