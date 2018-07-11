package proyecto2vacas;

import javax.swing.JTextArea;

/**
 *
 * @author Ludwing_98
 */
public class PilaDoc {
    NodoPilaDoc inicio,fin;

    public PilaDoc() {
        inicio= fin= null;
    }
    public void AgregarInicio(){
        inicio= new NodoPilaDoc();
        if (fin==null){
            fin= inicio;
        }   
    }
    public boolean estaVaciaVes(){
        if (inicio==null) {
            return true;
        }else return false;
    }
    public String mostrarLista(JTextArea area){
        if (!estaVaciaVes()){
            String datos = "";
         NodoPilaDoc recorrer= inicio;
            while(recorrer != null){
                datos= datos+recorrer.doc+"\n------------------------------------------------------\n";
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
