import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class DecoratorClass implements PrintEdition {
@Inject
@Delegate
PrintEdition printEdition;
	@Override
	public String getPrintEdition() {
		return printEdition.getPrintEdition();
}
}

