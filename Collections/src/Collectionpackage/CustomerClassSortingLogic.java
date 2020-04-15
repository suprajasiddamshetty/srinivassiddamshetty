package Collectionpackage;
import java.util.Comparator;

public class CustomerClassSortingLogic implements Comparator<CustomerClass> {

	@Override
	public int compare(CustomerClass c1, CustomerClass c2) {
		// TODO Auto-generated method stub
		if(c1.cid==c2.cid)
		{
			return 0;
		}
		else if(c1.cid>c2.cid)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
