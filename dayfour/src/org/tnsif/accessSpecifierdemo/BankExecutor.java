package org.tnsif.accessSpecifierdemo;
import org.tnsif.AccessSpecifier.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank B=new Bank();
B.bankname= "SBI";
B.displayPublic();

/*pin no and displayprivate methods are private,
*so we cant use into another package and access
*in same  package*/
//B.pinNO;
//B.displayPrivate();

/* account no and displayDefault are of Deafault Type so we cant
 * access in another classes
 */
//B.AccountNo;
//B.displayDefault();
	}

}
