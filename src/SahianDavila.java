public class SahianDavila {
    private String Codigo;
    private String Marca;
    private int cantidad;
    private String tipo;

    public SahianDavila(){
        Codigo = "A100";
        Marca = "CISCO";
        cantidad = 30;
        tipo = "Router";
    }

    public SahianDavila(String codigo, String marca, int cantidad, String tipo) {
        Codigo = codigo;
        Marca = marca;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "SahianDavila\n" +
                "Codigo= " + Codigo + "Marca= " + Marca +
                "Cantidad=" + cantidad + "Tipo='" + tipo;
    }
}
