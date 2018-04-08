/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdb;
/**
 * 
 * @author abhishek
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
public class load extends javax.swing.JFrame {

    /**
     * Creates new form load
     */
      private HBaseAdmin admin; 
     private Configuration con;
     public load()
    {
         try {
             con=HBaseConfiguration.create();
             admin = new HBaseAdmin(con);
         } catch (ZooKeeperConnectionException ex) {
             Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    
    public String[] load_data(String table_name,String filename)
    {
           String column[]=new String[20];
           String line="";
           String record[];
           String delimiter=",";          
           long p_id=0;
           long recID=0;
           try
           {
            
                if(!(admin.isTableAvailable(table_name)))
                {
                    operations o=new operations();
                    o.create_table(table_name);
                    
                    try{
                    
                        HTable table = new HTable(con, table_name);
                        BufferedReader bf = new BufferedReader(new FileReader(filename));
                        line=bf.readLine();
                         column=line.split(delimiter);
                        while ((line = bf.readLine()) != null)
                        {
                        record = line.split(delimiter);
                      
                        Put p = new Put(Bytes.toBytes(Long.toString(p_id++)));
                        int i;
                        for(i=0;i<column.length-1;i++)
                        { 
                                p.add(Bytes.toBytes("Data"), Bytes.toBytes(column[i]), Bytes.toBytes(record[i].toUpperCase().replaceAll("\"", "")));
                        }
                       Put q = new Put(Bytes.toBytes(Long.toString(recID)));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[0]), Bytes.toBytes(record[0].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[1]), Bytes.toBytes(record[1].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[2]), Bytes.toBytes(record[2].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[3]), Bytes.toBytes(record[3].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[4]), Bytes.toBytes(record[4].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[5]), Bytes.toBytes(record[5].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[6]),Bytes.toBytes(record[6].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[7]), Bytes.toBytes(record[7].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[8]), Bytes.toBytes(record[8].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[9]), Bytes.toBytes(record[9].toUpperCase().replaceAll("\"", "")));
                            q.add(Bytes.toBytes("Data"), Bytes.toBytes(column[10]), Bytes.toBytes(record[10].toUpperCase().replaceAll("\"", "")));

                            table.put(q);


                        
                        for (i = 0; i < column.length; i++)
                        {
                            System.out.print(" " + record[i].toUpperCase().replaceAll("\"", "") + " ");
                        }
                        System.out.println();   
                        recID++;
                    }
                    }
                    catch(Exception e)
                    {
                    
                    }
                
                }
                else
                {
                       System.out.println("table "+table_name+" is alredy present");
                }
                
           }
           catch(Exception e)
           {
               
           }
           return column;
    }
    
    
    public ArrayList<String[]> retrive_data(String table_name,String column[],DefaultTableModel tbl)
    {
        
        ArrayList<String[]> data = new ArrayList<>();
         try {
             String retailerCountry,orderMethodType,retailerType, productLine, productType, product, quarter ;
             int year, quantity;
             double revenue, grossMargin; 
             if(admin.isTableAvailable(table_name))
             {
                for(String s:column)
                {
                    System.out.print(s);
                }
                 System.out.println("");
                 
                 HTable table=new HTable(con, table_name);
                 Scan scan=new Scan();
                 scan.setCaching(100);
                 
                 scan.addFamily(Bytes.toBytes("Data"));
            
                 ResultScanner result=table.getScanner(scan);
                 for(Result res=result.next();(res !=null);res=result.next())
                 {
                     retailerCountry = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[0])));
                     orderMethodType = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[1])));
                     retailerType = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[2])));
                     productLine = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[3])));
                     productType = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[4])));
                     product = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[5])));
                     year = Integer.parseInt(Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[6]))));
                     quarter = Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[7])));
                     revenue = Double.parseDouble(Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[8]))));
                     quantity = Integer.parseInt(Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[9]))));
                     grossMargin = Double.parseDouble(Bytes.toString(res.getValue(Bytes.toBytes("Data"),Bytes.toBytes(column[10]))));
                     System.out.println("");
                     
                     
                     //row[0].doubleValue();
                     //data.add(row1);
                     tbl.addRow(new Object[]{retailerCountry,orderMethodType,retailerType,productLine,productType,product,year,quarter,revenue,quantity,grossMargin});
                 }
              return data; 
             }
             return null;
         } catch (IOException ex) {
             Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
