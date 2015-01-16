package br.com.pizzanamao.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloWorld {

	
	@GET
	@Path("/{param}")
	public String getHello(@PathParam("param") String msg){
		return "Hello," + msg;
	}
	
	@GET
	@Path("/getHello")
	public String getHello(){
		return "Hello World!";
	}

	@GET
	@Path("/getBook/{id}")
	@Produces("application/json")
	public Book getBook(@PathParam("id")int id) {
        Book b = new Book();
        b.id = id;
        return b;
    }

    public static final class Book {
        public int id = 1;
        public String title = "Java";
    }
}
