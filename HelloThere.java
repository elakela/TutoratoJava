public class HelloThere {
    private static String YELLOW = "\033[033m";
    private static String RED = "\u001B[31m";
    private static String CANCEL = "\u001B[2J";
    private static String ENTER = "\u001B[H";
    private static void Wait(int n){
        try{
            Thread.sleep(n);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    private static void PrintEllipsis(){
        for(int i = 0; i<3; i++){
            Wait(1000);
            System.out.println(".");
        }
    }

    private static void PrintHello(){
        System.out.println(RED + "Hello World");
    }

    private static void Erase(){
        System.out.println(CANCEL);
        System.out.flush();
        System.out.print(ENTER);
        System.out.flush();
    }

    private static void PrintHelloThereSW(){
        Erase();
        System.out.println(YELLOW + "- Hello There!");

    } 

    private static void PrintStarWars(){
        System.out.println("- General Kenobi");
    }

    public static void main(String[] args){
        PrintHello();
        PrintEllipsis();
        Wait(1000);
        PrintHelloThereSW();
        Wait(1000);
        PrintStarWars();
    }    
}