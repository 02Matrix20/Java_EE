

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ValidDate implements ConstraintValidator<ChronDates,Payment>{

    @Override
    public void initialize(ChronDates constraintAnnotation) {
       
    }

    @Override
    public boolean isValid(Payment payment, ConstraintValidatorContext context) {
        return payment.startDate.isBefore(payment.endDate);
   
        
    }
    
}

