public class MedioPollo extends SuperMenu{
    public MedioPollo(String porsionPapa, String salsaKingdom, String llajua, String porsionPollo, String refresco) {
        super(porsionPapa, salsaKingdom, llajua, porsionPollo, refresco);
    }

    @Override
    public String toString() {
        return "MedioPollo{" +
                "porsionPapa='" + porsionPapa + '\'' +
                ", salsaKingdom='" + salsaKingdom + '\'' +
                ", llajua='" + llajua + '\'' +
                ", porsionPollo='" + porsionPollo + '\'' +
                ", refresco='" + refresco + '\'' +
                '}';
    }
}
