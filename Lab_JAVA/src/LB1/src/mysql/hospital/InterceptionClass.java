import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundConstruct;
import javax. interceptor.AroundInvoke;
import javax.annotation.InvocationContext;

@One
public class InterceptionClass {
	@AroundConstruct
	private void aroundconstruct (InvocationContext context) throws Exception
	{
		System.out.println("AroundConstruct");
		context.proceed();
}
@PostConstruct
	public void PostConstruct() {
	System.out.println("PostConstruct");
}
@AroundInvoke
private Object aroundMethod(InvocationContetx context) throws Exception
{
	System.out.println("AroundInvoke");
	return contetx.proceed();
}
@PreDestroy
private void prDestroy(){
	System.out.println("PreDestroy");
}
}
