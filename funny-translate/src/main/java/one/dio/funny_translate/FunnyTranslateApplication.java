package one.dio.funny_translate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FunnyTranslateApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunnyTranslateApplication.class, args);
	}

}
