import java.util.*;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int number = scanner.nextInt();
        scanner.close();

        if(Verify(number)){
            System.out.println("Pertence a sequência");
        } else {
            System.out.println("Não pertence a sequência");
        }

    }
    public static boolean Verify(int n){
        int a = 0;
        int b = 1;

        while(b < n){
            int c = b;
            b = a + b;
            a = c;
        }
        return a == n || b == n;
    }
}
