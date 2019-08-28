/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ittest;

import java.util.ArrayList;

/**
 *
 * @author Hong Beo
 */
public class Exercise3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<DataObject> listDataObjects = new ArrayList<DataObject>();
      
        DataObject dt1 = new DataObject();
        dt1.setData();
        DataObject dt2 = new DataObject();
        dt2.setData();
        DataObject dt3 = new DataObject();
        dt3.setData();
        
        listDataObjects.add(dt1);
        listDataObjects.add(dt2);
        listDataObjects.add(dt3);
     
        for (DataObject DataObject : listDataObjects) {
            System.out.println(DataObject.toString());
        }
        int sum =0;
        for (int i = 0; i < listDataObjects.size(); i++) {
            sum=sum+listDataObjects.get(i).getCount();
            
        }
        System.out.println("Total count of arraylist :"+sum);

    }
}
