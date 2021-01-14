package model;

public interface WarehouseManagement {

    //kiểm tra số lượng hàng tồn kho.
    public int checkInventory();
    //tính tổng số tiền đã bán của loại sản phẩm.
    public double totalSoldMoney();
    // tính tổng lợi nhuận
    public double checkInterest();
}
