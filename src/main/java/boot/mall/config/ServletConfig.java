package boot.mall.config;

import org.springframework.context.annotation.Configuration;



@Configuration
public class ServletConfig {
	
	/** 
     * 多个servlet就注册多个bean 
     * @return 
     */  
	/*@Bean
	public ServletRegistrationBean servletAliPayBean(){
		return new ServletRegistrationBean(new ALiPayServlet(), "/aliPay");
	}*/
}
