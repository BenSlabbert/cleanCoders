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
        String line = br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line = br.readLine();
        }
    }
}
