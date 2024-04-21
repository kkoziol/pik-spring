package pl.pik.kk.przyklady.spring.p11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunIt {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ctx = new AnnotationConfigApplicationContext(DbBeanConfigurator.class);

		Connection obj = ctx.getBean(Connection.class);
		System.out.println(obj);

		ctx.close();

	}
}
