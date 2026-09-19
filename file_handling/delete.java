package file_handling;

import java.io.File;

public class delete {
    public static void main(String[] args) {
        File obj=new File("C:\\Users\\gujar\\OneDrive\\Documents\\Java\\file_handling\\sample.java");
        if(obj.delete()){
            System.out.println("File deleted");
        }else{
            System.out.println("File doesn't exists ");
        }
    }
}
