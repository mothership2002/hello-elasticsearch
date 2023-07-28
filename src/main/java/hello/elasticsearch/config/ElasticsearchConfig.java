package hello.elasticsearch.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.w3c.dom.views.AbstractView;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ElasticsearchConfig extends AbstractElasticsearchConfiguration {@Override

	@Bean
    public RestHighLevelClient elasticsearchClient() {

    final ClientConfiguration clientConfiguration = ClientConfiguration.builder()  
        .connectedTo("localhost:9200")
        .build();

    return RestClients.create(clientConfiguration).rest();                         
}

	
//	private final ElasticsearchProperty property;
	

//	// lowlevelClient
//	@Bean
//	public RestClient restClient() {
//		return RestClient.builder(new HttpHost("localhost", 9200)).build();
//	}
//	
//	@Bean
//	public ElasticsearchClient elasticsearchClient() {
//		return new ElasticsearchClient(elasticsearchTransport());
//	}
//	
//	@Bean // transport
//	public ElasticsearchTransport elasticsearchTransport() {
//		return new RestClientTransport(restClient(), new JacksonJsonpMapper());
//	}
//	
}
