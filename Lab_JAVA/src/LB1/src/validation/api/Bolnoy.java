
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class Bolnoy {
    @PatternList.List({
		@Pattern(regexp = "[C,D,M][A­-Z][0­-9]*"),
		@Pattern(regexp = ".[A-­Z].*?")
	})

    String username;
    String pass;
    @Digits(integer=10, fraction=0)
    int payment;

    public String getUsername() {
        return username;
    }

    public void setUsername(@NotNull @PatternList(regexp="[A-z0-9]*") String username) {
        this.username = username;
    }
    @NotNull(message = "Not valid")
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String resetPayment(){
        return "Successfully reset!";
    }
    
}