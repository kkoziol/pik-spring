package pl.pik.kk.przyklady.spring.p12;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!QA-env")
public class BeanP1 implements MyProfilowyBean {

    public String getName() {
        return "Beanek Profil Domyslny";
    }

    
    
}
