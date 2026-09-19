public class funct {
    public void demo(String a){
        System.out.println("Hello "+a);
    }
    public int add(int a,int b){
        return a+b;
    }
    public String con(String x,String y){
        return x.concat(" ").concat(y);
    }
    public boolean check(int x,int y){
        return x>y;
    }
    public static void main(String[] args) {
        // String a="Gaurav";
        funct s=new funct();   
        s.demo("Gaurav");
        // demo("john");
        System.out.println(s.add(10,30));

        funct d=new funct();
        System.out.println(d.con("Navi", "Mumbai"));

        funct p=new funct();
        System.out.println(p.check(20, 100));
    }
}
