package io.github.tthiadoads.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.util.Locale;

@Configuration
public class InternacionalizacaoConfig {

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:messages"); //local onde esta o .propesties da linguagem
        messageSource.setDefaultEncoding("ISO-8859-1"); //iso da linguagem
        messageSource.setDefaultLocale(Locale.getDefault()); // pegar local padrão da maquina
        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validadatorFactoryBean(){
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }
}
