import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WordCounter{
    
    // questo primo metodo serve per leggere il numero di parole in un file, viene passato il file di input
    private static int readWords(String file) {
        try (FileReader fileReader = new FileReader(file)){ // in questo modo viene istanziato un oggetto con cui si può leggere da file 
            BufferedReader bufferedReader = new BufferedReader(fileReader); // in questo modo viene istanziato un oggetto con cui si può leggere da buffer, in modo da leggere in maniera più efficiente
            String line; 
            int wordCount = 0;

            while((line = bufferedReader.readLine())!= null){ // esiste quindi un metodo di default per il bufferedReader che consente la lettura di una stringa
                String[] words = line.split(" "); // creare un array di stringhe il cui delimitatore tra una parola e un'altra e uno spazio il che rende possibile contare le stringhe
                wordCount+=words.length;
            }
                bufferedReader.close();
                return wordCount;
        }       catch(IOException e){ 
            e.printStackTrace(); //spiega l'eccezione e dove è avvenuta l'eccezione
            System.exit(1);
        }
        return 0;
    }

    // questo secondo metodo serve a scrivere su un file di output il numero di parole
    public static void writeCount(String file, int count){
         try(FileWriter fileWriter = new FileWriter(file)){ // anche qua si istanzia un oggetto per scrivere su file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // anche qua si istanzia un oggetto per scrivere su buffer
            PrintWriter printWriter = new PrintWriter(bufferedWriter); // stampa rappresentazioni formattate di oggetti in un flusso di testo di output. 
            printWriter.println(count);
            printWriter.close();
         }      catch(IOException e){
            e.printStackTrace();
            System.exit(1);
         }
    }
  
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java WordCounter <input_file> <output_file>");
            System.exit(1);
        }
 
        String inputFile = args[0];
        String outputFile = args[1];
        int wordCount = readWords(inputFile);
        writeCount(outputFile, wordCount);
    }
    
}

