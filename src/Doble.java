public class Doble extends Habitacion{
    public Doble(int id, double precio) {
        super(id, precio);
    }

    @Override
    public void dibujarFoto() {
        System.out.println("Foto de habitación doble");
    }
}
