public class recursion {
    public int recSum(int x){
        if(x==0){
            return 0;
        }else{
            return x+recSum(x-1);
        }
    }

    public int Sum(int x){
        int s=0,i;
        for(i=0;i<=x;i++){
            s+=i;
        }
        return s;
    }

   public static void main(String[] args) {
     recursion o=new recursion();
     int x=o.Sum(10);
     int y=o.recSum(10);
     System.out.println(x);
     System.out.println(y);
   } 
}
