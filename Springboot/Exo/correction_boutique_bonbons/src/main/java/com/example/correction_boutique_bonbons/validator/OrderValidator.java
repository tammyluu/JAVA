package com.example.correction_boutique_bonbons.validator;

import com.example.correction_boutique_bonbons.entity.CandyOrder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("afterCreateOrderValidation")
public class OrderValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return CandyOrder.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CandyOrder order = (CandyOrder) target;
        if (order == null) {
            errors.reject("customer.required", "Le client doit être spécifié pour passer une commande");
        }



    }
}
