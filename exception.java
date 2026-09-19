public class exception {
    public static void main(String[] args) {
        int[] arr={1,2,30};
        try{
            System.out.println(arr[10]);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("The program ends here");
        }
    }
}
