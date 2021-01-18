package model;

import java.io.Serializable;

public interface WarehouseManagement extends Serializable {
   
    //kiểm tra số lượng hàng tồn kho.
     int checkInventory();
    //tính tổng số tiền đã bán của loại sản phẩm.
     double totalSoldMoney();
    // tính tổng lợi nhuận
     double checkInterest();
}
