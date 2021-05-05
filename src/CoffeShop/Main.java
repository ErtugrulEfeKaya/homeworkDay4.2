package CoffeShop;

import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Engin", "Demiro�", LocalDate.of(1985, 1, 6), "28861499108"));
		customerManager.save(new Customer(2, "Ertu�rul Efe", "Kaya", LocalDate.of(2001, 2, 21), "29035547724"));
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(new Customer(2, "Ertu�rul Efe", "Kaya", LocalDate.of(2001, 2, 21), "29035547724"));
	}

}
