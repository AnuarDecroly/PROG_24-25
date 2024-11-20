public enum TipoMovimiento {
    INGRESO("Ingreso"), RETIRADA ("Retirada");

    private String descripcion;

    private TipoMovimiento(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

}
