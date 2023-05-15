public class HelloThere {

    
    private static void PrintEllipsis(){
        for(int i = 0; i<3; i++){
            System.out.println(".");
        }
    }

    private static void PrintHello(){
        System.out.print("\u001B[31m");
        System.out.println("Hello World");
    }
    public static void main(String[] args){
        PrintHello();
        PrintEllipsis();
    }    
}