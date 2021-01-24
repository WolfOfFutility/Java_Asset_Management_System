/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanagementsystem;

/**
 *
 * @author ceeji
 */
public class AssetManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatabaseModel db = new DatabaseModel();
        db.Connect();
        
        Presenter p = new Presenter(db);
        View v = new View(p);
        p.SetView(v);
        
        p.OpenView(v);
        
        
//        db.SearchAssets("Asset");
//        db.ReturnAllAssets();
//        db.DeleteAsset(3);
//        db.AddNewAsset(new Asset(3, "Test Asset 3", 10));
//        db.EditAsset(2, "Changed Asset Name", 15);
    }
    
}
