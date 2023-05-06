public class calculator{
    private static int calculateResult(int a, int b, String op){
        switch(op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "x": 
                return a*b;
            case"/":
                return a/b;
        
        default:
            System.err.println("unkownon operator");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(args[0] + args[1] + args[2]);
        if(args.length < 3){
            System.err.println("errore: manca qualche dato");
            System.err.println("int, op, int");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]); // la classe Integer prevede come metodo la conversione da stringa a intero: parseInt
        int b = Integer.parseInt(args[2]);
        int result = calculateResult(a, b, args[1]);

        System.out.println(result);
    }


}