package controlador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import modelo.Servicio;
import modelo.Auto;
public class ServicioControlador {
    private  List<Servicio> datos;
    private Servicio seleccionado;
    public static double COSTO_HORA = 1;    
    public ServicioControlador(){
        datos = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(datos.size() > 0)
            return datos.get(datos.size() -1).getId() + 1;
        return 1;
    }
    public boolean crear(Date hoEntrada, Date hoSalida, double valorPagar, Auto auto){
        Servicio servicio = new Servicio(this.generarId(), hoEntrada, hoSalida, valorPagar, auto);
        auto.getListaServicios().add(servicio);
        return datos.add(servicio);
    }
    public Servicio buscar(Date hoEntrada) {
        for (Servicio dato : datos) {
            if(dato.getHoEntrada().equals(hoEntrada))
                return dato;
        }
        return null;
    }
    public boolean actualizar(Date hoEntrada, Date hoSalida){
        Servicio servicio = this.buscar(hoEntrada);
        if(servicio != null) {
            int posicion = datos.indexOf(servicio);
            servicio.setHoSalida(hoSalida);
            long diferenciaSegundos = Math.abs(servicio.getHoSalida().getTime() - servicio.getHoEntrada().getTime());
            long minutos = TimeUnit.MINUTES.convert(diferenciaSegundos, TimeUnit.MILLISECONDS);
            double valorPagar = minutos * (this.COSTO_HORA / 60);
            servicio.setValorPagar(valorPagar);
            datos.set(posicion, servicio);
            return true;
        }
        return false;
    }
    public boolean eliminar(Date horaEntrada) {
        Servicio servicio = this.buscar(horaEntrada);
        if(servicio != null){
            servicio.getAuto().getListaServicios().remove(servicio);
            return datos.remove(servicio);
        }
        return false;
    }

    public List<Servicio> getDatos() {
        return datos;
    }

    public void setDatos(List<Servicio> datos) {
        this.datos = datos;
    }

    public Servicio getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Servicio seleccionado) {
        this.seleccionado = seleccionado;
    }
}

