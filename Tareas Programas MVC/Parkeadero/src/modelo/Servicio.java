package modelo;

import java.util.Date;

public class Servicio {
        private long id;
        private Date hoEntrada;
        private Date hoSalida;
        private double valorPagar;
        private Auto auto;

    public Servicio(long id, Date hoEntrada, Date hoSalida, double valorPagar) {
        this.id = id;
        this.hoEntrada = hoEntrada;
        this.hoSalida = hoSalida;
        this.valorPagar = valorPagar;
    }

    public Servicio(long id, Date hoEntrada, Date hoSalida, double valorPagar, Auto auto) {
        this.id = id;
        this.hoEntrada = hoEntrada;
        this.hoSalida = hoSalida;
        this.valorPagar = valorPagar;
        this.auto = auto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getHoEntrada() {
        return hoEntrada;
    }

    public void setHoEntrada(Date hoEntrada) {
        this.hoEntrada = hoEntrada;
    }

    public Date getHoSalida() {
        return hoSalida;
    }

    public void setHoSalida(Date hoSalida) {
        this.hoSalida = hoSalida;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto vehiculo) {
        this.auto = vehiculo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", hoEntrada=" + hoEntrada + ", hoSalida=" + hoSalida + ", valorPagar=" + valorPagar + ", Auto=" + auto + '}';
    }
        
}
