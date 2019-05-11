/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HUONG XINH GAI
 */
public class en_locale {
    public void en_locale(){
        Map<String, String> map = new HashMap<>();
        map.put("menu", "Menu"); //key không được trùng nhau
        map.put("add", "Add new");
        map.put("exit", "Exit");
        Set<String> keySet = map.keySet();
        Iterator<String> keys = keySet.iterator();
        keySet.iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key + " = " + map.get(key));
        }
    }
}
