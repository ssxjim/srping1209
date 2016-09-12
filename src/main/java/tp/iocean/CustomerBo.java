package tp.iocean;

public interface CustomerBo {

	void getCustomer();

	String getCustomerReturnValue();

	void addCustomerThrowException() throws Exception;

	void addCustomerAround(String name) throws Exception;
}