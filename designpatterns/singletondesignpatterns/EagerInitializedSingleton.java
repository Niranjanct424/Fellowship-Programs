package singletondesignpatterns;

/**
 * @author Niranjan c t
 *Singleton pattern restricts the instantiation of a class and 
 *ensures that only one instance of the class exists in the java virtual machine.
 *The singleton class must provide a global access point to get the instance of the class.
 *Singleton pattern is used for logging, drivers objects, caching and thread pool.
 *Private constructor to restrict instantiation of the class from other classes.
 *Private static variable of the same class that is the only instance of the class.
 *Public static method that returns the instance of the class, 
 *this is the global access point for outer world to get the instance of the singleton class.
 */
public class EagerInitializedSingleton 
{
	 private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	     int a = 10;
	     int b = 20;
	    //private constructor to avoid client applications to use constructor
	    private EagerInitializedSingleton(){
	    	System.out.println("EagerInitializedSingleton constructor ");
	    }

	    public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	    public static void main(String[] args) {
			System.out.println(instance.a);
			System.out.println(instance.b);
		}
}

