public class NhaSanXuatTrenBien extends NhaSanXuat {
    @Override
    public PhuongTien taoPhuongTien() {
        return new TauThuy();
    }
}
