public class Cliente {
    String nombreC;
    int nit;

    public Cliente(String nombreC, int nit) {
        this.nombreC = nombreC;
        this.nit = nit;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreC='" + nombreC + '\'' +
                ", nit=" + nit +
                '}';
    }
}
