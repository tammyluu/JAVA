package com.example.correction_boutique_bonbons.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.validation.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
public class ValidatorEventRegistry implements InitializingBean {
    //liste des validators enregistrer dans spring CDI
    @Autowired
    private Map<String, Validator> validators;
    // Un obj qui permet d'enregistrer des validators dans les events des repos spring data rest
    @Autowired
   private  ValidatingRepositoryEventListener validatingRepositoryEventListener;
    @Override
    public void afterPropertiesSet() throws Exception {
        List<String> events = Arrays.asList("beforeCreate", "beforeDelete", "beforeSave"," beforeUpdate", "beforeLinkSave");

        for (Map.Entry<String, Validator> entry: validators.entrySet()){
            // pour chaque event on cherche le validator qui commmence par le nom que l'event
            events.stream().filter(e -> entry.getKey().startsWith(e))
                    .findFirst().ifPresent(p ->
                    validatingRepositoryEventListener
                            .addValidator(p,entry.getValue())

            );

     }

    }
}
