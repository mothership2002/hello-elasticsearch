package hello.elasticsearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hello.elasticsearch.domian.Sample;
import hello.elasticsearch.service.SampleService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SampleController {

	private final SampleService service;
	
	@GetMapping("/result")
	public Iterable<Sample> getResult() {
		return service.getResult();
	}
	
	@PostMapping("/result")
	public Sample save(@RequestBody Sample sample) {
		return service.save(sample);
	}
}
