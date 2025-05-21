public class Task8 {
    static int sum (int num) {
        System.out.print(num+" = ");
        return num*(num+1)/2;
    }
    public static void main(String[] args) {
        System.out.println(sum(4));
        System.out.println(sum(5));
        System.out.println(sum(10));
    }
}
