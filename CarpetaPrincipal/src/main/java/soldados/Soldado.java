package soldados;
import java.util.Date;
import packagePrincpal.Compañia;
import CuerposEjercito.CuerpoEjercito;

public class Soldado {
    private String CUI;
    private String nombre;
    private Date graduacion;
    public Compañia compañia;
    public CuerpoEjercito cuerpoejercito;
    public Servicio serviciosR;

    public Soldado(String CUI, String nombre, Date graduacion) {
        this.CUI = CUI;
        this.nombre = nombre;
        this.graduacion = graduacion;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(Date graduacion) {
        this.graduacion = graduacion;
    }
}
