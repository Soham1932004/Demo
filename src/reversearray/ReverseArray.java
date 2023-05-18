package reversearray;

/*
 * @author Soham Panchal,2023
 */

import java.util.*;
public class ReverseArray {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        char[] arr = new char[name.length()];
        
        for(int i = 0; i < name.length(); i++) {
            arr[i] = name.charAt(i);
	}
        
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
    }
    
}
