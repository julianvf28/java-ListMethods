/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.julianvalencia.listmethods;
import java.util.*;

/**
 *
 * @author usuario1
 */
public class ListMethods {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        list.forEach( (n) -> print(n) );
        reverseArray(list).forEach( (n) -> print(n) );
        
    }
    
    public static void print(Integer n) 
    { 
        System.out.println("Student Name is " + n); 
    } 
    
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> b = new ArrayList<>();
        int cant = a.size();
        for (int i = (cant-1); i>=0; i--){
            b.add(a.get(i));
        }
        return b;
    }
}
