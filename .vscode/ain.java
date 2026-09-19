public class ain {
    static abstract class abs{
        public void display(){
            System.out.println("This is method of abstract class");
        }
    }
    static class demo extends abs{
        public void dis(){
            System.out.println("This is child class");
        }
    }
    
    public static void main(String[] args) {
        demo o=new demo();
        o.dis();
        o.display();
        
        
    }
}
