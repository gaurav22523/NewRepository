abstract class demo{
    abstract void show();
}
class desuja extends demo{
    public void  show(){
        System.out.println("This is overriding of abstract method");
    }
}

public class stat{
    public static void main(String[] args) {
        desuja d=new desuja();
        d.show();
    }
}