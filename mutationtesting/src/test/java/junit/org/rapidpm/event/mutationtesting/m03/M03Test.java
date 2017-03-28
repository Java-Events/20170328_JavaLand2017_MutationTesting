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

  @Test
  public void testDiscardCommonPrefix002() throws Exception {
    String[] result = create().discardCommonPrefix("service", "service");
    assertEquals(2, result.length);
    assertEquals("", result[0]);
    assertEquals("", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix003() throws Exception {
    String[] result = create().discardCommonPrefix("abc", "tru");
    assertEquals(2, result.length);
    assertEquals("abc", result[0]);
    assertEquals("tru", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix003a() throws Exception {
    String[] result = create().discardCommonPrefix("abcX", "tru");
    assertEquals(2, result.length);
    assertEquals("abcX", result[0]);
    assertEquals("tru", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix003b() throws Exception {
    String[] result = create().discardCommonPrefix("abc", "truX");
    assertEquals(2, result.length);
    assertEquals("abc", result[0]);
    assertEquals("truX", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix003c() throws Exception {
    String[] result = create().discardCommonPrefix("b481abc", "b481tru");
    assertEquals(2, result.length);
    assertEquals("abc", result[0]);
    assertEquals("tru", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix004a() throws Exception {
    String[] result = create().discardCommonPrefix("b481abcX", "b481tru");
    assertEquals(2, result.length);
    assertEquals("abcX", result[0]);
    assertEquals("tru", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix004b() throws Exception {
    String[] result = create().discardCommonPrefix("b481abc", "b481truX");
    assertEquals(2, result.length);
    assertEquals("abc", result[0]);
    assertEquals("truX", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix005a() throws Exception {
    String[] result = create().discardCommonPrefix("b481", "b481t");
    assertEquals(2, result.length);
    assertEquals("", result[0]);
    assertEquals("t", result[1]);
  }

  @Test
  public void testDiscardCommonPrefix005b() throws Exception {
    String[] result = create().discardCommonPrefix("b481a", "b481");
    assertEquals(2, result.length);
    assertEquals("a", result[0]);
    assertEquals("", result[1]);
  }

}
