package pl.pik.kk.przyklady.spring.p07;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt
{
	public static void main( String[] args )
    {
    	ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        LifeBean lb = ctx.getBean(LifeBean.class);
        ctx.close();
    }
}
