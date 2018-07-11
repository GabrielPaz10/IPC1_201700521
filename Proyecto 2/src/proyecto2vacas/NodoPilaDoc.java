package proyecto2vacas;

/**
 *
 * @author Ludwing_98
 */
public class NodoPilaDoc {
    int doc=0;
    NodoPilaDoc siguiente;

    public NodoPilaDoc() {
        setDoc(this.doc+1);
        setSiguiente(null);
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public NodoPilaDoc( NodoPilaDoc siguiente) {
        this.doc = this.doc+1;
        this.siguiente = siguiente;
    }

    public NodoPilaDoc getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPilaDoc siguiente) {
        this.siguiente = siguiente;
    }
}
