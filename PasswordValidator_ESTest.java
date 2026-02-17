import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidator_ESTest {
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PasswordValidator passwordValidator0 = new PasswordValidator();
      boolean boolean0 = passwordValidator0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PasswordValidator passwordValidator0 = new PasswordValidator();
      boolean boolean0 = passwordValidator0.isValid("A1bcdefgh");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PasswordValidator passwordValidator0 = new PasswordValidator();
      boolean boolean0 = passwordValidator0.isValid("short");
      assertFalse(boolean0);
  }
}