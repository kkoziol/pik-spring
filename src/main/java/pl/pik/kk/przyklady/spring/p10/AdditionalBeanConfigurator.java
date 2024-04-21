package pl.pik.kk.przyklady.spring.p10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.pik.kk.przyklady.spring.p01.MyFirstBean;
import pl.pik.kk.przyklady.spring.p03.MyThirdBean;

@Configuration
//@Import(BeanConfigurator.class)
public class AdditionalBeanConfigurator {

    @Bean
	public MyThirdBean getMyTrzeciNazwany() {
		MyThirdBean t = new MyThirdBean();
		MyFirstBean b = new MyFirstBean();
		b.setName("First bean a kuku");
		t.setBean(b);
		t.setName("Trzeci a kuku");
		return t;
	}

}
