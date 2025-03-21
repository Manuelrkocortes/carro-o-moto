public class moto extends Vehiculo{
private int cilindrada;

    public moto(String marca , String modelo , int año , double preciobase , int cilindrada) {
        super(marca , modelo , año , preciobase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
