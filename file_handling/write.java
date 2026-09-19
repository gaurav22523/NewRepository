package file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try{
            FileWriter obj=new FileWriter("demo.txt");
            obj.write("This is demo file crated by and writen by java file handling and it done");
            obj.append("\nThis is some appended text");
            obj.close();
            System.out.println("Written successfully");
        }catch(IOException e){
            System.out.println("Error occured ");
            e.printStackTrace();
        }
    }
}
