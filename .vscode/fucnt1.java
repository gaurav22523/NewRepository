public class fucnt1 {

    public int add(int x,int y){
        return x+y;
    }
    public double add(int x,double y,double z){
        return x+y+z;
    }
    public static void main(String[] args) {
        fucnt1 o=new fucnt1();
        int s=o.add(10,20);
        System.out.println(s);
        double t=o.add(10,20.50,30.);
        System.out.println(t);
    }
}
