import java.util.*;
public class Exercise5 {
    String str;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str = scanner.next();

        String invertida = "";
        for(int i = str.length() - 1; i >= 0; i--){
            invertida += str.charAt(i);
        }
        System.out.println(invertida);
    }
}
