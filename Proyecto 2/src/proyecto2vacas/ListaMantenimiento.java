package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
public class ListaMantenimiento {
    protected NodoAvion inicio,fin;
    public ListaMantenimiento() {
        this.inicio = null;
        this.fin = null;
    }
    public void AgregarInicio(Avion avion){
        inicio= new NodoAvion(avion,inicio);
        if (fin==null){
            fin= inicio;
        }
        
    }
    public NodoAvion delete(int num)
	{
		//NodoAvion anterior=null;
		NodoAvion actual=inicio;
		while(actual!=null)
		{
			if(actual.avion.turnosDesabordaje==num)
			{
				//if(anterior==null)
				//{
					inicio=actual.siguiente;
					//inicio.anterior=null;
				//}
				//else{
					//anterior.siguiente=actual.siguiente;
					NodoAvion temporal;
					temporal=actual.siguiente;
					//temporal.anterior=anterior;
				//}
				return actual;
			}
			//anterior=actual;
			actual=actual.siguiente;
		}
		if(num==fin.avion.turnosDesabordaje)
		{
			fin=actual.anterior;
			return actual;
		}
		return actual;
	}
    public boolean estaVaciaVes(){
        if (inicio==null) {
            return true;
        }else return false;
    }
    public void agregarFinal(Avion avion){
        if (!estaVaciaVes()) {
            fin.siguiente = new NodoAvion(avion);
            fin= fin.siguiente;
        }
        else{
            inicio = fin = new NodoAvion(avion);
        }
    }
    public void disminuirTurno(){
        if(inicio!=null){
            
            NodoAvion aux = inicio;
            NodoAvion antaux = null;
            while(aux!=null){
                int mantenimiento = aux.avion.getTurnosMantenimiento()-1;
                aux.avion.setTurnosMantenimiento(mantenimiento);
                aux=aux.siguiente;
            }
        }
    }
    public String mostrarLista(){
        if (!estaVaciaVes()){
            String datos = "";
         NodoAvion recorrer= inicio;
            while(recorrer != null){
                datos= datos+recorrer.avion.toString(5)+"\n------------------------------------------------------\n";
                    //area.setText("["+recorrer.pasajero.toString(5)+"]-->");
                //System.out.println("------");
                    recorrer = recorrer.siguiente;
            }
            //System.out.println("");
            //area.setText(datos);
            return datos;
        }else{
            //System.out.println("La lista esta vacia");
            return "Esta vacia ves\n";
        }
    }
}
