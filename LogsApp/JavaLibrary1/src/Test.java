import org.apache.log4j.Logger;
 
public class Test {
 
  static Logger l = Logger.getLogger(Test.class.getName());
 
  public static void main(String[] args) {      
 
      l.debug("Debug message!");
      l.info("Info message");
      l.warn("Warn message");
      l.fatal("Fatal message");
      l.error("Error message");
 
      System.out.println("Yey!");
 
  }
}