import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_createsInstance_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void Task_createsInstance_true() {
    Task myTask = new Task("Mow the lawn");
    assertEquals("Mow the lawn", myTask.getDescription);
  }

}
