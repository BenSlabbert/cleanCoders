import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by benjamin on 2016/08/23.
 */
public class Farm {
    
    
    public static void main(String... args) throws IOException {

        System.out.println("hello");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        showMenu();

        String line = br.readLine();


        while_loop: while(line!=null)
        {
            switch(line){
                case "0": {
                    System.out.println("No");
                    break while_loop;
                }
                case "1": {
                    System.out.println("Yes");
                    break;
                }
                default:break;
            }
            showMenu();
            line = br.readLine();
        }
    }
    private static void showMenu(){
        System.out.println("---------------\n1 for yes\n0 for no");
    }
}
