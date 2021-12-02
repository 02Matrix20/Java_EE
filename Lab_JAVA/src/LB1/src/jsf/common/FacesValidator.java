

import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;



@FacesValidator("passValidator")
public class PasswordValidator implements Validator  {
	Pattern pattern = Pattern.compile("[A-Za-z0-9]{5}");

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
		java.util.regex.Matcher matcher = pattern.matcher(arg2.toString());
		if (!matcher.matches()) {
			FacesMessage fmsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Password Validation failed", "Invalid Password.");
			 throw new ValidatorException(fmsg);
		}
	}
}
