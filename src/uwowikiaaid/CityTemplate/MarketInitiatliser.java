/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uwowikiaaid.CityTemplate;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author Simon
 */
public class MarketInitiatliser {
  
    
    public static void MarketFileWrite(
   String MarketFile,
    ArrayList<String> Goods,
   ArrayList<String> Items
    )
    {
        //Goods = new ArrayList(30);
        try {
           
            PrintWriter Market;
            Market = new PrintWriter(MarketFile, "UTF-8");
            Market.println("{{h1|Market}}");
            Market.println("==Market Keeper:==");
            Market.println("{| width=100%");
            
            int i = 0;
             for(int x = 0; x < Goods.size() ; x = x + 1) {
                     Market.println("|" + Goods.get(x));
                           i++;
                 if (i == 3)
                 {
                     Market.println("|-");
                     i =0;
                 }
                }
         
          
            Market.println("|}");
            
            Market.println("==Pedlar==");
             Market.println("{| width=100%");
             int j = 0;
            for(int l = 0; l < Items.size(); l = l + 1){
                
                  Market.println("|" + Items.get(l));
                     j++;
                 if (j == 3)
                 {
                     Market.println("|-");
                     j =0;
                 }
             
            }
           
             Market.println("|}");
            Market.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MarketInitiatliser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(MarketInitiatliser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
