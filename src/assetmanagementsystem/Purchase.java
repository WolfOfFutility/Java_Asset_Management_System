
package assetmanagementsystem;

import java.util.ArrayList;
import org.apache.derby.client.am.DateTime;

public class Purchase extends Order {
    private String CompanyName;
    
    public Purchase(int id, DateTime d, ArrayList<Asset> l, String ot, String cn) {
        super(id, d, l, ot);
        this.CompanyName = cn;
    }
}
