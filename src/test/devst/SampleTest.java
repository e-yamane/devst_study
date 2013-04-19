package devst;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SampleTest {

	@Test
	public void test() {
		Sample sample = new Sample();
		assertThat(sample.add(1, 2), is(3));
	}

}
