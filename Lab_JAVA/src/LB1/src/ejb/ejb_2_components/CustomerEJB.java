@Stateless 
public class CustomerEJB {
@Resource 
TimerService timerService;
 	public void createCustomer(Customer customer) {
  		ScheduleExpression birthDay = new   	
ScheduleExpression().dayOfMonth(customer.getBirthDay()).
month(customer.getBirthMonth());
  		timerService.createCalendarTimer(birthDay, new 
      								TimerConfig(customer, true));
}
@Timeout
public void sendBirthdayEmail(Timer timer) {
  		Customer customer = (Customer) timer.getInfo(); 

}
}
