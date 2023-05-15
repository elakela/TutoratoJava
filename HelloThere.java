public class HelloThere {

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
        System.out.print("\u001B[31m");
        System.out.println("Hello World");
    }

    private static void Erase(){
        System.out.print("\u001B[2J");
        System.out.flush();
        System.out.print("\u001B[H");
        System.out.flush();
    }

    private static void HelloThereSW(){
        Wait(1000);
        Erase();
        System.out.print("\033[033m");
        System.out.println("- Hello There!");

    } 

    public static void main(String[] args){
        PrintHello();
        PrintEllipsis();
        HelloThereSW();
    }    
}