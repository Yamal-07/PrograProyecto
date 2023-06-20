public class destinos {

     private String lugar;
     private String distancia;
     private String fechaSalida;

    public destinos(String lugar, String distancia, String fechaSalida) {
        this.lugar = lugar;
        this.distancia = distancia;
        this.fechaSalida = fechaSalida;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "destinos{" +
                "lugar='" + lugar + '\'' +
                ", distancia='" + distancia + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                '}';
    }
}
