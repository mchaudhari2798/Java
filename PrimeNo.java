class PrimeNo{
	public static void main(String[] args) {
		int num=23;
		//int a=Integer.parseInt(args[0]);
		
		boolean istrue = true ;
		
		for(int i=2;i<num;i++)
		{
			if( num % i == 0) {
				istrue = false;
				break;
		} 
			
		}
			if(istrue) {
				System.out.println("NO IS PRIME");}
				else
					System.out.println("NO IS NOT PRIME");
			}
	}

