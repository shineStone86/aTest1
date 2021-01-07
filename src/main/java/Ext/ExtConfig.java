package Ext;

import domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
* 扩展原理
*  1、BeanPostProcessor:bean后置处理器、bean创建对象初始化前后进行拦截工作的
*    BeanFactoryPostProcessor ：beanFactory的后置处理器
*         在beanFactory标准初始之后调用，来定制和修改BeanFactory的内容
*         所有的bean定义已经保存加载到beanfactory，但是bean的实例还未创建
*  1）、ioc容器创建对象
*  2）、invokeBeanFactoryPostProcessors（beanFactory）；执行BeanFactoryPostProcessor；
*         如何找到所有的并执行他们的方法；
*             1）、直接在BeanFactory中找到所有类型是BeanFactoryPostProcessor的组件，并执行他们的方法
*             2）、在初始化创建其他组件前执行
* 2、BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
*  		postProcessBeanDefinitionRegistry（） 在所有bean定义信息将要被加载，bean实例还未创建
*  		优先于	BeanFactoryPostProcessor执行；
*  		利用BeanDefinitionRegistryPostProcessor给容易额外添加组件
*  		原理
*  			1、ico创建对象
*  			2、refresh（）-》	invokeBeanFactoryPostProcessors（beanFactory）
*  			3、先从容器中获取所有的	BeanDefinitionRegistryPostProcessor，
*  		 		1、依次触发所有的postProcessBeanDefinitionRegistry()方法
*  		 		2、再来触发postProcessBeanFactory（）方法BeanFactoryPostProcessor;
*  		 	4、然后从容器中找到BeanFactoryPostProcessor组件，然后依次触发postProcessBeanFactory
*  3、ApplicationListerer：监听容器中发布的事件，事件驱动模型开发
*  		监听ApplicationEvent及其下面的子事件
*  	    自己实现事件
*  	    1、写一个监听器来监听某个事件（ApplicationEvent及其下面的子事件）;
*  	    2、把监听器加入到容器
*  	    3、只要容器中有相关事件的发布，就能监听到事件
*  	    4、applicationContext.publishEvent()
*  	 原理
*
*
* */

@ComponentScan( basePackages="Ext" )
@Configuration
public class ExtConfig {

	@Bean
	public Person person(){
		return new Person();
	}
}
