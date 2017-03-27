/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.inventory.dao;
import com.inventory.ConfigureProperties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.inventory.beans.Inventory;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.*;
/**
 *
 * @author rajan.chaturvedi
 */
public class InventryMgmtDao {
 
    private Connection conn = null;
   
    public InventryMgmtDao(Properties prop)throws Exception{
        initialize(prop);
    }
    private void initialize(Properties prop)throws Exception{
        System.out.println("-----url------"+prop.getProperty("dbURL"));
        String dbURL = prop.getProperty("dbURL");
         String driver=prop.getProperty("driver");
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(dbURL); 
    }
    
    public void addInventory(Inventory inventory)throws Exception{
        String insert="insert into inventory (BatteryModelNo,PhoneModel,Brand,Type,Polarity,Capacity,BatteryType,PinDetail,ConnectorType) "
                + " values(?,?,?,?,?,?,?,?,?)";
         PreparedStatement pstmt=conn.prepareStatement(insert);
         pstmt.setString(1, inventory.getBatteryModel());
         pstmt.setString(2, inventory.getMobileModel());
         pstmt.setString(3, inventory.getBrand());
         pstmt.setString(4, inventory.getType());
         pstmt.setString(5, inventory.getPolarity());
         pstmt.setString(6, inventory.getCapacity());
         pstmt.setString(7, inventory.getBatteryType());
         pstmt.setString(8, inventory.getPinDetail());
         pstmt.setString(9, inventory.getConnectortype());
         pstmt.executeUpdate();
    }
    
    public ResultSet getAllRecords() throws Exception{
        String select="select * from inventory";
        PreparedStatement pstmt=conn.prepareStatement(select);
        ResultSet rs=pstmt.executeQuery();
        return rs;
    }
    
    public ResultSet getSearchedRecord(String query)throws Exception{
       // String query="select * from inventory where "+ selectable +" like '%"+searchVal+"%'";
        PreparedStatement pstmt=conn.prepareStatement(query);
        ResultSet rs=pstmt.executeQuery();
        return rs;
    }
  
    public void updateInventory(Inventory inventory)throws Exception{
        String update="update inventory set BatteryModelNo=?,PhoneModel=?,Brand=?,Type=?,Polarity=?,Capacity=?,BatteryType=?,PinDetail=?,ConnectorType=? where id=?";
         PreparedStatement pstmt=conn.prepareStatement(update);
         pstmt.setString(1, inventory.getBatteryModel());
         pstmt.setString(2, inventory.getMobileModel());
         pstmt.setString(3, inventory.getBrand());
         pstmt.setString(4, inventory.getType());
         pstmt.setString(5, inventory.getPolarity());
         pstmt.setString(6, inventory.getCapacity());
         pstmt.setString(7, inventory.getBatteryType());
         pstmt.setString(8, inventory.getPinDetail());
         pstmt.setString(9, inventory.getConnectortype());
         pstmt.setInt(10, inventory.getId());
         pstmt.executeUpdate();
    }
    
    public List<String> getSelectableList()throws Exception{
        List<String> selecteble= new ArrayList<String>();
        selecteble.add("Select");
        String query="select * from inventory";
        PreparedStatement pstmt=conn.prepareStatement(query);
        ResultSet rs=pstmt.executeQuery();
        if(rs!=null){
            ResultSetMetaData rsmd=rs.getMetaData();
            selecteble.add(rsmd.getColumnLabel(2));
            selecteble.add(rsmd.getColumnLabel(3));
            //selecteble.add(rsmd.getColumnLabel(4));
            selecteble.add(rsmd.getColumnLabel(5));
            selecteble.add(rsmd.getColumnLabel(6));
            //selecteble.add(rsmd.getColumnLabel(7));
            //selecteble.add(rsmd.getColumnLabel(8));
            selecteble.add(rsmd.getColumnLabel(9));
           
        }
     
        return selecteble;
    }
    public void deleteRecord(int id)throws Exception{
         String query="delete from inventory where id=?";
          PreparedStatement pstmt=conn.prepareStatement(query);
          pstmt.setInt(1, id);
          pstmt.executeUpdate();
    }
}
