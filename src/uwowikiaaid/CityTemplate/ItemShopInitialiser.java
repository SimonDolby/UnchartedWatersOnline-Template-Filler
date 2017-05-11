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

/**
 *
 * @author Simon
 */
public class ItemShopInitialiser {
       
    public static void ItemFileWrite(
   String ItemFile,
   ArrayList<String> Items
    )
    {
        try {
            //Itemss = new ArrayList(30);
            
            PrintWriter Item;
            Item = new PrintWriter(ItemFile, "UTF-8");
            Item.println("{{h1|Item}}");
            Item.println("==Item Keeper:==");
            Item.println("{| width=100%");
            int j = 0;
                for(int i = 0 ; i < Items.size() ; i++)
                {
                    Item.println("|" + Items.get(i));
                               j++;
                 if (j == 3)
                 {
                     Item.println("|-");
                     j =0;
                 }
                }
            Item.println("|}");
            Item.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ItemShopInitialiser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ItemShopInitialiser.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
    }

}
