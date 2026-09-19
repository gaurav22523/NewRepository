class a{
    public void ret(){
        System.out.println("This is method  parent");
    }
}
class b extends a{
    public void te(){
        System.out.println("This is method of child");
    }
}
class c extends a{
    public void re(){
        System.out.println("This is method of second child");
    }
}


public class inher {
    public static void main(String[] args) {
       c obj=new c();
       obj.ret();
    }
}
