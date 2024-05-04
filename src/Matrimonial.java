public class Matrimonial extends Habitacion {
    public Matrimonial(int id, double precio) {
        super(id, precio);
    }

    @Override
    public void dibujarFoto() {
        System.out.println("Foto de habitación matrimonial");
    }
}
