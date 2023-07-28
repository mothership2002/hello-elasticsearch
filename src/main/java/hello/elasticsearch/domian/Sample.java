package hello.elasticsearch.domian;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Document(indexName = "sample_index")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sample {

	@Id
	private String id;
	private String name;
	private String something;
}
