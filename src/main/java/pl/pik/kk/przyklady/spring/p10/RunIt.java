package pl.pik.kk.przyklady.spring.p10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.pik.kk.przyklady.spring.p02.MySecondBean;
import pl.pik.kk.przyklady.spring.p03.MyThirdBean;
import pl.pik.kk.przyklady.spring.p09.BeanConfigurator;

public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
	     new AnnotationConfigApplicationContext();
//	     new AnnotationConfigApplicationContext(AdditionalBeanConfigurator.class);
		 ctx.register(AdditionalBeanConfigurator.class);
		 ctx.register(BeanConfigurator.class);
		 ctx.refresh();

		System.out.println(ctx.getBean("myDrugiNazwany",MySecondBean.class).getName());
		System.out.println(ctx.getBean("getMyTrzeciNazwany",MyThirdBean.class).getCompoundName());

		ctx.close();
	}
}
