/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;

/**
 *
 * @author Shwartskopff
 */
public class Main {
    public static void main(String[] args) {
        StringService service = new StringService();
        char[] array = service.getCharStat("Плаааанееетыыыы");
        String[] arr = {"Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Меркурий", "Нептун"};
        
        
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("___________________________________________________________________________________");
        
        
        try {
            arr = service.sort(arr, true);
        }catch (StringArrayException e) {
             System.out.println(e.getMessage());
        }
            
            System.out.println("Название планет солнечной системы по алфавиту: ");
            System.out.println(Arrays.toString(arr));
            System.out.println("________________________________________________________________________________");
            
        try {
            arr = service.sort(arr, false);    
        } catch (StringArrayException e) {
            System.out.println(e.getMessage());
    }
        System.out.println("Название планет солнечной системы в обратном порядке: ");
        System.out.println(Arrays.toString(arr));
        
        
        
   
}
}
