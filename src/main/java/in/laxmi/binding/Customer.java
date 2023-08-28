package in.laxmi.binding;

import lombok.Data;

@Data
public class Customer {
private Integer id;
private  String name;
private String email;
private String pwd;
private Address address;
}
