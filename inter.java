public interface demo1 {
    void soo();
}

public interface demo2{
    void too();
}

class jva implements demo1,demo2{
    public void soo(){
        System.out.println("This is coming from interface 1 method");
    }
     public void too(){
        System.out.println("This is coming from interface 2 method");
    }
}

public class inter {
    public static void main(String[] args) {
        jva o=new jva();
        o.soo();
        o.too();
        
    }
}
