package myPackage;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {9,2,8,4,5,1};
		
		
			for( int i=0; i<a.length;i++ ) {
				for(int j=0;j<a.length;j++) {
					if( a[i] < a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
					
				}
			}
			for( int i=0; i<a.length;i++ ) {
				
					
					System.out.println("bubble sort:" + a[i]);
					
				
			}
		}
		
		
		

	}


