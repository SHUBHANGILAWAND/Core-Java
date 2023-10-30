
package CustomerInfo;

public class Customer {

	private int id;
	private String name;
	private String address;
	
	public Customer(int cid,String cname,String caddress)
	{
		id=cid;
		name=cname;
		address=caddress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
