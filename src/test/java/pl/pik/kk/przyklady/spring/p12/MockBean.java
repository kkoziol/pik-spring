package pl.pik.kk.przyklady.spring.p12;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mock")
@Primary
public class MockBean implements MyProfilowyBean {

    public String getName() {
        return "Beanek Profil mock QA";
    }

    
    
}
