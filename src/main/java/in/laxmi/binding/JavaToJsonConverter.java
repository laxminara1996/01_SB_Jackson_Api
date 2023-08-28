package in.laxmi.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {
		Address ad = new Address();
		ad.setCity("atp");
		ad.setCountry("india");
		ad.setState("ap");
		Customer c = new Customer();
		c.setId(100);
		c.setName("laxmi");
		c.setEmail("laxmi@gmail.com");
		c.setPwd("12344");
		c.setAddress(ad);
		ObjectMapper obm = new ObjectMapper();
		obm.writeValue(new File("customer.json"), c);
	}
}
