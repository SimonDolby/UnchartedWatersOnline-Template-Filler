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
public class TavernInitialiser {
       
    public static void tavernFileWrite(
   String tavernFile,
   ArrayList<String> taverns
//ArrayList<String> aide
    )
    {
        try {
           
            PrintWriter tavern;
            tavern = new PrintWriter(tavernFile, "UTF-8");
            tavern.println("{{h1|tavern}}");
            tavern.println("==tavern Keeper:==");
            tavern.println("{| width=100%");
            int j = 0;
             for(int i = 0 ; i < taverns.size()  ; i++)
                {
                    tavern.println("|" + taverns.get(i));
                    
                              j++;
                 if (j == 3)
                 {
                     tavern.println("|-");
                     j =0;
                 }
                } 
        //     tavern.println("==Aides:==");
          //   for(int i = 0 ; i == aide.size(); i++)
          //      {
          //          tavern.println("|" + aide.get(i));
          ///                    j++;
            //     if (j == 3)
            //     {
            //         tavern.println("|-");
            //         j =0;
           //      }
           //     } 
            tavern.println("|}");
            tavern.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TavernInitialiser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TavernInitialiser.class.getName()).log(Level.SEVERE, null, ex);
        }
            
      
    }

}
