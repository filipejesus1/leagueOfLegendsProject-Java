package Main;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class manipuladorArquivo{

    String path;

    public manipuladorArquivo(String path) {
        this.path = path;
    }

    public void lerArquivo(){
    try {
        Scanner scanner = new Scanner(new File(this.path));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}







