package io.spring.example;

import org.springframework.core.io.ClassRelativeResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * <p>
 *
 * </p>
 *
 * @author ZYW
 * @version v1.0.0
 * @date 2019-08-29 18:02
 */
@Component
public class Main1TestBean {

	public void test() throws IOException {
		//使用ClassRelativeResourceLoader加载ClassPath下的文件，ClassRelativeResourceLoader加载ClassPathResource
		ClassRelativeResourceLoader resourceLoader = new ClassRelativeResourceLoader(Main1TestBean.class);

		//读取类路径下的文件
		Resource resource = resourceLoader.getResource("test.xml");

		System.out.println(resource.getFile().getPath());

		System.out.println("----------------------------------");
	}
}
