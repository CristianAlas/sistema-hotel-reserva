import java.util.Date;

public class Reserva {
    private int habitacionId;
    private Cliente cliente;
    private Date fechaInicio;
    private int dias;

    public Reserva(int habitacionId, Cliente cliente, Date fechaInicio, int dias) {
        this.habitacionId = habitacionId;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.dias = dias;
    }

    public void setHabitacionId(int habitacionId) {
        this.habitacionId = habitacionId;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getHabitacionId() {
        return habitacionId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public int getDias() {
        return dias;
    }

    @Override
    public String toString() {
        return " Reserva " +
                " habitacion Id = " + habitacionId +
                ", cliente = " + cliente +
                " fechaInicio = " + fechaInicio +
                ", dias = " + dias;
    }
}
