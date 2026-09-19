package file_handling;

import java.io.File;
import java.io.IOException;

public class first {
    public static void main(String[] args) {
        try{
            File obj=new File("demo.txt");
            if(obj.createNewFile()){
                System.out.println("File created "+obj.getName());
            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}
