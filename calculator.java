class Calculator{
    private static int calculateResult(int a, int b, String op){
        switch(op){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*": 
                return a*b;
            case: "/":
                return a/b;
        }
        
        default: // non so cosa significhi, chiedere.
            System.err.println("Unkown operator");
            System.exit(1);
        return 0;
    }

    public static void main(String[] args){
        if(args!= 3){
            System.out.println("errore: manca qualche dato");
            System.err.prinln("op può essere +, -, *, /");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]); // la classe Integer prevede come metodo la conversione da stringa a intero: parseInt
        int b = Integer.parseInt(args[2]);
        int result = calculateResult(a, b, args[1]);

        System.out.println(result);
    }


}