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
public class CraftShopInitialiser {
       
    public static void CraftFileWrite(
   String CraftFile,
   ArrayList<String> Crafts
    )
    {
        try {
            //Craftss = new ArrayList(30);
            
            PrintWriter Craft;
            Craft = new PrintWriter(CraftFile, "UTF-8");
            Craft.println("{{h1|Craft}}");
            Craft.println("==Craft Keeper:==");
            Craft.println("{| width=100%");
            int j = 0;
                for(int i = 0 ; i < Crafts.size() ; i++)
                {
                    Craft.println("|" + Crafts.get(i));
                          j++;
                 if (j == 3)
                 {
                     Craft.println("|-");
                     j =0;
                 }
               
                }
                    Craft.println("|-");
               
                
          
            Craft.println("|}");
            Craft.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CraftShopInitialiser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CraftShopInitialiser.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
    }

}
