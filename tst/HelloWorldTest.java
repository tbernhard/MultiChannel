import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
	private HelloWorld hw = new HelloWorld();

	@Test
	public void test() {
		assertEquals("wrap:tobi", hw.wrap("tobi"));
//		fail("Not yet implemented");
	}

}
