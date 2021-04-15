import java.util.*;

class Project
{
	  static void messege()
	 {
		
		System.out.println("1 Even//odd:");
		System.out.println("2 swapping:");
		System.out.println("3 Gross_salary:");
		System.out.println("4 Simple_intrest:");
		System.out.println("5 Check vowel or consonent:");
		System.out.println("6 Leep Year:");
		System.out.println("7 Palindrome Number:");
		System.out.println("8 Prime Number:");
		System.out.println("9 Factorial Number:");
		System.out.println("10 Day number:");
		System.out.println("11 month number:");
		System.out.println("12 Table 1 to n:");
		System.out.println("13 Area of Rectangle:");
		System.out.println("14 Marks Grade:");
		System.out.println("15 Two number Smoller:");
		System.out.println("16 Total Marks Parsentage=500:");
		System.out.println("17 Area Of Trangle:");
		System.out.println("18 Reverse number:");
		System.out.println("19  YOUR Choice table   =");
		System.out.println("20-----print menu---------");
		System.out.println("21-------------------!EXIT!----------------------");
		System.out.println("**********!Don't worng choice!**********");
	 }
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
	System.out.println("**********ENTER YOUR CHOICE********** ");
	
	
		 messege();
	while(true)
	{
			
		System.out.print("Enter a choice number 1 to 21=");
		
		n=sc.nextInt();
	
		switch(n)
		{
			case 1:
			    int no;
				System.out.println("Enter a number=");
				no=sc.nextInt();
				if(no%2==0)
				{
					System.out.println("even number");
				}
				else
				{
					System.out.println("odd number");
				}
				  
					
				break;
			case 2: 
				int x,y,z;
				System.out.println("Enter a 1st number=");
					x=sc.nextInt();
				System.out.print("Enter a end number=");
					y=sc.nextInt();
					z=x;
					x=y;
					y=z;
					System.out.println("1st  value="+x);
					System.out.println("2nd value="+y);
					break;
			case 3:
				int gs,bs,da,ta;
				System.out.print("Enter a basic salary=");
				bs=sc.nextInt();
					da=(10*bs)/100;
					ta=(12*bs)/100;
					gs=bs+da+ta;
					System.out.println("Gross salary="+gs);
					break;
			case 4:
				int p,r,t,si;
				System.out.print("Enter a Amount=");
					p=sc.nextInt();
				System.out.print("Enter a Rate=");
					r=sc.nextInt();
				System.out.print("Enter a Time=");
					t=sc.nextInt();
					si=p*r*t/100;
					System.out.println("simple intrest="+si);
					break;
			case 5:
				char c;
				
			System.out.println("Enter a chr=");
				
				  c =sc.next().charAt(0);
			switch(c)
			{
				case 'a':
				System.out.println("vowel");
				break;
				case 'e':
				System.out.println("vowel");
				break;
				case 'i':
				System.out.println("vowel");
				break;
				case 'o':
				System.out.println("vowel");
				break;
				case 'u':
				System.out.println("vowel");
				break;
				case 'A':
				System.out.println("VoWEL");
				break;
				case 'E':
				System.out.println("VoWEL");
				break;
				case 'I':
				System.out.println("VoWEL");
				break;
				case 'O':
				System.out.println("VoWEL");
				break;
				case 'U':
				System.out.println("VoWEL");
				break;
				default:
				System.out.println("CONSONANT");
			}
				break;
			case 6:
			   int year;
				System.out.println("enter a Year=");
				year=sc.nextInt();
				if(year%400==0)
				{
				 System.out.println(year+"is a leep year");
				}
				else
				{
					if(year%100==0)
					{
						System.out.println(year+"is a  not leep year");
					}
				
					else
					{
						if(year%4==0)
						{
							System.out.println(year+"is a leep year");
						}
						else
						{
						   System.out.println(year+" is a not leep year");
						}
					}
				}
				break;
			case 7:
				 int pd,sum=0,temp;
				 int num;
				 System.out.print("ENTER A ANY NUMBER=");
				  num=sc.nextInt();
				  temp=num;
				  while(num>0)
				  {
					pd=num%10;
					sum=(sum*10)+pd;
					num=num/10;
				}
				if(temp==sum)
				{
					System.out.println("palindrome no");
				}
				else
				{
					System.out.println("not palindrome number");
				}
				break;
			case 8:
					int a;
					int Y=1,add=0;
					System.out.print("Enter a number=");
					  a=sc.nextInt();
				while(Y<=a)
				{
				  if(a%Y==0)
				    {
					  add=add+Y;
					}
					Y++;
				}
					if(add==(a+1))
					{
					   System.out.println(a+"prime is a number");
					}
					else
					{
					   System.out.println("not prime="+a);
					}
					break;
			case 9:
					int number,fact=1,f;
						
							System.out.print("Enter a number=");
								number=sc.nextInt();
										for(f=1;f<=number;f++)
										{	
											fact=fact*f;
										}
					
					System.out.println("factoroal of="+number+"is="+fact);
					break;
			case 10:
				int day;
				System.out.println("enter a Day_number=");
					day=sc.nextInt();
						if(day==1)
						{
							System.out.println("monday");
							
						}
						else if(day==2)
						{
							System.out.println("tuesday");
						}
						else if(day==3)
						{
							System.out.println("wednesday");
						}
						else if(day==4)
						{
							System.out.println("thursday");
						}
						else if(day==5)
						{
							System.out.println("firday");
						}
						else if(day==6)
						{
							System.out.println("saturady");
						}
						else if(day==7)
						{
							System.out.println("sunday");
						}
						
						else
						{
							System.out.println(" please enter a valid no 1-7");
						}
						
					break;
		
			case 11:
					int man;
						System.out.println("enter a month_number=");
							man=sc.nextInt();
							if(man==1)
						{
							System.out.println("JANUARY");
							
						}
						else if(man==2)
						{
							System.out.println("FEBURAY");
						}
						else if(man==3)
						{
							System.out.println("MARCH");
						}
						else if(man==4)
						{
							System.out.println("APRIL");
						}
						else if(man==5)
						{
							System.out.println("MAY");
						}
						else if(man==6)
						{
							System.out.println("JUN");
						}
						else if(man==7)
						{
							System.out.println("JULY");
						}
						else if(man==8)
						{
							System.out.println("AUGUST");
						}
						else if(man==9)
						{
							System.out.println("SEPTEMBER");
						}
						else if(man==10)
						{
							System.out.println("OCTOBER");
						}
						else if(man==11)
						{
							System.out.println("NOVEMBER");
						}
						else if(man==12)
						{
							System.out.println("DECEMBER");
						}
						
						else
						{
							System.out.println(" please enter a valid no 1-12");
						}
					break;
			case 12:
					int i,table,no1;
							System.out.print("FROM 1 to how much you want your table to go over=");
								no1=sc.nextInt();
							
							for(table=1; table<=no1; table++)
							{
							
								for(i=1;i<=10;i++)
								{	
									System.out.println(table+"*"+i+"="+table*i);
								}
								System.out.println("--------------");
								
							}
									System.out.println("we have want print agen menu:y/yes//n//no ");
										char yes=sc.next().charAt(0);
										
										if(yes=='y'|| yes=='Y')
										{
											
											
												messege();
										}
										else
											 {
												System.exit(0);
											}
						break;
			case 13:
								int ln,br,h;
									System.out.print("Enter a lenght=");
									   ln=sc.nextInt();
									   System.out.print("Enter a bridth=");
									   br=sc.nextInt();
										h=ln*br;
											System.out.println("Reactangle="+h);
						break;
			case 14:
									int marks;
									char grade;
									System.out.println("enter a marks=");
									marks=sc.nextInt();
									if(marks>=85)
									{
										grade='A';
										
									}
									else if(marks>=70)
									{
										grade='B';
									}
									else if(marks>=60)
									{
										grade='c';
									}
									else if(marks>=50)
									{
										grade='D';
									}
									else if(marks>=40)
									{
										grade='E';
									}
									else
									{
										grade='F';
									}
									 System.out.println("grade="+grade);
					break;
					
			case 15:
										int d,e;
							System.out.println("enter a 1st number=");
								d=sc.nextInt();
							System.out.println("enter a 2nd number=");
								e=sc.nextInt();
								if(d<e)
								{
									System.out.print("smoller number="+d);
								}
								else
								{
									System.out.print("Smoller number="+e);
								}
								break;
			case 16:
					float total,per;
					System.out.println("Enter obdent marks=");
					  per=sc.nextFloat();
					  total=100*per/500;
					  System.out.println("total persantage="+total);
						break;

			case 17:
					float b,hi,area;
					System.out.println("Enter a base=");
					b=sc.nextFloat();
					System.out.println("Enter a height=");
					hi=sc.nextInt();
					area=b*hi*1/2;
					System.out.println("Area of trangle="+area);//Diwakar kumar tiwari//
					break;
					
			case 18:
							int a1,b1;
							int d1=0;
							System.out.print("Enter a number=");
								a1=sc.nextInt();
								while(a1>0)
								{
									b1=a1%10;
									a1=a1/10;
									d1=(d1*10) + b1;
								}
								System.out.println("Reverse is="+d1);
								break;
			case 19:
					int l,no2;
							System.out.print("Enter your choice table=");
								no2=sc.nextInt();
							
							   for(l=1;l<=10;l++)
								{	
									System.out.println(no2+"*"+l+"="+no2*l);
								}
								break;
			case 20:
								System.out.println("--------------");
								
							  System.out.println("we have want print agen menu:y/yes//n//no ");
									char yess=sc.next().charAt(0);
									
									if(yess=='y'|| yess=='Y')
									{
										
										
											messege();
									}
									else
										 {
											System.exit(0);
										}
						break;
			case 21:
					
					System.exit(0);
			break;
				default:
				System.out.println("not found:");
		}
	}
		
	}
}
