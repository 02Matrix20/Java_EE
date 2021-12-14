import javax.enterprice.context.RequestScope;
import javax.interception.Interceptors;

@RequestScoped
@CustomMed
public class Order {
public String Order() {
return "Create";
}
}
