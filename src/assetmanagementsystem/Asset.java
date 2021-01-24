// @Author: Ceejay Kelly
// @Description: Asset Management System to track warehousing

package assetmanagementsystem;

public class Asset {
    private int AssetID;
    private String AssetName;
    private int Quantity;
    
    public Asset() {
        // Default
    }
    
    public Asset(int id, String an, int q) {
        this.AssetID = id;
        this.AssetName = an;
        this.Quantity = q;
    }

    public int getAssetID() {
        return AssetID;
    }

    public void setAssetID(int AssetID) {
        this.AssetID = AssetID;
    }

    public String getAssetName() {
        return AssetName;
    }

    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}
