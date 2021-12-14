package ejb3_2_components;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean implements IHelloWorld
{
	@Override
	public String sayHello(String name) {
     return String.format("Hello %s, welcome to EJB 3.2!", name);
 }
}

@Stateless
public class ItemEJB {
public Item convertPrice(Item item) {
  item.setPrice(item.getPrice() * 0.80F);
  item.setCurrency("Bol");  return item; }
}
@Stateless
public class ItemEJB {
@Resource(name = "currencyEntry")
private String currency;
@Resource(name = "changeRateEntry")
private Float changeRate;
public Item convertPrice(Item item) {
 item.setPrice(item.getPrice() * changeRate);
 item.setCurrency(currency); return item; }}
