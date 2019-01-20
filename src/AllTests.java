import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdditionTest.class, SubtractionTest.class })
public class AllTests {
	
}


//https://stackoverflow.com/questions/33585057/junit-initialization-error?lq=1
//Had to figure out how to get alltests to run all cases