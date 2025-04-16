public abstract class NhaSanXuat {

    public NhaSanXuat() {}

    public void layNguyenLieuSanXuatMaTuy() {
        System.out.println("Nha san xuat dang lay nguyen lieu");
    }

    public void vanChuyenMaTuy() {
        PhuongTien phuongTien = taoPhuongTien();
        phuongTien.action();
    }

    public abstract PhuongTien taoPhuongTien();
}
