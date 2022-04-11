package travel.payment;


public class MergeSort {
	
	
		public void divide(int arr[],int start,int end) {
			
			if(start<end) {
			
			int mid=(start+end)/2;        //(start+end)/2;<- May go out of int limits
						
			//Recursion to divide array
			divide(arr,start,mid);		
			divide(arr,mid+1,end);		
			
			//Merge/conquer the divided array
			conquer(arr,start,mid,end);		
			
		}
			//return arr;
	}
		

		public void conquer(int arr[],int start,int mid,int end) {
			
			int len1=(mid-start)+1;
			int len2=end-mid;
			
			int leftArr[]=new int[len1];
			int rightArr[]=new int[len2];
			
			for(int i=0;i<len1;i++) {
				leftArr[i]=arr[start+i];
			}
			for(int j=0;j<len2;j++) {
				rightArr[j]=arr[mid+1+j];
			}
			
			int i=0; //for traversing 1st half of array
			int j=0; //for traversing 2nd half of array
			int k=start; //for traversing Merged array
			
			while(i<len1 && j<len2) {
				if(leftArr[i]>=rightArr[j]) {
					arr[k]=leftArr[i];
					i++;
				}
				else {
					arr[k]=rightArr[j];
					j++;
				}
				k++;
			}
			
			while(i<len1) {
				arr[k++]=leftArr[i++];
			}
			while(j<len2) {
				arr[k++]=rightArr[j++];
			}			
		}
		
		public void display(int arr[]) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				System.out.println();
			}
	}







}

