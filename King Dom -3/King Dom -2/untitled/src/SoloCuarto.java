public class SoloCuarto extends SuperMenu{
    public SoloCuarto(String porsionPapa, String salsaKingdom, String llajua, String porsionPollo, String refresco) {
        super(porsionPapa, salsaKingdom, llajua, porsionPollo, refresco);
    }

    @Override
    public String toString() {
        return "SoloCuarto{" +
                "porsionPapa='" + porsionPapa + '\'' +
                ", salsaKingdom='" + salsaKingdom + '\'' +
                ", llajua='" + llajua + '\'' +
                ", porsionPollo='" + porsionPollo + '\'' +
                ", refresco='" + refresco + '\'' +
                '}';
    }
}
