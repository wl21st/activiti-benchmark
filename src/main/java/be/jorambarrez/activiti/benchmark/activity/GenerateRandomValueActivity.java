package be.jorambarrez.activiti.benchmark.activity;



import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import java.io.Serializable;
import java.util.Random;


public class GenerateRandomValueActivity implements JavaDelegate, Serializable {
  
  private static final long serialVersionUID = 1L;
  
  private static Random random = new Random();

  public void execute(DelegateExecution execution) {
    Integer value = random.nextInt(10);
    execution.setVariable("var", value);
  }

}
