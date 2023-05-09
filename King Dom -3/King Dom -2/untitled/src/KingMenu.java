public class KingMenu extends SuperMenu{
    public KingMenu(String porsionPapa, String salsaKingdom, String llajua, String porsionPollo, String refresco) {
        super(porsionPapa, salsaKingdom, llajua, porsionPollo, refresco);
    }

    @Override
    public String toString() {
        return "KingMenu{" +
                "porsionPapa='" + porsionPapa + '\'' +
                ", salsaKingdom='" + salsaKingdom + '\'' +
                ", llajua='" + llajua + '\'' +
                ", porsionPollo='" + porsionPollo + '\'' +
                ", refresco='" + refresco + '\'' +
                '}';
    }
}
