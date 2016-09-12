package tp.iocean;

public class CustomerBoImpl implements CustomerBo {

	public void getCustomer() {
		System.out.println("getCustomer() is running ");
		System.out.println("");
	}

	public String getCustomerReturnValue() {
		System.out.println("getCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() {
		System.out.println("addCustomerThrowException() is running ");
		// throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) throws Exception {
		Thread.sleep(1000);
		System.out.println("addCustomerAround() is running, args : " + name);
	}
}