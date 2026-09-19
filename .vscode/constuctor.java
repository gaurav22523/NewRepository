public class constuctor {
    int x,y;
    public constuctor(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        constuctor d=new constuctor(10,20);
        System.out.println(d.x);
        System.out.println(d.y);
    }
}
