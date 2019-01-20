import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	DoMath mathClass = new DoMath();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void checkInstanceOfClass() {
		//https://stackoverflow.com/questions/12404650/assert-an-object-is-a-specific-type
		assertTrue(mathClass instanceof DoMath);
	}

	@Test
	public void checkForMethod() throws NoSuchMethodException, SecurityException {
		//https://www.tutorialspoint.com/java/lang/class_getmethod.htm
		//https://stackoverflow.com/questions/7058621/how-to-check-if-a-method-exists-at-runtime-in-java
		Class[] args = new Class[2];
		args[0] = int.class;
		args[1] = int.class;
		Method addNumbersMethod = DoMath.class.getMethod("addNumbers", args);
		assertNotNull(addNumbersMethod);
	}
	
	@Test
	public void test() {
		int result = mathClass.addNumbers(1, 2);
		assertEquals(result, 3);
	}
}
