import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Create a hotel with some habitaciones
        Hotel hotel = new Hotel();

        Habitacion habitacion1 = new Simple(1, 50);
        Habitacion habitacion2 = new Doble(2, 100);
        Habitacion habitacion3 = new Matrimonial(3, 150);

        hotel.addHabitacion(habitacion1);
        hotel.addHabitacion(habitacion2);
        hotel.addHabitacion(habitacion3);

        // Create some clientes
        Cliente habitual = new Habitual(" Juan Anaya, ", 3, 0.10);
        Cliente esporadico = new Esporadico(" Pedro Campos, ", 2);

        // Create some reservas
        Reserva reservaHabitual = new Reserva(1, habitual, new Date(), 3);
        Reserva reservaEsporadico = new Reserva(2, esporadico, new Date(), 2);

        // Reservar habitaciones
        hotel.reservarHabitacion(reservaHabitual);
        hotel.reservarHabitacion(reservaEsporadico);

        // Imprimir información del hotel y Dibujar fotos de las habitaciones
        System.out.println("--------------------------------- Menu de Habitaciones ---------------------------------");
        System.out.println("Habitación Normal: ");
        System.out.println("Precio: " + habitacion1.getPrecio());
        habitacion1.dibujarFoto();
        System.out.println("Habitación Doble: ");
        System.out.println("Precio: " + habitacion2.getPrecio());
        habitacion2.dibujarFoto();
        System.out.println("habitación Matrimonial: ");
        System.out.println("Precio: " + habitacion3.getPrecio());
        habitacion3.dibujarFoto();

        System.out.println("--------------------------------- Habitaciones disponibles --------------------------------- ");
        System.out.println(hotel.getHabitacionesDisponibles());

        System.out.println("--------------------------------- Reservas de Habitaciones --------------------------------- ");
        // Imprimir información de las reservas
        System.out.println("Reserva 1: " + reservaHabitual);
        System.out.println("Reserva 2: " + reservaEsporadico);

        System.out.println("--------------------------------- Reservas Eliminadas --------------------------------- ");
//        Eliminar reserva
        hotel.eliminarReserva(reservaEsporadico);
        System.out.println("Reserva Cliente esporádico");

        // Cambiar precio habitación
        habitacion1.cambiarPrecio(75);
        System.out.println("--------------------------------- Cambiar Precio --------------------------------- ");
        System.out.println("Se cambiara el precion a la habitacion normal....");
        System.out.println("El nuevo precio es: $75" );

        System.out.println("--------------------------------- Cambiar descuento --------------------------------- ");
        System.out.println("Se cambiara el descuento al cliente habitual....");
        System.out.println("El nuevo descuento es de: 25%" );
        // Cambiar descuento cliente
        habitual.cambiarDescuento(0.25);

        System.out.println("--------------------------------- Ganancias totales ---------------------------------");
        // Calcular ganancias
        System.out.println("Total: " + hotel.calcularGanancias());

    }
}