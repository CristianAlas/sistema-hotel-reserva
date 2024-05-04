public class Habitual extends Cliente{
    private double descuento;

    public Habitual(String nombre, int dias, double descuento) {
        super(nombre, dias);
        this.descuento = descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    public void cambiarDescuento(double newDescuento) {
        this.descuento = newDescuento;
    }

    @Override
    public String toString() {
        return " Habitual, " +
                " Nombre = " + getNombre() +
//                " Dias = " + getNombre() +
                " descuento, = " + descuento;
    }
}
