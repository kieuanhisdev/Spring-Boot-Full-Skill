package dev.kieuanh.SpringBootFullSkill.util;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<PhoneNumber, String> {
    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s == null) {
            return false;
        }
        //validate phone number of format "0902345345"
        if  (s.matches("\\d{10}")) {
            return true;
        }
        else return s.matches("\\d{11}");
    }
}
