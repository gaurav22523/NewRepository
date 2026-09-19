package file_handling;

import java.io.File;
import java.io.IOException;

public class one_more {
    public static void main(String[] args) {
        try{
            File obj=new File("C:\\Users\\gujar\\OneDrive\\Documents\\Java\\file_handling\\sample.java");
            if(obj.createNewFile()){
                System.out.println("File created successufully "+obj.getName());
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}
