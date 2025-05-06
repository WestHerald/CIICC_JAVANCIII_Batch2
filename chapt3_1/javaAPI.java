package chapt3_1;
public class javaAPI {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Start");
        System.out.println(sb);
        sb.append("+Middle");
        System.out.println(sb);
        StringBuilder same = sb.append("+end");
        System.out.println(sb+"\n");

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        sb2.insert(6, "-");
        System.out.println(sb2);
        sb2.insert(0, "-");
        System.out.println(sb2);
        sb2.insert(4, "-");
        System.out.println(sb2);

        sb2.deleteCharAt(0);
        System.out.println(sb2);
        sb2.delete(3, 8);
        System.out.println(sb2+"\n");

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z);
        System.out.println(x.equals(z));
    }
}