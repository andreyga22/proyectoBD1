/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import java.util.ArrayList;

/**
 *
 * @author josue vargas
 */
public class manager {
    public static manager mana;
    public static ArrayList<String> lista = new ArrayList<>();
    
    public static manager getManager(){
        if(mana == null){
            mana = new manager();
        }
        return mana;
    }
}
