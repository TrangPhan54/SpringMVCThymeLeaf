package com.axonactive.validation.validationleaf.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    public String value() default "LUV";

    public String message() default "must start with LUV";

    // define default group to group related constraints
    public Class<?>[] groups() default {};

    // payload provide custom details about validation failure
    // (security level, error code)
    public Class<? extends Payload>[] payload() default{};
}
