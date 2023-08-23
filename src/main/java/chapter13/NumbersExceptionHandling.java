package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersExceptionHandling {

    public static void main(String[] args){

        numberExceptionHandling();
    }


    public static void  numberExceptionHandling(){
        File file = new File("resources/number.txt");
            Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }finally {
            fileReader.close();
        }
    }
}
