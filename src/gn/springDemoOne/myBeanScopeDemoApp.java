package gn.springDemoOne;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myBeanScopeDemoApp {

    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myBeanScope-applicationContext.xml");

        // retrieve beans from spring container
        Coach firstCoach = context.getBean("myCoach", Coach.class);
        Coach secondCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean result = (firstCoach == secondCoach);

        // print out the result
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for firstCoach: " + firstCoach);
        System.out.println("\nMemory location for secondCoach: " + secondCoach);

        //close the container
        context.close();
    }
}
