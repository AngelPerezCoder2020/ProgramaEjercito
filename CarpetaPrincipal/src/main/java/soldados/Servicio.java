package soldados;
import java.util.Date;

public class Servicio {
    public Date fechaRealizacion;
    public String Codigo;
    public String Descripcion;

    public Servicio(Date fechaRealizacion, String Codigo, String Descripcion) {
        this.fechaRealizacion = fechaRealizacion;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
    }
}
