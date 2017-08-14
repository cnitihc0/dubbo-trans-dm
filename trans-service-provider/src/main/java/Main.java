import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.URL;

/**
 * @author mashaobo
 * @date 17/5/17
 * @blog http://blog.csdn.net/cnitihc0
 * @email cnitihc0@163.com
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URL url = Main.class.getClassLoader().getResource("spring/application-provider.xml");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {url.toString()});
        context.start();

        // 加载相应的依赖模块


        System.in.read(); // 按任意键退出
    }
}
