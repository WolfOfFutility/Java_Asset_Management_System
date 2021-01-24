
package assetmanagementsystem;

import java.util.ArrayList;
import org.apache.derby.client.am.DateTime;

public class Sale extends Order {
    private String CustomerName;
    
    public Sale(int id, DateTime d, ArrayList<Asset> l, String ot, String cn) {
        super(id, d, l, ot);
        this.CustomerName = cn;
    }
    
}
