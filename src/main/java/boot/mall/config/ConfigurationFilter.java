package boot.mall.config;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import boot.mall.filter.MyFilter;

@Configuration
public class ConfigurationFilter {
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}

	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());// 添加过滤器
		registration.addUrlPatterns("/*");// 设置过滤路径，/*所有路径
		registration.addInitParameter("name", "alue");// 添加默认参数
		registration.setName("MyFilter");// 设置优先级
		registration.setOrder(1);// 设置优先级
		return registration;
	}
}
