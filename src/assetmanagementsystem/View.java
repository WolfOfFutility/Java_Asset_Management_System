/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assetmanagementsystem;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ceeji
 */
public class View extends javax.swing.JFrame {

    private Presenter p;
    
    public View(Presenter p) {
        initComponents();
        this.p = p;
        
        searchButton.addActionListener((ActionEvent e) -> {
            System.out.println(searchTypeSelect.getSelectedItem().toString());
            if(searchTypeSelect.getSelectedItem().toString().trim() == "Assets") {
                p.SearchAsset(searchField.getText());
            }
            else {
                // Search orders
            }
        });
        
        showAllButton.addActionListener((ActionEvent e) -> {
            if(searchTypeSelect.getSelectedItem().toString().trim() == "Assets") {
                p.ShowAllAssets();
            }
            else {
                // Show orders
            }
        });
        
        createButton.addActionListener((ActionEvent e) -> {
            System.out.println("Create Button Clicked");
        });
        
        deleteButton.addActionListener((ActionEvent e) -> {
           int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete that asset?");
           
           if(input == 0) {
               System.out.println("Deleted"); 
           }
           else {
               System.out.println("Cancelled"); 
           }
        });
        
        editButton.addActionListener((ActionEvent e) -> {
           System.out.println("Edit Button Pressed");
        });
        
        addPurchaseButton.addActionListener((ActionEvent e) -> {
            System.out.println("Add Purchase Button Pressed");
        });
        
        addSaleButton.addActionListener((ActionEvent e) -> {
            System.out.println("Add Sale Button Pressed");
        });
    }
    
    // Show all of the results that match the search entered
    public void ShowSearchResults(ArrayList<Asset> assetList) {
       String[] columns = new String[] {
         "AssetID", "Asset Name", "Quantity"  
       };
       
       String[][] data = new String[assetList.size()][3];
       
       for(int i = 0; i < assetList.size(); i++) {
           data[i][0] = String.valueOf(assetList.get(i).getAssetID());
           data[i][1] = assetList.get(i).getAssetName();
           data[i][2] = String.valueOf(assetList.get(i).getQuantity());
       }
       
       DefaultTableModel dtm = new DefaultTableModel(data, columns);
       
       dataTable.setModel(dtm);
    }
    
    // Show all of the assets 
    public void ShowAllAssets(ArrayList<Asset> assetList) {
       String[] columns = new String[] {
         "AssetID", "Asset Name", "Quantity"  
       };
       
       String[][] data = new String[assetList.size()][3];
       
       for(int i = 0; i < assetList.size(); i++) {
           data[i][0] = String.valueOf(assetList.get(i).getAssetID());
           data[i][1] = assetList.get(i).getAssetName();
           data[i][2] = String.valueOf(assetList.get(i).getQuantity());
       }
       
       DefaultTableModel dtm = new DefaultTableModel(data, columns);
       
       dataTable.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        showAllButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        addPurchaseButton = new javax.swing.JButton();
        addSaleButton = new javax.swing.JButton();
        searchTypeSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setText("Search");

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(dataTable);

        showAllButton.setText("Show All");

        deleteButton.setText("Delete");

        editButton.setText("Edit");

        createButton.setText("Create");

        addPurchaseButton.setText("Add Purchase");

        addSaleButton.setText("Add Sale");

        searchTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assets", "Orders" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addSaleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addPurchaseButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(showAllButton)
                    .addComponent(searchTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(editButton)
                    .addComponent(createButton)
                    .addComponent(addPurchaseButton)
                    .addComponent(addSaleButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
//////            public void run() {
//////                new View().setVisible(true);
//////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPurchaseButton;
    private javax.swing.JButton addSaleButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> searchTypeSelect;
    private javax.swing.JButton showAllButton;
    // End of variables declaration//GEN-END:variables
}
