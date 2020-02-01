package singletondesignpatterns;

/**
 * 
 * @author NIRANJAN CT
 */

public class StaticBlockSingleton 
{

    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){
    	System.out.println("StaticBlockSingleton constructor executed");
    }
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    
    public static void main(String[] args) {
	}

}
