package pl.pik.kk.przyklady.spring.p09;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import pl.pik.kk.przyklady.spring.p01.MyFirstBean;
import pl.pik.kk.przyklady.spring.p02.MySecondBean;
import pl.pik.kk.przyklady.spring.p03.MyThirdBean;

@Configuration
public class BeanConfigurator {

    @Bean
    @Lazy
    public MySecondBean myDrugi() {
        return new MySecondBean();
    }

    @Bean
    @Lazy
    public MySecondBean myDrugiNazwany() {
        MySecondBean t = new MySecondBean();
        t.setName("Tralal ala");
        return t;
    }
    @Bean
    @Lazy
    public MyThirdBean mySkomplikowany() {
        MyThirdBean thirdBean = new MyThirdBean("skomplikowany");
        thirdBean.setBean(getMyFirst());
        return thirdBean;
    }

    @Bean
    public MyFirstBean getMyFirst(){
        return new MyFirstBean("ale pierwszy");
    }
}
