package facadedesignpattern;

public class AddressBookFacadeTest {

	public static void main(String[] args) 
	{
		/**
		 * Facade design pattern is more like a helper for client applications, 
		 * it doesn’t hide subsystem interfaces from the client. 
		 * Whether to use Facade or not is completely dependent on client code.
		*Facade design pattern can be applied at any point of development, 
        *usually when the number of interfaces grow and system gets complex.
        *Subsystem interfaces are not aware of Facade and they shouldn’t have any reference of the Facade interface.
        *Facade design pattern should be applied for similar kind of interfaces,
        * its purpose is to provide a single interface rather than multiple interfaces that does the similar kind of jobs.
        *We can use Factory pattern with Facade to provide better interface to client systems.
		 */
		HelperFacadeAddressBook h  = new HelperFacadeAddressBook();
		h.generateAddressBook();
	}

}
