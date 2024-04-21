package pl.pik.kk.przyklady.spring.p09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.pik.kk.przyklady.spring.p02.MySecondBean;
import pl.pik.kk.przyklady.spring.p03.MyThirdBean;

public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
		        new AnnotationConfigApplicationContext(
				BeanConfigurator.class);

		MySecondBean obj2 = (MySecondBean) ctx.getBean("myDrugi");
		System.out.println(obj2.getName());

		MySecondBean obj3 = (MySecondBean) ctx.getBean("myDrugiNazwany");
		System.out.println(obj3.getName());

		MyThirdBean obj4 = ctx.getBean("mySkomplikowany",MyThirdBean.class);
		System.out.println(obj4.getCompoundName());

		ctx.close();

	}
}
