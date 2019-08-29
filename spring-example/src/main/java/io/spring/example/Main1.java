package io.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author ZYW
 * @version v1.0.0
 * @date 2019-08-29 17:39
 */
public class Main1 {
	public static void main(String[] args) throws IOException {

		//使用AnnotationConfigApplicationContext实例化Spring IoC容器
		ApplicationContext context = new AnnotationConfigApplicationContext(Main1TestBean.class);

		Main1TestBean testBean = context.getBean("main1TestBean", Main1TestBean.class);

		testBean.test();
	}
}
