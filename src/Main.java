import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String inFile = "in.txt";
        String outFile = "out.txt";
        String input = "";
        // set the input file as inFile
        File file = new File(inFile);
        // init the fileScanner for reading the inFile
        Scanner fileScanner = new Scanner(file);
        List<Bycicle> bycicles = new ArrayList<Bycicle>();
        // Init the bycicles
        Bycicle bycicle1 = new Bycicle("Yamaha 2017A", 110);
        Bycicle bycicle2 = new Bycicle("Audi 2017B", 250);
        Bycicle bycicle3 = new Bycicle("Porsche 2017C", 120);
        // Ddd the bycicles to the list
        bycicles.add(bycicle1);
        bycicles.add(bycicle2);
        bycicles.add(bycicle3);

        MyBycicle myBycicle = new MyBycicle();

        // init the inputScanner for reading the input from the console
        try (Scanner inputScanner = new Scanner(System.in)) {
            // init the PrintStream 'o' for writing the output to the outFile
            PrintStream o = new PrintStream(new File(outFile));
            // store the current System.out in 'console' variable
            PrintStream console = System.out;
            // read the inFile line by line
//            while (fileScanner.hasNextLine()) {
//                // read the inFile word by word
//                String i = fileScanner.nextLine();
//                // print the inFile word to the outFile
//                System.out.print(i + "\n");
//            }
//            System.out.println();
//            // close the fileScanner
//            fileScanner.close();
            // read the inFile line by line
            String name = fileScanner.nextLine();
            int price = fileScanner.nextInt();
            String shouldFind = fileScanner.next();
            // add the bycicles to the list
            Bycicle bycicle4 = new Bycicle(name, price);
            bycicles.add(bycicle4);
            myBycicle.f1(bycicles);
            int result = myBycicle.f2(bycicles, shouldFind);


            // for debug purpose
//            System.out.println("The number of bycicles with name " + shouldFind + " is " + result);


            // redirect the output to the outFile
            System.setOut(o);
            // read the input from the console
            input = inputScanner.nextLine();
            // print the input to the outFile
            System.out.println(input);
            // redirect the output to the console
            System.setOut(console);
        }
        System.out.println("Your input is : " + input);
        System.out.println("Your input is stored in the file : " + outFile);
    }
}