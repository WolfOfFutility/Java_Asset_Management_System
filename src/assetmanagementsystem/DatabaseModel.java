package assetmanagementsystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseModel {
    private String connStr = "jdbc:derby://localhost:1527/AssetManagementDatabase";
    private Connection conn;
    private Statement stmt;
    
    public DatabaseModel() {
        // Default
    }
    
    public void Connect() {
        try {
            conn = DriverManager.getConnection(connStr, "APP", "APP");
            stmt = conn.createStatement();
        }
        catch(SQLException e) {
            System.out.println("Database Connection Error: ");
            System.out.println(e);
        }
    }
    
    public ArrayList<Asset> ReturnAllAssets() {
        ArrayList<Asset> assetList = new ArrayList<Asset>();
        
        try {
            ResultSet rset = stmt.executeQuery("SELECT * FROM Assets");
            
            while(rset.next()) {
                Asset newAsset = new Asset(rset.getInt("AssetID"), rset.getString("AssetName"), rset.getInt("Quantity"));
                System.out.println(newAsset.getAssetName());
                assetList.add(newAsset);
            }
        }
        catch(SQLException e) {
            System.out.println("Error Returning All Assets: ");
            System.out.println(e);
        }
        
        return assetList;
    }
    
    public int AddNewAsset(Asset a) {
        int count = 0;
        try {
            PreparedStatement prep = conn.prepareStatement("INSERT INTO Assets(ASSETID, ASSETNAME, QUANTITY) VALUES (?,?,?)");
            prep.setInt(1, a.getAssetID());
            prep.setString(2, a.getAssetName());
            prep.setInt(3, a.getQuantity());
            
            prep.addBatch();
            prep.executeBatch();
        }
        catch(SQLException e) {
            System.out.println("Error Inserting a new Asset: ");
            System.out.println(e);
        }
        
        return count;
    }
    
    public int EditAsset(int assetID, String assetName, int quantity) {
        int count = 0;
        
        try {
            PreparedStatement prep = conn.prepareStatement("UPDATE Assets SET ASSETNAME = ?, QUANTITY = ? WHERE ASSETID = ?");
            prep.setString(1, assetName);
            prep.setInt(2, quantity);
            prep.setInt(3, assetID);
            
            prep.addBatch();
            prep.executeBatch();
        }
        catch(SQLException e) {
            System.out.println("Error Updating an Asset: ");
            System.out.println(e);
        }
        
        return count;
    }
    
    public int DeleteAsset(int assetID) {
        int count = 0;
        
        try {
            PreparedStatement prep = conn.prepareStatement("DELETE FROM Assets WHERE ASSETID = ?");
            prep.setInt(1, assetID);
            
            prep.addBatch();
            prep.executeBatch();
        }
        catch(SQLException e) {
            System.out.println("Error Deleting an Asset: ");
            System.out.println(e);
        }
        
        return count;
    }
    
    public ArrayList<Asset> SearchAssets(String searchTerm) {
        ArrayList<Asset> assetList = new ArrayList<Asset>();
        
        try {
            PreparedStatement prep = conn.prepareStatement("SELECT * FROM Assets WHERE ASSETNAME LIKE ?");
            prep.setString(1, "%" + searchTerm + "%");
            
            ResultSet rset = prep.executeQuery();
            
            while(rset.next()) {
                Asset newAsset = new Asset(rset.getInt("AssetID"), rset.getString("AssetName"), rset.getInt("Quantity"));
                assetList.add(newAsset);
                System.out.println(newAsset.getAssetName());
            }
        }
        catch(SQLException e) {
            System.out.println("Error Searching an Asset: ");
            System.out.println(e);
        }
        
        return assetList;
    }
    
    public boolean AddPurchaseOrder(Purchase pur) {
        boolean success = false;
        
        return success;
    }
}
