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
    public static void main(String[] args){
        PrintHello();
        PrintEllipsis();
    }    
}