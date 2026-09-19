package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class array_list1 {
    public static void main(String[] args) {
        ArrayList<Integer> col=new ArrayList<>();
    
    // col.add(2);
    // col.add(3);
    // col.add(4);
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the elements");
    for(int i=0;i<5;i++){
    col.add(obj.nextInt());

    }
    System.out.println(col);
    Collections.sort(col);
    System.out.println(col);
    Collections.swap(col, 2, 3);
    System.out.println(col);


    }
    
}
