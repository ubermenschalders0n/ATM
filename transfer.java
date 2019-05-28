package proje;


public class transfer  {
   public static void transfers(admin moneyfromthis,admin transferedtothis,double transfermoney) {
    	System.out.println("Your money before transfer is(transfered from this) "+moneyfromthis.getBalance());
    	System.out.println("Your money before transfer is(transfered account) "+transferedtothis.getBalance());
	   moneyfromthis.setBalance(moneyfromthis.getBalance()-transfermoney);
    	transferedtothis.setBalance(transferedtothis.getBalance()+transfermoney);
    	System.out.println("Your money after transfer is(transfered from this) "+moneyfromthis.getBalance());
    	System.out.println("Your money after transfer is(transfered account) "+transferedtothis.getBalance());
     }
}
