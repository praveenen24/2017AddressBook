package test; /**
 * Created by praveenensrikumaran on 1/26/2017.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launcher {

    public static void main(String[] args) {
        String[] contextPaths = new String[]{"app.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}

