public class multiple_catch {
    public static void main(String[] args) {
        int a=10;
        int[] arr={2,5,8,90};
        try{
            System.out.println(arr[20]);
            int b=a/0;
        }catch(ArrayIndexOutOfBoundsException|ArithmeticException e){
            System.out.println("Cananot access this index");
        }finally{
            System.out.println("We have seen multiple exceptions");
        }
    }
}
