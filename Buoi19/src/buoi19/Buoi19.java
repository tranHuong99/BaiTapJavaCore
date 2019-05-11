/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author HUONG XINH GAI
 */
public class Buoi19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Xin chào"); //key không được trùng nhau
        map.put("Book", "Sách");
        map.put("Music", "Âm nhạc");
        System.out.println("Size = "+map.size());
        /*System.out.println(map.get("Hello"));
        System.out.println(map.get("Book"));
        System.out.println(map.get("Music"));*/
        //trả về 1 tập key
        Set<String> keySet = map.keySet();
        Iterator<String> keys = keySet.iterator();
        keySet.iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key + " - " + map.get(key));
        }
        /*Set<Integer> mySet = new HashSet<>();
        mySet.add(20);
        mySet.add(200);
        mySet.add(2000);
        mySet.add(20000);
        mySet.add(20000);
        System.out.println("Size = "+mySet.size());
        System.out.println("--------------");
        Iterator<Integer> iterator = mySet.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }*/
    }
    
}
