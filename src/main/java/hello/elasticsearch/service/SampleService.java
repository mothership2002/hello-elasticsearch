package hello.elasticsearch.service;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import hello.elasticsearch.domian.Sample;
import hello.elasticsearch.repository.SampleRepository;

@Service
@RequiredArgsConstructor
public class SampleService {

//	private final ElasticsearchClient client;
	private final SampleRepository repository;
	
	public Iterable<Sample> getResult() {
		return repository.findAll();
	}
	
	public Sample save(Sample sample) {
		return repository.save(sample);
	}
}
