package kr.ac.hansung.cse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("conf/animal.xml");

        PetOwner person = (PetOwner) context.getBean("petOwner");
        person.play();

        context.close();

    }
}
