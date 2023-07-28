package hello.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import hello.elasticsearch.domian.Sample;

public interface SampleRepository extends ElasticsearchRepository<Sample, Long> {

}
