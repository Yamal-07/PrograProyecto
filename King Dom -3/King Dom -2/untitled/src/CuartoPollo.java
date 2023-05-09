public class CuartoPollo extends SuperMenu {
    public CuartoPollo(String porsionPapa, String salsaKingdom, String llajua, String porsionPollo, String refresco) {
        super(porsionPapa, salsaKingdom, llajua, porsionPollo, refresco);
    }

    @Override
    public String toString() {
        return "CuartoPollo{" +
                "porsionPapa='" + porsionPapa + '\'' +
                ", salsaKingdom='" + salsaKingdom + '\'' +
                ", llajua='" + llajua + '\'' +
                ", porsionPollo='" + porsionPollo + '\'' +
                ", refresco='" + refresco + '\'' +
                '}';
    }
}
