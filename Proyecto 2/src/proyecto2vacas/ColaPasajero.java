package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
import javax.swing.JTextArea;
public class ColaPasajero {
    protected NodoPasajero inicio, fin;
    JTextArea area;

    public ColaPasajero() {
        this.inicio = null;
        this.fin = null;
    }
    public void AgregarInicio(){
        inicio= new NodoPasajero(new Pasajero(),inicio);
        if (fin==null){
            fin= inicio;
        }   
    }
    public boolean estaVaciaVes(){
        if (inicio==null) {
            return true;
        }else return false;
    }
    public void agregarFinal(){
        if (!estaVaciaVes()) {
            fin.siguiente = new NodoPasajero(new Pasajero());
            fin= fin.siguiente;
        }
        else{
            inicio = fin = new NodoPasajero(new Pasajero());
        }
    }
    
    public String mostrarLista(JTextArea area){
        if (!estaVaciaVes()){
            String datos = "";
         NodoPasajero recorrer= inicio;
            while(recorrer != null){
                datos= datos+recorrer.pasajero.toString()+"\n------------------------------------------------------\n";
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
    
    public void eliminarInicio(){
        //Pasajero pasajero = inicio.pasajero;
        if (inicio== null) {
            inicio=fin=null;
        }else{
            inicio= inicio.siguiente;
        }
        //return pasajero;
    }
}
