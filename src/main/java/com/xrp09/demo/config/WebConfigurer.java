package com.xrp09.demo.config;

import com.xrp09.demo.controller.interception.OneInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
	/**
	 * Add Spring MVC lifecycle interceptors for pre- and post-processing of
	 * controller method invocations. Interceptors can be registered to apply
	 * to all requests or be limited to a subset of URL patterns.
	 * <p><strong>Note</strong> that interceptors registered here only apply to
	 * controllers and not to resource handler requests. To intercept requests for
	 * static resources either declare a
	 * {@link MappedInterceptor MappedInterceptor}
	 * bean or switch to advanced configuration mode by extending
	 * {@link WebMvcConfigurationSupport
	 * WebMvcConfigurationSupport} and then override {@code resourceHandlerMapping}.
	 *
	 * @param registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		/**
		 * 拦截器按照顺序执行
		 */
		//拦截所有
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/*/**");
//		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");
//		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
//				.addPathPatterns("/one/**");
	}
}
