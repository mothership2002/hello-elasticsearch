package hello.elasticsearch.config;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Getter
@Slf4j
@ConfigurationProperties("es")
@Setter
public class ElasticsearchProperty {

	private String host;
	private String port;
	private String id;
	private String passwd;

	@PostConstruct
	public void init() {
		log.info("property");
		log.info("host:{}", host);
		log.info("port:{}", port);
		log.info("id:{}", id);
		log.info("passwd:{}", passwd);
	}
}
