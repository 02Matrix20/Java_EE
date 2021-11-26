import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class ProducerClass {
	@Produces
	String s = "Hello, registry!";
	Public void resetP(@Disposes Recipient recipient) {
		recipient.getPrintEdition();
}
}
