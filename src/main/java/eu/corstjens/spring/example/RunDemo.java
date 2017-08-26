package eu.corstjens.spring.example;

import eu.corstjens.spring.example.entities.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
        //print all beans
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
        System.out.println();
        System.out.println();

        //run the aplication

        Game game = context.getBean("game", Game.class);
        System.out.println("result:" + game.playGame());


    }
}
