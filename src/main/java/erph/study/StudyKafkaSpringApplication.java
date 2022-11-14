package erph.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@SpringBootApplication
public class StudyKafkaSpringApplication {

	@Autowired
	private KafkaProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(StudyKafkaSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			producer.send("mytopic", "hello kafka");
		};
	}

}
