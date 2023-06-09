package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

//서블릿 자동 등록
@ServletComponentScan //스프링이 자동으로 현재 패키지를 포함한 하위 패키지를 다 찾아 서블릿을 자동으로 실행하도록 해준다.
@SpringBootApplication
public class ServletApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
		//스프링 빈 직접 등록
	}
}
