package aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class EmployeeAspectPointCut {

  @Before("getNamePointCut()")
  public void loggingAdvice() {
    System.out.println("Executing loggingAdvice on getName()");
  }

  @Before("getNamePointcut()")
  public void secondAdvice() {
    System.out.println("Executing secondAdvice on getName()");
  }

  @Pointcut("execution(public String getName())")
  public void getNamePointCut() {

  }
  @Before("allMethodsPointcut()")
  public void allServiceMethodsAdvice() {
    System.out.println("Before executing service method");
  }

  @Pointcut("within(service.*)")
  public void allMethodsPointcut(){

  }
}
