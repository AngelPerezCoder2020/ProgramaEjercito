package packagePrincpal;
import java.util.List;

public class Cuartel {
    public String CUI;
    public String ubicacion;
    public String nombre;
    public List<Compañia> ListaCompañias;
    
    public Cuartel(String CUI,String ubicacion,String nombre){
        this.CUI = CUI;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
    }
}