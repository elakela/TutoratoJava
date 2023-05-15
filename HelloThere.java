public class HelloThere{
    private static void Print(){
        System.out.print("\u001B[31m");
        System.out.println("Hello World");
        System.out.print("\u001B[2J");

        System.out.println("...");
    }
    public static void main(String[] args){
        Print();
    }    
}