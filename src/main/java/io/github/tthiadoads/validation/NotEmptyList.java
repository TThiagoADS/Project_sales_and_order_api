package io.github.tthiadoads.validation;

import io.github.tthiadoads.constraintvalidation.NotEmptyListValidator;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NotEmptyListValidator.class)
public @interface NotEmptyList {
    String message() default "A lista não pode ser vazia.";
}
