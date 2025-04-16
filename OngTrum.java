public class OngTrum {
    private NhaSanXuat nhaSanXuatChoOngTrum;

    public OngTrum() {}

    public void trienKhaiKeHoach() {
        nhaSanXuatChoOngTrum.layNguyenLieuSanXuatMaTuy();
        nhaSanXuatChoOngTrum.vanChuyenMaTuy();
    }

    public void sanXuatTrenDatLien() {
        nhaSanXuatChoOngTrum = new NhaSanXuatTrenDatLien();
    }

    public void sanXuatTrenBien() {
        nhaSanXuatChoOngTrum = new NhaSanXuatTrenBien();
    }

}
