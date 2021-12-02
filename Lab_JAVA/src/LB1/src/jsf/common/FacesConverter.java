
import java.text.DecimalFormat;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("facesConverter")
public class DollarConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, 
            UIComponent component, String value) {
        return value; 

	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent component,           
            Object value) {
       float amountInUSD = Float.parseFloat(value.toString());
       double ammountInDollars = amountInUSD / 26.19;
       DecimalFormat df = new DecimalFormat("###,##0.##");
       return df.format(ammountInDollars); 

	}

}

