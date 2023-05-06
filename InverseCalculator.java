import java.util.Random; // java.util è una collezioni di classe necessaria per richiamare una specifica classe
import java.util.Scanner;

public class InverseCalculator{
    private static char getRandomOp(){
        Random random = new Random(); // per creare un oggetto si fa: tipo nome = new tipo()
        int op = random.nextInt(4); // genera un numero INTERO compreso tra 0 e (x) dove x è 4

        switch(op){
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3: 
                return '/';
            default:
                return 'e';
        }
    }

    private static int calculateResult(int a, int b, char op){
        switch(op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default: 
                return 0;
        }
    }

    @SuppressWarnings("resource") // annotazione, aggiunge un "segnalibro"
    private static int readAnswer(){
        Scanner scanner = new Scanner(System.in); // system.in serve a leggere da input standard
        int answer = scanner.nextInt();
        return answer;
    }

    public static void main(String[] args){
        Random random = new Random();
        int a = random.nextInt(20);
        int b = random.nextInt(10);

        char op = getRandomOp();
        int result = calculateResult(a, b, op);

        System.out.println("What is " + a + " " + op + " " + b + "?");
        // int answer = Integer.parseInt(System.console().readLine());  // serve a leggere da input -> metodo di default 
        int answer = readAnswer();
        if (answer == result)
            System.out.println("correct");
        else
            System.out.println("error");
    }

}