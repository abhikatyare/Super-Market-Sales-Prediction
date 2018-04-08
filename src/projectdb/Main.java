/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdb;


import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import com.mini.algorithm.TransformUtils;
import com.mini.algorithm.RidgeRegression;
import com.mini.dataset.Dataset;
import com.mini.features.Feature;
import com.mini.features.FeatureUtils;
import com.mini.features.LFeature;
import java.util.List;

/**
 *
 * @author abhishek
 */
public class Main extends javax.swing.JFrame {
    
    /**
     * Creates new form Main
     */
   
    public Main() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblDisplayData1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ChooseDatasetPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSelectFile = new javax.swing.JButton();
        dataPath = new javax.swing.JTextField();
        btnViewDatabase = new javax.swing.JButton();
        btnLoadDatabase = new javax.swing.JButton();
        ClearDatabasePanel = new javax.swing.JPanel();
        btnClearDatabase = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DoPredictionPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnApplyAlgorithm = new javax.swing.JButton();
        txtRevenue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        txtGrossMargin = new javax.swing.JTextField();
        lblOutput = new javax.swing.JLabel();
        lstOrderMethod = new javax.swing.JComboBox<>();
        lblLoading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayData = new javax.swing.JTable();

        tblDisplayData1.setBorder(null);
        tblDisplayData1.setFont(new java.awt.Font("Ubuntu Condensed", 0, 15)); // NOI18N
        tblDisplayData1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RetailerCountry", "OrderMethodType", "RetailerType", "ProductLine", "ProductType", "Product", "Year", "Quarter", "Revenue", "Quantity", "GrossMargin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDisplayData1.setGridColor(new java.awt.Color(253, 251, 251));
        tblDisplayData1.setPreferredSize(new java.awt.Dimension(850, 70));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 121, 121));

        jLabel2.setFont(new java.awt.Font("Ubuntu Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 244, 244));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_shopping_basket.png"))); // NOI18N
        jLabel2.setText("SUPER MARKET SALES PREDICTION");

        ChooseDatasetPanel.setBackground(new java.awt.Color(232, 232, 232));

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel1.setText("Choose DataSet");

        btnSelectFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_folder.png"))); // NOI18N
        btnSelectFile.setText("Select File");
        btnSelectFile.setName("btnSelectFile"); // NOI18N
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        dataPath.setEditable(false);
        dataPath.setName(""); // NOI18N
        dataPath.setPreferredSize(new java.awt.Dimension(10, 35));
        dataPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPathActionPerformed(evt);
            }
        });

        btnViewDatabase.setText("View Database");
        btnViewDatabase.setPreferredSize(new java.awt.Dimension(115, 35));
        btnViewDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDatabaseActionPerformed(evt);
            }
        });

        btnLoadDatabase.setText("Load Database");
        btnLoadDatabase.setPreferredSize(new java.awt.Dimension(115, 35));
        btnLoadDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDatabaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChooseDatasetPanelLayout = new javax.swing.GroupLayout(ChooseDatasetPanel);
        ChooseDatasetPanel.setLayout(ChooseDatasetPanelLayout);
        ChooseDatasetPanelLayout.setHorizontalGroup(
            ChooseDatasetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseDatasetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChooseDatasetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataPath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ChooseDatasetPanelLayout.createSequentialGroup()
                        .addGroup(ChooseDatasetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnSelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 199, Short.MAX_VALUE))
                    .addComponent(btnViewDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLoadDatabase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ChooseDatasetPanelLayout.setVerticalGroup(
            ChooseDatasetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChooseDatasetPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelectFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoadDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        ClearDatabasePanel.setBackground(new java.awt.Color(232, 232, 232));

        btnClearDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_delete.png"))); // NOI18N
        btnClearDatabase.setText("Clear Database");
        btnClearDatabase.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClearDatabase.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClearDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearDatabaseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel3.setText("Clear Database");

        javax.swing.GroupLayout ClearDatabasePanelLayout = new javax.swing.GroupLayout(ClearDatabasePanel);
        ClearDatabasePanel.setLayout(ClearDatabasePanelLayout);
        ClearDatabasePanelLayout.setHorizontalGroup(
            ClearDatabasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClearDatabasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClearDatabasePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClearDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClearDatabasePanelLayout.setVerticalGroup(
            ClearDatabasePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClearDatabasePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(btnClearDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        DoPredictionPanel.setBackground(new java.awt.Color(232, 232, 232));

        jLabel4.setFont(new java.awt.Font("Ubuntu Condensed", 1, 15)); // NOI18N
        jLabel4.setText("Do Prediction");

        jLabel5.setText("Order Method");

        jLabel6.setText("Revenue");

        btnApplyAlgorithm.setText("Predict Result");
        btnApplyAlgorithm.setPreferredSize(new java.awt.Dimension(121, 35));
        btnApplyAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyAlgorithmActionPerformed(evt);
            }
        });

        jLabel7.setText("Gross Margin");

        jLabel8.setText("Quantity");

        lblOutput.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblOutput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lstOrderMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Website", "Internet", "Phone", "Sales Visit", "Message" }));
        lstOrderMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstOrderMethodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DoPredictionPanelLayout = new javax.swing.GroupLayout(DoPredictionPanel);
        DoPredictionPanel.setLayout(DoPredictionPanelLayout);
        DoPredictionPanelLayout.setHorizontalGroup(
            DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                                .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lstOrderMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(40, 40, 40)
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrossMargin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnApplyAlgorithm, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        DoPredictionPanelLayout.setVerticalGroup(
            DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lstOrderMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(DoPredictionPanelLayout.createSequentialGroup()
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DoPredictionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtGrossMargin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnApplyAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblLoading.setFont(new java.awt.Font("Ubuntu Condensed", 1, 18)); // NOI18N
        lblLoading.setForeground(new java.awt.Color(254, 254, 254));

        jScrollPane1.setBackground(new java.awt.Color(232, 232, 232));

        tblDisplayData.setBackground(new java.awt.Color(232, 232, 232));
        tblDisplayData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RetailerCountry", "OrderMethodType", "RetailerType", "ProductLine", "ProductType", "Product", "Year", "Quarter", "Revenue", "Quantity", "GrossMargin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisplayData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ChooseDatasetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DoPredictionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClearDatabasePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoading, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClearDatabasePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChooseDatasetPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DoPredictionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    ArrayList<String[]> train_data=null;
    String column[]=null;
    String table_name="sales_data";
    load l = new load();
    operations o = new operations();
    private void btnClearDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearDatabaseActionPerformed
        JOptionPane.showMessageDialog(null,"Databse is being cleared","Clearing....",JOptionPane.INFORMATION_MESSAGE);
        o.delete_table(table_name);
        lblLoading.setText("Cleared database");
        DefaultTableModel tbl = (DefaultTableModel) tblDisplayData.getModel();
        clearTable(tbl);
    }//GEN-LAST:event_btnClearDatabaseActionPerformed

    private void dataPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPathActionPerformed

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV (Dataset) Files","csv");
        fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(Main.this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = fc.getSelectedFile();
            //This is where a real application would open the file.
            dataPath.setText(file.getAbsolutePath());
        }
        else 
        {
            dataPath.setText("Open command cancelled by user.");
        }
        dataPath.setCaretPosition(dataPath.getDocument().getLength());
    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void btnLoadDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDatabaseActionPerformed
        JOptionPane.showMessageDialog(null,"Training data is being loaded","Loading....",JOptionPane.INFORMATION_MESSAGE);
                
        try
        {
            String filename = dataPath.getText();
            column = l.load_data(table_name,filename);
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        lblLoading.setText("Loading completed");
       
    }//GEN-LAST:event_btnLoadDatabaseActionPerformed

    private void btnViewDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDatabaseActionPerformed
        JOptionPane.showMessageDialog(null,"Data is being extracted","Extracting....",JOptionPane.INFORMATION_MESSAGE);
        DefaultTableModel tbl = (DefaultTableModel) tblDisplayData.getModel();
        clearTable(tbl);
        train_data=l.retrive_data(table_name, column, tbl);
        lblLoading.setText("Extraction completed");
    }//GEN-LAST:event_btnViewDatabaseActionPerformed

    private void btnApplyAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyAlgorithmActionPerformed
        try{
            // TODO Auto-generated method stub
			//Step 1 Read Dataset
			List<Feature> features = Dataset.readDataset();
			//Step 2 Feature Extraction
			List<LFeature> lfeatures = FeatureUtils.extractFeatures(features);
			//System.out.println(lfeatures);
			//Step 3 Transform Data
			double[][] featuresMatrix = TransformUtils.getMatrix(lfeatures);
			double[] y = TransformUtils.getYArray(lfeatures);
			System.out.println();
			//Step 3 Algorithm
                           RidgeRegression ridge = new RidgeRegression(featuresMatrix,y,0.5);
			//System.out.println(ridge.predict(featuresMatrix[0]));
			//System.out.println(y[0]);
		
			//find lambda
                        	System.out.println("Features from Users");
		
		
		
		double[] arguments = {0,0,0,0};
		
                arguments[0] = lstOrderMethod.getSelectedIndex()+1;
                System.out.println("Selected Item: "+arguments[0]);
                arguments[1] = Double.parseDouble(txtRevenue.getText());
                arguments[2] = Double.parseDouble(txtQuantity.getText());
                arguments[3] = Double.parseDouble(txtGrossMargin.getText());
		
		
		System.out.println("-----------------------------------------------");
		System.out.println(ridge.predict(arguments));
		double res = ridge.predict(arguments);
		if(res >= 0 && res <= 2.5 )
		{
			lblOutput.setText("Bad Sales");
		}
		else if(res > 2.5 && res <=5 )
		{
			lblOutput.setText("Average Sales");
		}
		else if(res > 5.0 && res <=7.5 )
		{
			lblOutput.setText("Good Sales");
		}
		else if(res > 7.5 && res <=10.0 )
		{
                    lblOutput.setText("Excellent Sales");
                }

        }catch(ParseException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnApplyAlgorithmActionPerformed

    private void lstOrderMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstOrderMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstOrderMethodActionPerformed

    void clearTable(DefaultTableModel tbl) {
        int no = tbl.getRowCount();
        int n;
        for (n = 0; n < no; n++) {
            tbl.removeRow(0);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ChooseDatasetPanel;
    private javax.swing.JPanel ClearDatabasePanel;
    private javax.swing.JPanel DoPredictionPanel;
    private javax.swing.JButton btnApplyAlgorithm;
    private javax.swing.JButton btnClearDatabase;
    private javax.swing.JButton btnLoadDatabase;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JButton btnViewDatabase;
    private javax.swing.JTextField dataPath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLoading;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JComboBox<String> lstOrderMethod;
    private javax.swing.JTable tblDisplayData;
    private javax.swing.JTable tblDisplayData1;
    private javax.swing.JTextField txtGrossMargin;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRevenue;
    // End of variables declaration//GEN-END:variables
}
