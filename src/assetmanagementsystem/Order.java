
package assetmanagementsystem;

import java.util.ArrayList;
import org.apache.derby.client.am.DateTime;

public class Order {
    private final int OrderID;
    private final DateTime OrderDateTime;
    private final ArrayList<Asset> OrderList;
    private final String OrderType;
    
    public Order(int id, DateTime d, ArrayList<Asset> l, String ot) {
        this.OrderID = id;
        this.OrderDateTime = d;
        this.OrderList = l;
        this.OrderType = ot;
    }
}
