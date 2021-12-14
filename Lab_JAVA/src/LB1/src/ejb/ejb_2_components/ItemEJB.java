@Stateless 
public class ItemEJB {
 	@Resource 
private SessionContext ctx;
 	public void deleteBook(Book book) {
   		if (!ctx.isCallerInRole("admin"))
     		throw new SecurityException("admins only!");     
}
 	public Book createBook(Book book) {
   		if (ctx.isCallerInRole("employee") &&  
             				!ctx.isCallerInRole("admin")) {
     		book.setCreatedBy("employee only");
   		} else if (ctx.getCallerPrincipal().getName()
            								.equals("paul")) {
       		book.setCreatedBy("special user");
   		}
   		return book; 
} 
}

@Stateless
@DeclareRoles({"HR", "salesDpt"})
@RolesAllowed({"user", "admin"})
@RunAs("inventoryDpt")
public class ItemEJB {
	@PermitAll
  	public Book findBookById(Long id) { }
  	public Book createBook(Book book) { }
  	@RolesAllowed("admin")
  	public void deleteBook(Book book) { }
@DenyAll
public Book findConfidentialBook(Long secureId) { }
}
