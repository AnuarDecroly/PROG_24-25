public class Producto {

    private String cod;
    private double precio;
    private int cantidad;
    private int categoria;

    public Producto(String cod, int cantidad, double precio, int categoria) {
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.cod = cod;
        this.precio = precio;
    }



    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("cod=").append(cod);
        sb.append(", precio=").append(precio);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }

    
}

