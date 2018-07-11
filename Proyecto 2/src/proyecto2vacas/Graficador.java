package proyecto2vacas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ludwing_98
 */
public class Graficador {
    public void crearDotAvion(NodoAvion primero, String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
        fw = new FileWriter(nombre+".dot");
        pw = new PrintWriter(fw);
        pw.println("digraph listadoble {");
        pw.println(generarDotAvion(primero));
        pw.println("}");
        pw.close();
        }catch(IOException ex){ System.out.println("Error");
        }finally{pw.close();}
    }
    public void crearDotTodos(NodoAvion avion,NodoPasajero pasajeros,String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw= null;
        try{
            fw= new FileWriter(nombre+".dot");
            pw= new PrintWriter(fw);
            pw.println("digraph todos {");
            pw.println("subgraph cluster_0 {");
            pw.println("label = \"Aviones\";\n");
            pw.println(generarDotAvion(avion));
            pw.println("}");
            
            pw.println("subgraph cluster_1 {");
            pw.println("label = \"Pasajeros\";\n");
            pw.println(generarDotPasajeros(pasajeros));
            pw.println("}");
            
            pw.println("}");
        }catch(IOException ex){ System.out.println("Error");
        }finally{pw.close();}
    }
    public String generarDotAvion(NodoAvion persona){
        String cadena= "";
        if (persona == null){
            return cadena;}
        cadena+= "nodo"+reemplazar(persona.hashCode())+"[label=\""+persona.avion.toString()+"\"];\n";
        if (persona.siguiente !=null){
            cadena+= "nodo"+reemplazar(persona.hashCode())+"->"+"nodo"+reemplazar(persona.siguiente.hashCode())+";\n";
            cadena+="nodo"+reemplazar(persona.siguiente.hashCode())+"->"+"nodo"+reemplazar(persona.siguiente.anterior.hashCode())+";\n";
            cadena+= generarDotAvion(persona.siguiente);
        }
        return cadena;
    }
    public void crearDotPasajero(NodoPasajero primero, String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
        fw = new FileWriter(nombre+".dot");
        pw = new PrintWriter(fw);
        pw.println("digraph cola {");
        pw.println(generarDotPasajeros(primero));
        pw.println("}");
        pw.close();
        }catch(IOException ex){ System.out.println("Error");
        }finally{pw.close();}
    }
    public String generarDotPasajeros(NodoPasajero pasajero){
        String cadena="";
        if (pasajero==null) 
            return cadena;
        cadena+= "nodo"+reemplazar(pasajero.hashCode())+"[label=\""+pasajero.pasajero.toString()+"\"];\n";
        if (pasajero.siguiente!=null) {
            cadena+= "nodo"+reemplazar(pasajero.hashCode())+"->"+"nodo"+reemplazar(pasajero.siguiente.hashCode())+";\n";
            //cadena+="nodo"+reemplazar(pasajero.siguiente.hashCode())+"->"+"nodo"+reemplazar(pasajero.siguiente.anterior.hashCode())+";\n";
            cadena+= generarDotPasajeros(pasajero.siguiente);
            
        }
        return cadena;
    }
    
    public void crearDotMaletas(NodoMaleta primera, String nombre){
        FileWriter fw = null;
        PrintWriter pw=null;
        try{
            fw= new FileWriter(nombre+".dot");
            pw= new PrintWriter(fw);
            pw.println("digraph ListaCircular {");
            //pw.println("node [shape= record]\n");
            pw.println(generarDotMaletas(primera));
            pw.println("}");
            pw.close();
        }catch(IOException ex){System.out.println("error");
        }finally{pw.close();}
    }
    public String generarDotMaletas(NodoMaleta maleta){
        String cadena="";
        /*if (maleta==null) 
            return cadena;
        cadena+= "nodo"+reemplazar(maleta.hashCode())+"[label=\""+maleta.maletas.toString()+"\"];\n";
        if (maleta.siguiente!=null) {
            cadena+= "nodo"+reemplazar(maleta.hashCode())+"->"+"nodo"+reemplazar(maleta.siguiente.hashCode())+";\n";
            cadena+="nodo"+reemplazar(maleta.siguiente.hashCode())+"->"+"nodo"+reemplazar(maleta.siguiente.anterior.hashCode())+";\n";
            cadena+= generarDotMaletas(maleta.siguiente);
            
        }*/
        
        NodoMaleta aux = maleta;
        do{
            cadena+="nodo"+reemplazar(aux.hashCode())+"[label=\""+"Numero de maleta: "+aux.maletas.numero+"\"];\n";
            if (aux.siguiente!=null) {
                cadena+="nodo"+reemplazar(aux.hashCode())+"->"+"nodo"+reemplazar(aux.siguiente.anterior.hashCode())+";\n";
                cadena+="nodo"+reemplazar(aux.siguiente.hashCode())+"->"+"nodo"+reemplazar(aux.siguiente.anterior.hashCode())+";\n";
            }
            aux=aux.siguiente;
        }while(aux!=maleta);
        return cadena;
    }
    public void generarImagenPasajero(String direccionDot, String direccionImagen){
        String dotPath= "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
        String cmd= dotPath+" -Tjpg "+direccionDot+" -o "+direccionImagen;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(Graficador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void GraficarAviones(NodoMaleta maleta)throws IOException{
        crearDotMaletas(maleta,"Maletas");
        generarImagenPasajero("Maletas","Maletas.png");
    }
    public String reemplazar(int posmemoria){
        String cadena = String.valueOf(posmemoria);
        return cadena.replace("-", "_");
    }
}
