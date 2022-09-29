	package all_prgms;
	import java.util.Scanner;
	public class prime_Odd {
		   public static void main(String[] args) {
		        Scanner in=new Scanner(System.in);
		        /**first taking the input from user
		         * upto which  last number we have to find 
		         * the Stepping numbers...@subham
		         */
		        int n=in.nextInt(); //taking input
		        /**
		         * stepping number is not valid for single digit
		         * so for 1-9 will be printing -1
		         */
		        if(n<10)
		        {
		            System.out.print("-1(not ODD)");
		        }
		        else{
		            for(int i=10;i<=n;i++) //n=100
		            {
		                int temp=i;
		                int count=0,c=1;
		                while(temp>10)
		                {
		                    int unit=temp%10;
		                    int tenth=(temp/10)%10;
		                    c++;
		                    if(Math.abs(unit-tenth)==1)
		                    {
		                        count++;
		                    }
		                    temp/=10;
		                }
		                if(c-1==count)
		                {
		                	int store=i;
		                    //System.out.print(i+" ");
		                	int counter=0;
		                	for(int z=1;z<=store;z++) {
		                		if(store%z==0) {
		                			counter++;
		                		}	
		                	}
		                	if(counter==2) {
		                		System.out.println(store);
		                	}
		                	//else {
		                		//System.out.println("exception/not prime/not stepping number");
		                	
		                }
		            }
		        }
		   
			}
	
	}
