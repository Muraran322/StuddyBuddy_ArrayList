
package studdybuddy_arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StuddyBuddy_ArrayList {

   
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       
       list.add("Timothy");
       list.add("Anthony");
       list.add("Stephany");
       list.add("Muraran");
       list.add("Akinyi");
       list.add("Munyau");
       
       JOptionPane.showMessageDialog(null, list, "Initial ArrayList: ", JOptionPane.INFORMATION_MESSAGE);
       
       //Iterating through all elements in an ArrayList
        for (String element : list) {
            JOptionPane.showMessageDialog(null, element, "Iterating through: ", JOptionPane.INFORMATION_MESSAGE);
        }
        System.out.println();
        
        //Insert an element into the ArrayList at the first position
        list.add(0, "Marwa");
        JOptionPane.showMessageDialog(null, list, "ArrayList after inserting at first position: ", JOptionPane.INFORMATION_MESSAGE);
       
        //Retrieve an element (at a specified index) from a given ArrayList
        String elementAtIndex2 = list.get(3);
        JOptionPane.showMessageDialog(null, elementAtIndex2, "Element at index 3: ", JOptionPane.INFORMATION_MESSAGE);
       
        //Update an array element by the given element
        list.set(3, "SleepingBeauty");
        JOptionPane.showMessageDialog(null, list, "ArrayList after updating element at index 3: ", JOptionPane.INFORMATION_MESSAGE);
        
         //Remove the third element from the ArrayList
        list.remove(2);
        JOptionPane.showMessageDialog(null, list, "ArrayList after removing the third element: ", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}



