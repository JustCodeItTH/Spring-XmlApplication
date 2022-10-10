import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext ("configure.xml");
        
        Player p = context.getBean("captain", Player.class);
        System.out.println( p.name );
        
        Player q = context.getBean("goal-keeper", Player.class);
        System.out.println( q.name );
    }
}
class Player {
    String name;
    public double salary;
    int number;
    
    public void setName(String s) {
        name = s;
    }
    public void setNumber(int n) {
        number = n;
    }
}