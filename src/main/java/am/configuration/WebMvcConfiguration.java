package am.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

	@Value("${spring.servlet.multipart.location}")
	private String uploadImagePath;
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowedMethods("GET", "POST", "PUT", "DELETE");
	}
	
	// 이미지 넣기(외부파일 경로 설정)
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		String imgPath = "file:" + uploadImagePath;

//		registry.addResourceHandler("/outsideImg/**").addResourceLocations("file:///C:/AMPROJECT/outsideImages/");

		//정민
//		registry.addResourceHandler("/images/**").addResourceLocations("file:///C:/java602/outsideImages/");

		
		registry.addResourceHandler("/outsideImg/**").addResourceLocations(imgPath)
		.setCachePeriod(3600)
		.resourceChain(true)
		.addResolver(new PathResourceResolver());
	}
	
//	업로드 될 파일의 문자셋 UTF-8로 설정, 업로드 될 파일크기 설정
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver cmpr = new CommonsMultipartResolver();
		cmpr.setDefaultEncoding("UTF-8"); 
		cmpr.setMaxUploadSizePerFile(10 * 1024 * 1024);
		
		return cmpr;
	}
	
}
