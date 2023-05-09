public class Empleado {
    String nombreE;
    int ci;
    int cell;
    String email;
    int password;

    public Empleado(String nombreE, int ci, int cell, String email, int password) {
        this.nombreE = nombreE;
        this.ci = ci;
        this.cell = cell;
        this.email = email;
        this.password = password;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreE='" + nombreE + '\'' +
                ", ci=" + ci +
                ", cell=" + cell +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}