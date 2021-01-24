/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author ceeji
 */
public class Presenter {
    private View view;
    private DatabaseModel db;
    
    public Presenter() {
        // Default 
    }
    
    public Presenter(DatabaseModel db) {
        this.db = db;
    }
    
    public void SetView(View v) {
        this.view = v;
    }
    
    public void ShowAllAssets() {
        ArrayList<Asset> assetList = db.ReturnAllAssets();
        view.ShowAllAssets(assetList);
    }
    
    public void SearchAsset(String searchTerm) {
        ArrayList<Asset> assetList = db.SearchAssets(searchTerm);
        view.ShowSearchResults(assetList);
    }
    
    public void AddNewAsset(int id, String name, int quan) {
        db.AddNewAsset(new Asset(id, name, quan));
    }
    
    public void DeleteAsset(int id) {
        db.DeleteAsset(id);
    }
    
    public void UpdateAsset(int id, String name, int quan) {
        db.EditAsset(id, name, quan);
    }
    
    public void OpenView(View v) {
        v.setVisible(true);
    }
}
