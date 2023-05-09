public class SoloMedio extends SuperMenu{
    public SoloMedio(String porsionPapa, String salsaKingdom, String llajua, String porsionPollo, String refresco) {
        super(porsionPapa, salsaKingdom, llajua, porsionPollo, refresco);
    }

    @Override
    public String toString() {
        return "SoloMedio{" +
                "porsionPapa='" + porsionPapa + '\'' +
                ", salsaKingdom='" + salsaKingdom + '\'' +
                ", llajua='" + llajua + '\'' +
                ", porsionPollo='" + porsionPollo + '\'' +
                ", refresco='" + refresco + '\'' +
                '}';
    }
}
