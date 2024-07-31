package repository;

public class CustomerRepositoryImpl implements CustomerRepository {
	 @Override
	    public String findCustomerById(String id) {
	        // Simulating database access
	        if (id.equals("1")) {
	            return "Snitika";
	        } else {
	            return "Customer not found";
	        }
	    }

}
