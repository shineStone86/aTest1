package Ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor.....postProcessBeanFactory ");
		int count = configurableListableBeanFactory.getBeanDefinitionCount();
		String[] name = configurableListableBeanFactory.getBeanDefinitionNames();
		System.out.println(count);
		System.out.println( Arrays.asList(name));
	}
}
