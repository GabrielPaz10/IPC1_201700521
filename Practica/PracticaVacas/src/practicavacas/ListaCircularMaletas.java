package practicavacas;

/**
 *
 * @author Ludwing_98
 */
import javax.swing.JTextArea;
public class ListaCircularMaletas {
    NodoMaleta ultimo;
    NodoMaleta cabeza;
    JTextArea area;
    public ListaCircularMaletas() {
        cabeza=ultimo=null;
    }
    public boolean estaVaciaVes(){
        return ultimo ==null;
    }
        public void insertar(int turno){
        if(estaVaciaVes()){
            NodoMaleta nuevo=new NodoMaleta(new Maleta(turno));
            nuevo.enlazarAnterior(nuevo);
            nuevo.enlazarSiguiente(nuevo);
            cabeza=nuevo;
            ultimo=nuevo;
        }else{
            NodoMaleta nuevo=new NodoMaleta(new Maleta(turno));
            nuevo.enlazarAnterior(ultimo);
            nuevo.enlazarSiguiente(cabeza);
            ultimo.enlazarSiguiente(nuevo);
            cabeza.enlazarAnterior(nuevo);
            ultimo=nuevo;
            
        }
    }
        //para eliminar el primero
    public void eliminarPrimero(){
        if(ultimo==cabeza){
            cabeza=null;
            ultimo=null;
            System.out.println("se han eliminado todos");
        }else{
            cabeza=cabeza.obtenerSiguiente();
            cabeza.enlazarAnterior(ultimo);
            ultimo.enlazarSiguiente(cabeza);
        }
    }
    //metodo para recorrer la lista
    public String mostrar(JTextArea area){
        if(!estaVaciaVes()){
            NodoMaleta auxiliar = ultimo.siguiente;
            String dato= "";
            do{
                dato = dato + auxiliar.maletas.toString()+"\n------------------------------------------------------\n";
                auxiliar = auxiliar.siguiente; 
            }while(auxiliar!= ultimo.siguiente);
            return dato;
            //area.setText(dato);
        }return "Esta Vacía Ves";
    }
    //eliminar nodo de lista circular
    
    
}
