package me.jimmy.springmvc.jpa.beanScan;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

// Repository인터페이스가 빈등록이 안됬는데도 등록이 되는 원리.
public class JimmyRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(Jimmy.class);
        beanDefinition.getPropertyValues().add("name", "jimmy");
        registry.registerBeanDefinition("jimmyBean", beanDefinition);
    }
}
