package Logic;

public class Vowels {
public static void main(String[] args) {
    String str = "Hello EveryOne";
    System.out.println("original string = " + str);
    System.out.println("After replacing all vowels into capital case = " +
                               str.replaceAll("a", "A").replaceAll("e", "E")
                               .replaceAll("i", "I").replaceAll("o", "O")
                               .replaceAll("u", "U"));
}
}
