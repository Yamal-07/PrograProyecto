public class empleados {

    private String nombre;
    private String codEmpresa;
    private int ci;
    private int celular;
    private String puestoTrabajo;

    public empleados(String nombre, String codEmpresa, int ci, int celular, String puestoTrabajo) {
        this.nombre = nombre;
        this.codEmpresa = codEmpresa;
        this.ci = ci;
        this.celular = celular;
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    @Override
    public String toString() {
        return "empleados{" +
                "nombre='" + nombre + '\'' +
                ", codEmpresa='" + codEmpresa + '\'' +
                ", ci=" + ci +
                ", celular=" + celular +
                ", puestoTrabajo='" + puestoTrabajo + '\'' +
                '}';
    }
}
