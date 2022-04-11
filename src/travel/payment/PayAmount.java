package travel.payment;

public class PayAmount {
	
	public void noOfNotes(int arr[],int amount) {
		MergeSort sort=new MergeSort();
		
		//System.out.println("Array before sorting : ");
		//sort.display(arr);
		
		sort.divide(arr,0,arr.length-1);
		
		//System.out.println("Denominations after sorting : ");
		//sort.display(arr);
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		calc(arr,amount);
	
		
		
	}		
		
	public void calc(int arr[],int amount) {
		
		int i=0;
		int d;
		//int total=0;
		for(int j=0;j<arr.length;j++) {
			while(i<arr.length) {
				if(amount>=arr[i]) {
					d=amount/arr[i];
					amount=amount%arr[i];					
					//total=total+(arr[i]*d);
					System.out.println(arr[i]+" : "+d);
					i++;
								
				}
				else {
					i++;
				}
				
			}
			
		}
		
		if(amount>0) {
			
			System.out.println("Donot have the valid denomination for the amount -> "+ amount);
		}
	}
	
	
}
