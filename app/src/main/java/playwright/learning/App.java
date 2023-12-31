/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package playwright.learning;

import com.microsoft.playwright.CLI;

import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    void runCodeGen() {
        try {
//            CLI.main(new String[]{"codegen", "demo.playwright.dev/todomvc"});
            CLI.main(new String[]{"codegen", "--ignore-https-errors", "bankofamerica.com"});
//            CLI.main(new String[]{"install"});
        } catch (IOException | InterruptedException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
    }


    public static void main(String[] args) {
        //new App().screenShot();

        new App().runCodeGen();

    }

}
