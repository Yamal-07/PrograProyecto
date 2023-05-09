public class SuperMenu {
    String porsionPapa;
    String salsaKingdom;
    String llajua;
    String porsionPollo;
    String refresco;

    public SuperMenu(String porsionPapa, String salsaKingdom, String llajua, String porsionPollo, String refresco) {
        this.porsionPapa = porsionPapa;
        this.salsaKingdom = salsaKingdom;
        this.llajua = llajua;
        this.porsionPollo = porsionPollo;
        this.refresco = refresco;
    }

    public String getPorsionPapa() {
        return porsionPapa;
    }

    public void setPorsionPapa(String porsionPapa) {
        this.porsionPapa = porsionPapa;
    }

    public String getSalsaKingdom() {
        return salsaKingdom;
    }

    public void setSalsaKingdom(String salsaKingdom) {
        this.salsaKingdom = salsaKingdom;
    }

    public String getLlajua() {
        return llajua;
    }

    public void setLlajua(String llajua) {
        this.llajua = llajua;
    }

    public String getPorsionPollo() {
        return porsionPollo;
    }

    public void setPorsionPollo(String porsionPollo) {
        this.porsionPollo = porsionPollo;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    @Override
    public String toString() {
        return "SuperMenu{" +
                "porsionPapa='" + porsionPapa + '\'' +
                ", salsaKingdom='" + salsaKingdom + '\'' +
                ", llajua='" + llajua + '\'' +
                ", porsionPollo='" + porsionPollo + '\'' +
                ", refresco='" + refresco + '\'' +
                '}';
    }
}


