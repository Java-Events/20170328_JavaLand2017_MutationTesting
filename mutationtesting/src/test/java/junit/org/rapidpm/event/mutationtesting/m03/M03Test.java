package junit.org.rapidpm.event.mutationtesting.m03;

import org.junit.Test;
import org.rapidpm.event.mutationtesting.m03.M03;
import org.rapidpm.event.mutationtesting.m03.M03_Legacy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * M03 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Mär 28, 2017</pre>
 */
public class M03Test {

  private M03 create() {
//    return new M03_Refactored();
    return new M03_Legacy();
  }


  @Test(expected = NullPointerException.class)
  public void testDiscardCommonPrefix001a() throws Exception {
    String[] result = create().discardCommonPrefix(null, "service");
    fail();
  }

  @Test(expected = NullPointerException.class)
  public void testDiscardCommonPrefix001b() throws Exception {
    String[] result = create().discardCommonPrefix("service", null);
    fail();
  }



}
