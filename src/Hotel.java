import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;
    private List<Cliente> clientes;

    public Hotel() {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
        clientes = new ArrayList<>();
    }
    public void addHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.isOcupada()) {
                habitacionesDisponibles.add(habitacion);
            }
        }
        return habitacionesDisponibles;
    }

    public void reservarHabitacion(Reserva reserva) {
        Habitacion habitacion = getHabitacionById(reserva.getHabitacionId());
        if (habitacion != null && !habitacion.isOcupada()) {
            habitacion.setOcupada(true);
            addReserva(reserva);
        } else {
            System.out.println("Habitación no disponible");
        }
    }

    public void eliminarReserva(Reserva reserva) {
        Habitacion habitacion = getHabitacionById(reserva.getHabitacionId());
        if (habitacion!= null) {
            habitacion.setOcupada(false);
            reservas.remove(reserva);
        }
    }

    //otro metodo
    private Habitacion getHabitacionById(int id) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getId() == id) {
                return habitacion;
            }
        }
        return null;
    }

    public double calcularGanancias() {
        double ganancias = 0;
        for (Reserva reserva : reservas) {
            Habitacion habitacion = getHabitacionById(reserva.getHabitacionId());
            Cliente cliente = reserva.getCliente();
            double precio = habitacion.getPrecio() * (1 - cliente.getDescuento());
            ganancias += precio * reserva.getDias();
        }
        return ganancias;
    }
}
