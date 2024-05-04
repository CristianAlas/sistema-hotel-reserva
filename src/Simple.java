public class Simple extends Habitacion{
    public Simple(int id, double precio) {
        super(id, precio);
    }

    @Override
    public void dibujarFoto() {
        System.out.println("Foto de habitación simple");
    }
}
