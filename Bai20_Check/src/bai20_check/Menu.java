/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai20_check;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HUONG XINH GAI
 */
public class Menu {
    private Map<String, String> map;
    public Menu(){
        this.map = new HashMap<>();
    }
    public void loadData(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader("menu-en.locale"));
            while(true){
                String line = reader.readLine();
            }
        }
    }
    public void print(){
        System.out.printf("\n-----%s------", this.map.get("menu"));
        System.out.printf("\n1. %s", this.map.get("add"));
    }
}
