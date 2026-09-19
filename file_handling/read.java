package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        File obj=new File("demo.txt");
        try(Scanner ob=new Scanner(obj)){
            while(ob.hasNextLine()){
                String data=ob.nextLine();
                System.out.println(data);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
