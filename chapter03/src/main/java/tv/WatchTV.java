package tv;

public class WatchTV {

	public static void main(String[] args) {
		
        TV tv = new TV( 7, 20, false);  	
        
        System.out.println("1번째)");
        tv.status();	
        
        tv.power( true );
        tv.volume( 120 );
        System.out.println("2번째)");
        tv.status();		          
        
        tv.volume( false );
        System.out.println("3번째)");
        tv.status();
        
        tv.channel( 0 );
        System.out.println("4번째)");
        tv.status();		          
        
        tv.channel( true );
        tv.channel( true );
        tv.channel( true );
        System.out.println("5번째)");
        tv.status();

        tv.power( false );
        System.out.println("6번째)");
        tv.status();      		          
    
	
	}


	
	
	
	
}
