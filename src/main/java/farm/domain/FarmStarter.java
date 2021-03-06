package farm.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by benjamin on 2016/08/23.
 */
public class FarmStarter {
    
    
    public static void main(String... args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        showMenu();
        
        String line = br.readLine();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Farm farm;
        Farmer farmer;
        Animal animal;

//        farm = (Farm)context.getBean("Farm");
//        farmer = (Farmer)context.getBean("Farmer");
//        animal = (Animal)context.getBean("Animal");
        while_loop: while (line != null) {
            switch (line) {
                case "0": {
                    System.out.println("Thank you, have a nice day :P");
                    break while_loop;
                }
                case "1": {
                    farm = (Farm)context.getBean("Farm");
                    farm.toString();
                    System.out.println("Farmer");
                    break;
                }
                case "2": {
                    System.out.println("Sheep");
                    break;
                }
                case "3": {
                    System.out.println("Horses");
                    break;
                }
                default:
                    break;
                
            }
            showMenu();
            line = br.readLine();
        }
    }
    
    private static void showMenu() {
        System.out.println(
                "---------------\nWelcome to the farm, get details on:" + "\n1: Farmer" + "\n2: Sheep" + "\n3: Horses" +
                        
                        "\n0 for exit");
    }
}
