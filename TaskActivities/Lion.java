import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lion {
    public void roar(String roar1, StringBuilder roar2) {
    roar1.concat("!!!");
    roar2.append("!!!");
}
public static void main(String[] args) {
    String roar1 = "roar";
    StringBuilder roar2 = new StringBuilder("roar");
    new Lion().roar(roar1, roar2);
    System.out.println(roar1 + " " + roar2);

    String s1 = "Hello";
    String t = new String(s1);
    if ("Hello".equals(s1)) System.out.println("one");
    if (t == s1) System.out.println("two");
    if (t.equals(s1)) System.out.println("three");
    if ("Hello" == s1) System.out.println("four");
    if ("Hello" == t) System.out.println("five");

    // String s11 = "java";
    // StringBuilder s2 = new StringBuilder("java");
    // if (s11 == s2)
    // System.out.print("1");
    // if (s11.equals(s2))
    // System.out.print("2");


    String numbers = "012345678";
    System.out.println(numbers.substring(1, 3));
    System.out.println(numbers.substring(7, 7));
    System.out.println(numbers.substring(7));

    String s = "purr";
    s.toUpperCase();
    s.trim();
    s.substring(1, 3);
    s += " two";
    System.out.println(s.length());
    System.out.println(s);

    String a = "";
    a += 2;
    a += 'c';
    a += false;
    if ( a == "2cfalse") System.out.println("==");
    if ( a.equals("2cfalse")) System.out.println("equals");

    StringBuilder numbers2 = new StringBuilder("0123456789");
    numbers2.delete(2, 8);
    numbers2.append("-").insert(2, "+");
    System.out.println(numbers2);

    // StringBuilder b = "rumble"; error
    /*
    Pwede if
    */
    StringBuilder b = new StringBuilder("rumble");
    b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
    System.out.println(b);

    StringBuilder puzzle = new StringBuilder("Java");
    puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
    System.out.println(puzzle);

    // int[][] scores = new int[5][];
    // Object[][][] cubbies = new Object[3][0][5];
    // String beans[] = new beans[6];
    // java.util.Date[] dates[] = new java.util.Date[2][];
    // int[][] types = new int[];
    // int[][] java = new int[][];

    // char[]c = new char[2];
    // int length = c.length;

    ArrayList l = new ArrayList();
    int length = l.size();

    int[] random = { 6, -4, 12, 0, -10 };
    int x = 12;
    int y = Arrays.binarySearch(random, x);
    System.out.println(y);

    List<Integer> list = Arrays.asList(10, 4, -1, 5);
    Collections.sort(list);
    Integer array[] = list.toArray(new Integer[4]);
    System.out.println(array[0]);

    // String [] names = {"Tom", "Dick", "Harry"};
    // List<String> list2 = names.asList();
    // list2.set(0, "Sue");
    // System.out.println(names[0]);

    List<String> one = new ArrayList<String>();
    one.add("abc");
    List<String> two = new ArrayList<>();
    two.add("abc");
    if (one == two)
    System.out.println("A");
    else if (one.equals(two))
    System.out.println("B");
    else
    System.out.println("C");

    // LocalDate date1 = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
    // date1.plusDays(2);
    // date1.plusHours(3);
    // System.out.println(date1.getYear() + " " + date1.getMonth() + " "
    // + date1.getDayOfMonth());

    LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
    date.plusDays(2);
    date.plusYears(3);
    System.out.println(date.getYear() + " " + date.getMonth() + " "
    + date.getDayOfMonth());

    LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
    Period p = Period.ofDays(1).ofYears(2);
    d = d.minus(p);
    DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
    .SHORT);
    System.out.println(f.format(d));
    // https://docs.google.com/forms/d/e/1FAIpQLSft2SGwMkrxLGT6b80Hzm6OSowcjhPfBsrvDQeOEUYd2Q7pOQ/viewscore?pli=1&pli=1&viewscore=AE0zAgDzu2uoj3ulLAXBwa6P4xCnpAbve7czlaQfxzjZ1eLh_PlKgnJOGcYtp0ZVz_S13SY
    // https://docs.google.com/forms/d/e/1FAIpQLSft2SGwMkrxLGT6b80Hzm6OSowcjhPfBsrvDQeOEUYd2Q7pOQ/viewscore?viewscore=AE0zAgDSuPWxSQGAoJG8VbpUV0VvkCmviw7AOLFz-AYbmCQMJVJXTt-_jCYA8pXO-_83a4s
}  
}
