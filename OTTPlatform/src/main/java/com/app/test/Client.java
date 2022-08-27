package com.app.test;
import java.util.List;
import java.util.Scanner;

import com.app.Dao.USerDao;
import com.app.Dao.UserDaoImpl;
import com.app.dto.InputRequest;
import com.app.dto.UserRequest;
import com.app.factory.UserFactory;
import com.app.model.User;
import com.app.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		UserDaoImpl dao=UserFactory.getUser();
		String ch="";
		do {
			System.out.println("Welcome To My Project");
			System.out.println("Press 1:Netflix");
			System.out.println("Press 2:Hotstar");
			System.out.println("Press 3:Amazon prime");
			System.out.println("-------------------------------");
			System.out.println("Enter your choice");
			int choice10=sn.nextInt();
			switch(choice10)
			{
			case 1:
				System.out.println("Welcome to Netflix platform");
			
			
			System.out.println("Press 1:Register");
			System.out.println("Press 2:Login");
			
			System.out.println("-------------------------------");
			System.out.println("Enter Your Choice:");
			int choice=sn.nextInt();
			switch (choice) {
			case 1:
				User user=InputRequest.register();
				int i=dao.register(user);
				if(i==1) {
					System.out.println("Successfully Registered");
				}else {
					System.out.println("Something went wrong...!");
				}
				
				break;
			case 2:
				UserRequest request=InputRequest.login();
				User user1=dao.login(request);
				if(user1!=null &&user1.getRole().equalsIgnoreCase("admin")) {
					System.out.println("Welcome to admin portal.");
					System.out.println("Press 1:Display Users");
					System.out.println("Press 2:Display User on id");
					System.out.println("Enter your choice");
					int choice8=sn.nextInt();
					switch(choice8)
					{
					case 1:
						List<User>list=dao.listOfUsers();
						list.stream().forEach(s->System.out.println(s.getId()+"\t"+s.getFisrtName()+" "+s.getLastName()+"\t"+s.getAddress()+"\t"+s.getMobile()));
					break;
					case 2:
						System.out.println("Enter your id for find user:");
						int id=sn.nextInt();
						User u1=dao.findById(id);
						System.out.println(u1);
						break;
					default:
						System.out.println("Invalid Request...!");
						break;
					}
				}else if(user1!=null &&user1.getRole().equalsIgnoreCase("user")){
					System.out.println("Welcome to User Portal..");
					System.out.println("Press 1: for 1 month Subscription");
					System.out.println("Press 2: for 6 month Subscription");
					System.out.println("Press 3: for 1 year Subscription");
					System.out.println("-------------------------------");
					System.out.println("Enter your choice");
					int choice2=sn.nextInt();
					switch(choice2)
					{
					case 1:
						System.out.println("Welcome to 1 month subscription");
						System.out.println("Payment Method..!!");
						System.out.println("Press 1: Credit or Debit Card");
						System.out.println("Press 2: UPI");
						System.out.println("Press 3: Net Banking");
						System.out.println("-------------------------------");
						System.out.println("Enter your choice");
							int choice3=sn.nextInt();
							switch(choice3)
							{
							case 1:
								System.out.println("Enter detail of credit or debit card");
								System.out.println("Enter card holder name");
								String hname=sn.next();
								System.out.println("Enter card validity date");
								int vdate=sn.nextInt();
								System.out.println("Enter CVV number");
								int cno=sn.nextInt();
								System.out.println("Enter your amount");
								int amt1=sn.nextInt();
								if(amt1==299)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
								
								
								
								break;
								
							case 2:
								System.out.println("Enter detail of UPI payment");
								System.out.println("Enter your UPI Id");
								String id=sn.next();
								System.out.println("Enter your amount");
								int amt12=sn.nextInt();
								if(amt12==299)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
								break;
							case 3:
								System.out.println("Bank list");
								System.out.println("Press 1: SBI");
								System.out.println("Press 2: ICICI");
								System.out.println("-------------------------------");
								System.out.println("Enter your choice");
								int choice4=sn.nextInt();
								switch(choice4)
								{
								case 1:
								    System.out.println("Welcom to SBI Bank");
									System.out.println("Enter your Detail : ");
									System.out.println("Enter your Account no :");
									Long acc=sn.nextLong();
									System.out.println("Enter your Confirm account no :");
									Long cacc=sn.nextLong();
									System.out.println("Enter amount");
									int amt=sn.nextInt();
									if(amt==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
									
								case 2:
									System.out.println("Welcom to ICICI Bank");
									System.out.println("Enter your Detail : ");
									System.out.println("Enter your Account no :");
									Long acc1=sn.nextLong();
									System.out.println("Enter your Confirm account no :");
									Long cacc1=sn.nextLong();
									System.out.println("Enter amount");
									int amt11=sn.nextInt();
									System.out.println("Pay now 299rs");
									if(amt11==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
								}
								break;
							}
						break;
					case 2:
						System.out.println("Welcom to 2 month subscription");
						System.out.println("Payment Method..!!");
						System.out.println("Press 1: Credit or Debit Card");
						System.out.println("Press 2: UPI");
						System.out.println("Press 3: Net Banking");
						System.out.println("-------------------------------");
						System.out.println("Enter your choice");
						int choice5=sn.nextInt();
						switch(choice5)
						{
						case 1:
							System.out.println("Enter detail of credit or debit card");
							System.out.println("Enter card holder name");
							String hname=sn.next();
							System.out.println("Enter card validity date");
							int vdate=sn.nextInt();
							System.out.println("Enter CVV number");
							int cno=sn.nextInt();
							System.out.println("Enter your amount");
							int amt1=sn.nextInt();
							if(amt1==299)
							{
								System.out.println("Successfully payment done...!!");
							}
							else
							{
								System.out.println("Invalid");
							}
						case 2:
							System.out.println("Enter detail of UPI payment");
							System.out.println("Enter your UPI Id");
							String id=sn.next();
							System.out.println("Enter your amount");
							int amt12=sn.nextInt();
							if(amt12==299)
							{
								System.out.println("Successfully payment done...!!");
							}
							else
							{
								System.out.println("Invalid");
							}
						case 3:
							System.out.println("Bank list");
							System.out.println("Press 1: SBI");
							System.out.println("Press 2: ICICI");
							System.out.println("-------------------------------");
							System.out.println("Enter your choice");
							int choice4=sn.nextInt();
							switch(choice4)
							{
							case 1:
							    System.out.println("Welcom to SBI Bank");
								System.out.println("Enter your Detail : ");
								System.out.println("Enter your Account no :");
								Long acc=sn.nextLong();
								System.out.println("Enter your Confirm account no :");
								Long cacc=sn.nextLong();
								System.out.println("Enter amount");
								int amt=sn.nextInt();
								System.out.println("Pay now 1500rs");
								if(amt==1500)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
								break;
								
							case 2:
								System.out.println("Welcom to ICICI Bank");
								System.out.println("Enter your Detail : ");
								System.out.println("Enter your Account no :");
								Long acc1=sn.nextLong();
								System.out.println("Enter your Confirm account no :");
								Long cacc1=sn.nextLong();
								System.out.println("Enter amount");
								int amt11=sn.nextInt();
								System.out.println("Pay now 1500rs");
								if(amt11==1500)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
								break;
							}
							break;
						}
						break;
					case 3:
						System.out.println("Welcom to 1 year subscription");
						System.out.println("Payment Method..!!");
						System.out.println("Press 1: Credit or Debit Card");
						System.out.println("Press 2: UPI");
						System.out.println("Press 3: Net Banking");
						System.out.println("-------------------------------");
						System.out.println("Enter your choice");
						int choice6=sn.nextInt();
						switch(choice6)
						{
						case 1:
							System.out.println("Enter detail of credit or debit card");
							System.out.println("Enter card holder name");
							String hname=sn.next();
							System.out.println("Enter card validity date");
							int vdate=sn.nextInt();
							System.out.println("Enter CVV number");
							int cno=sn.nextInt();
							System.out.println("Enter your amount");
							int amt1=sn.nextInt();
							if(amt1==299)
							{
								System.out.println("Successfully payment done...!!");
							}
							else
							{
								System.out.println("Invalid");
							}
						case 2:
							
							System.out.println("Enter detail of UPI payment");
							System.out.println("Enter your UPI Id");
							String id=sn.next();
							System.out.println("Enter your amount");
							int amt12=sn.nextInt();
							if(amt12==299)
							{
								System.out.println("Successfully payment done...!!");
							}
							else
							{
								System.out.println("Invalid");
							}
						case 3:
							System.out.println("Bank list");
							System.out.println("Press 1: SBI");
							System.out.println("Press 2: ICICI");
							System.out.println("-------------------------------");
							System.out.println("Enter your choice");
							int choice4=sn.nextInt();
							switch(choice4)
							{
							case 1:
							    System.out.println("Welcom to SBI Bank");
								System.out.println("Enter your Detail : ");
								System.out.println("Enter your Account no :");
								Long acc=sn.nextLong();
								System.out.println("Enter your Confirm account no :");
								Long cacc=sn.nextLong();
								System.out.println("Enter amount");
								int amt=sn.nextInt();
								System.out.println("Pay now 3199rs");
								if(amt==3199)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
								break;
								
							case 2:
								System.out.println("Welcom to ICICI Bank");
								System.out.println("Enter your Detail : ");
								System.out.println("Enter your Account no :");
								Long acc1=sn.nextLong();
								System.out.println("Enter your Confirm account no :");
								Long cacc1=sn.nextLong();
								System.out.println("Enter amount");
								int amt11=sn.nextInt();
								System.out.println("Pay now 3199rs");
								if(amt11==3199)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
								break;
							}
							break;
						}
						break;
					}
				}else {
					System.out.println("Invalid username and password");
				}
				break;
			
			default:
				System.out.println("Invalid Request...!");
				break;
			} 
			System.out.println("Do you want to continue...(y)");
			ch=sn.next();
			break;
			
			
					
		
		
			
			case 2:
				System.out.println("Welcome to Hotstar platform");
				
			
				System.out.println("Press 1:Register");
				System.out.println("Press 2:Login");
				
				System.out.println("-------------------------------");
				System.out.println("Enter Your Choice:");
				int choice1=sn.nextInt();
				switch (choice1) {
				case 1:
					User user=InputRequest.register();
					int i=dao.register(user);
					if(i==1) {
						System.out.println("Successfully Registered");
					}else {
						System.out.println("Something went wrong...!");
					}
					break;
				case 2:
					UserRequest request=InputRequest.login();
					User user1=dao.login(request);
					if(user1!=null &&user1.getRole().equalsIgnoreCase("admin")) {
						System.out.println("Welcome to admin portal.");
						System.out.println("Press 1:Display Users");
						System.out.println("Press 2:Display User on id");
						System.out.println("Enter your choice");
						int choice8=sn.nextInt();
						switch(choice8)
						{
						case 1:
							List<User>list=dao.listOfUsers();
							list.stream().forEach(s->System.out.println(s.getId()+"\t"+s.getFisrtName()+" "+s.getLastName()+"\t"+s.getAddress()+"\t"+s.getMobile()));
						break;
						case 2:
							System.out.println("Enter your id for find user:");
							int id=sn.nextInt();
							User u1=dao.findById(id);
							System.out.println(u1);
							break;
						default:
							System.out.println("Invalid Request...!");
							break;
						}
					}else if(user1!=null &&user1.getRole().equalsIgnoreCase("user")){
						System.out.println("Welcome to User Portal..");
						System.out.println("Press 1: for 1 month Subscription");
						System.out.println("Press 2: for 6 month Subscription");
						System.out.println("Press 3: for 1 year Subscription");
						System.out.println("-------------------------------");
						System.out.println("Enter your choice");
						int choice2=sn.nextInt();
						switch(choice2)
						{
						case 1:
							System.out.println("Welcome to 1 month subscription");
							System.out.println("Payment Method..!!");
							System.out.println("Press 1: Credit or Debit Card");
							System.out.println("Press 2: UPI");
							System.out.println("Press 3: Net Banking");
							System.out.println("-------------------------------");
							System.out.println("Enter your choice");
								int choice3=sn.nextInt();
								switch(choice3)
								{
								case 1:
									System.out.println("Enter detail of credit or debit card");
									System.out.println("Enter card holder name");
									String hname=sn.next();
									System.out.println("Enter card validity date");
									int vdate=sn.nextInt();
									System.out.println("Enter CVV number");
									int cno=sn.nextInt();
									System.out.println("Enter your amount");
									int amt1=sn.nextInt();
									if(amt1==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									
									
									
									break;
									
								case 2:
									System.out.println("Enter detail of UPI payment");
									System.out.println("Enter your UPI Id");
									String id=sn.next();
									System.out.println("Enter your amount");
									int amt12=sn.nextInt();
									if(amt12==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
								case 3:
									System.out.println("Bank list");
									System.out.println("Press 1: SBI");
									System.out.println("Press 2: ICICI");
									System.out.println("-------------------------------");
									System.out.println("Enter your choice");
									int choice4=sn.nextInt();
									switch(choice4)
									{
									case 1:
									    System.out.println("Welcom to SBI Bank");
										System.out.println("Enter your Detail : ");
										System.out.println("Enter your Account no :");
										Long acc=sn.nextLong();
										System.out.println("Enter your Confirm account no :");
										Long cacc=sn.nextLong();
										System.out.println("Enter amount");
										int amt=sn.nextInt();
										if(amt==299)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
										
									case 2:
										System.out.println("Welcom to ICICI Bank");
										System.out.println("Enter your Detail : ");
										System.out.println("Enter your Account no :");
										Long acc1=sn.nextLong();
										System.out.println("Enter your Confirm account no :");
										Long cacc1=sn.nextLong();
										System.out.println("Enter amount");
										int amt11=sn.nextInt();
										System.out.println("Pay now 299rs");
										if(amt11==299)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
									}
									break;
								}
							break;
						case 2:
							System.out.println("Welcom to 2 month subscription");
							System.out.println("Payment Method..!!");
							System.out.println("Press 1: Credit or Debit Card");
							System.out.println("Press 2: UPI");
							System.out.println("Press 3: Net Banking");
							System.out.println("-------------------------------");
							System.out.println("Enter your choice");
							int choice5=sn.nextInt();
							switch(choice5)
							{
							case 1:
								System.out.println("Enter detail of credit or debit card");
								System.out.println("Enter card holder name");
								String hname=sn.next();
								System.out.println("Enter card validity date");
								int vdate=sn.nextInt();
								System.out.println("Enter CVV number");
								int cno=sn.nextInt();
								System.out.println("Enter your amount");
								int amt1=sn.nextInt();
								if(amt1==299)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
							case 2:
								System.out.println("Enter detail of UPI payment");
								System.out.println("Enter your UPI Id");
								String id=sn.next();
								System.out.println("Enter your amount");
								int amt12=sn.nextInt();
								if(amt12==299)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
							case 3:
								System.out.println("Bank list");
								System.out.println("Press 1: SBI");
								System.out.println("Press 2: ICICI");
								System.out.println("-------------------------------");
								System.out.println("Enter your choice");
								int choice4=sn.nextInt();
								switch(choice4)
								{
								case 1:
								    System.out.println("Welcom to SBI Bank");
									System.out.println("Enter your Detail : ");
									System.out.println("Enter your Account no :");
									Long acc=sn.nextLong();
									System.out.println("Enter your Confirm account no :");
									Long cacc=sn.nextLong();
									System.out.println("Enter amount");
									int amt=sn.nextInt();
									System.out.println("Pay now 1500rs");
									if(amt==1500)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
									
								case 2:
									System.out.println("Welcom to ICICI Bank");
									System.out.println("Enter your Detail : ");
									System.out.println("Enter your Account no :");
									Long acc1=sn.nextLong();
									System.out.println("Enter your Confirm account no :");
									Long cacc1=sn.nextLong();
									System.out.println("Enter amount");
									int amt11=sn.nextInt();
									System.out.println("Pay now 1500rs");
									if(amt11==1500)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
								}
								break;
							}
							break;
						case 3:
							System.out.println("Welcom to 1 year subscription");
							System.out.println("Payment Method..!!");
							System.out.println("Press 1: Credit or Debit Card");
							System.out.println("Press 2: UPI");
							System.out.println("Press 3: Net Banking");
							System.out.println("-------------------------------");
							System.out.println("Enter your choice");
							int choice6=sn.nextInt();
							switch(choice6)
							{
							case 1:
								System.out.println("Enter detail of credit or debit card");
								System.out.println("Enter card holder name");
								String hname=sn.next();
								System.out.println("Enter card validity date");
								int vdate=sn.nextInt();
								System.out.println("Enter CVV number");
								int cno=sn.nextInt();
								System.out.println("Enter your amount");
								int amt1=sn.nextInt();
								if(amt1==299)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
							case 2:
								
								System.out.println("Enter detail of UPI payment");
								System.out.println("Enter your UPI Id");
								String id=sn.next();
								System.out.println("Enter your amount");
								int amt12=sn.nextInt();
								if(amt12==299)
								{
									System.out.println("Successfully payment done...!!");
								}
								else
								{
									System.out.println("Invalid");
								}
							case 3:
								System.out.println("Bank list");
								System.out.println("Press 1: SBI");
								System.out.println("Press 2: ICICI");
								System.out.println("-------------------------------");
								System.out.println("Enter your choice");
								int choice4=sn.nextInt();
								switch(choice4)
								{
								case 1:
								    System.out.println("Welcom to SBI Bank");
									System.out.println("Enter your Detail : ");
									System.out.println("Enter your Account no :");
									Long acc=sn.nextLong();
									System.out.println("Enter your Confirm account no :");
									Long cacc=sn.nextLong();
									System.out.println("Enter amount");
									int amt=sn.nextInt();
									System.out.println("Pay now 3199rs");
									if(amt==3299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
									
								case 2:
									System.out.println("Welcom to ICICI Bank");
									System.out.println("Enter your Detail : ");
									System.out.println("Enter your Account no :");
									Long acc1=sn.nextLong();
									System.out.println("Enter your Confirm account no :");
									Long cacc1=sn.nextLong();
									System.out.println("Enter amount");
									int amt11=sn.nextInt();
									System.out.println("Pay now 3199rs");
									if(amt11==3199)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
									break;
								}
								break;
							}
							break;
						}
					}else {
						System.out.println("Invalid username and password");
					}
					break;
				
				default:
					System.out.println("Invalid Request...!");
					break;
				} 
				System.out.println("Do you want to continue...(y)");
				ch=sn.next();
				break;
				
				
				
				
				
				case 3:
					System.out.println("Welcome to Amazon Prime platform");
					
					System.out.println("Press 1:Register");
					System.out.println("Press 2:Login");
					
					System.out.println("-------------------------------");
					System.out.println("Enter Your Choice:");
					int choice20=sn.nextInt();
					switch (choice20) {
					case 1:
						User user=InputRequest.register();
						int i=dao.register(user);
						if(i==1) {
							System.out.println("Successfully Registered");
						}else {
							System.out.println("Something went wrong...!");
						}
						break;
					case 2:
						UserRequest request=InputRequest.login();
						User user1=dao.login(request);
						if(user1!=null &&user1.getRole().equalsIgnoreCase("admin")) {
							System.out.println("Welcome to admin portal.");
							System.out.println("Press 1:Display Users");
							System.out.println("Press 2:Display User on id");
							System.out.println("Enter your choice");
							int choice8=sn.nextInt();
							switch(choice8)
							{
							case 1:
								List<User>list=dao.listOfUsers();
								list.stream().forEach(s->System.out.println(s.getId()+"\t"+s.getFisrtName()+" "+s.getLastName()+"\t"+s.getAddress()+"\t"+s.getMobile()));
							break;
							case 2:
								System.out.println("Enter your id for find user:");
								int id=sn.nextInt();
								User u1=dao.findById(id);
								System.out.println(u1);
								break;
							default:
								System.out.println("Invalid Request...!");
								break;
							}
						}else if(user1!=null &&user1.getRole().equalsIgnoreCase("user")){
							System.out.println("Welcome to User Portal..");
							System.out.println("Press 1: for 1 month Subscription");
							System.out.println("Press 2: for 6 month Subscription");
							System.out.println("Press 3: for 1 year Subscription");
							System.out.println("-------------------------------");
							System.out.println("Enter your choice");
							int choice2=sn.nextInt();
							switch(choice2)
							{
							case 1:
								System.out.println("Welcome to 1 month subscription");
								System.out.println("Payment Method..!!");
								System.out.println("Press 1: Credit or Debit Card");
								System.out.println("Press 2: UPI");
								System.out.println("Press 3: Net Banking");
								System.out.println("-------------------------------");
								System.out.println("Enter your choice");
									int choice3=sn.nextInt();
									switch(choice3)
									{
									case 1:
										System.out.println("Enter detail of credit or debit card");
										System.out.println("Enter card holder name");
										String hname=sn.next();
										System.out.println("Enter card validity date");
										int vdate=sn.nextInt();
										System.out.println("Enter CVV number");
										int cno=sn.nextInt();
										System.out.println("Enter your amount");
										int amt1=sn.nextInt();
										if(amt1==299)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										
										
										
										break;
										
									case 2:
										System.out.println("Enter detail of UPI payment");
										System.out.println("Enter your UPI Id");
										String id=sn.next();
										System.out.println("Enter your amount");
										int amt12=sn.nextInt();
										if(amt12==299)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
									case 3:
										System.out.println("Bank list");
										System.out.println("Press 1: SBI");
										System.out.println("Press 2: ICICI");
										System.out.println("-------------------------------");
										System.out.println("Enter your choice");
										int choice4=sn.nextInt();
										switch(choice4)
										{
										case 1:
										    System.out.println("Welcom to SBI Bank");
											System.out.println("Enter your Detail : ");
											System.out.println("Enter your Account no :");
											Long acc=sn.nextLong();
											System.out.println("Enter your Confirm account no :");
											Long cacc=sn.nextLong();
											System.out.println("Enter amount");
											int amt=sn.nextInt();
											if(amt==299)
											{
												System.out.println("Successfully payment done...!!");
											}
											else
											{
												System.out.println("Invalid");
											}
											break;
											
										case 2:
											System.out.println("Welcom to ICICI Bank");
											System.out.println("Enter your Detail : ");
											System.out.println("Enter your Account no :");
											Long acc1=sn.nextLong();
											System.out.println("Enter your Confirm account no :");
											Long cacc1=sn.nextLong();
											System.out.println("Enter amount");
											int amt11=sn.nextInt();
											System.out.println("Pay now 299rs");
											if(amt11==299)
											{
												System.out.println("Successfully payment done...!!");
											}
											else
											{
												System.out.println("Invalid");
											}
											break;
										}
										break;
									}
								break;
							case 2:
								System.out.println("Welcom to 2 month subscription");
								System.out.println("Payment Method..!!");
								System.out.println("Press 1: Credit or Debit Card");
								System.out.println("Press 2: UPI");
								System.out.println("Press 3: Net Banking");
								System.out.println("-------------------------------");
								System.out.println("Enter your choice");
								int choice5=sn.nextInt();
								switch(choice5)
								{
								case 1:
									System.out.println("Enter detail of credit or debit card");
									System.out.println("Enter card holder name");
									String hname=sn.next();
									System.out.println("Enter card validity date");
									int vdate=sn.nextInt();
									System.out.println("Enter CVV number");
									int cno=sn.nextInt();
									System.out.println("Enter your amount");
									int amt1=sn.nextInt();
									if(amt1==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
								case 2:
									System.out.println("Enter detail of UPI payment");
									System.out.println("Enter your UPI Id");
									String id=sn.next();
									System.out.println("Enter your amount");
									int amt12=sn.nextInt();
									if(amt12==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
								case 3:
									System.out.println("Bank list");
									System.out.println("Press 1: SBI");
									System.out.println("Press 2: ICICI");
									System.out.println("-------------------------------");
									System.out.println("Enter your choice");
									int choice4=sn.nextInt();
									switch(choice4)
									{
									case 1:
									    System.out.println("Welcom to SBI Bank");
										System.out.println("Enter your Detail : ");
										System.out.println("Enter your Account no :");
										Long acc=sn.nextLong();
										System.out.println("Enter your Confirm account no :");
										Long cacc=sn.nextLong();
										System.out.println("Enter amount");
										int amt=sn.nextInt();
										System.out.println("Pay now 1500rs");
										if(amt==1500)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
										
									case 2:
										System.out.println("Welcom to ICICI Bank");
										System.out.println("Enter your Detail : ");
										System.out.println("Enter your Account no :");
										Long acc1=sn.nextLong();
										System.out.println("Enter your Confirm account no :");
										Long cacc1=sn.nextLong();
										System.out.println("Enter amount");
										int amt11=sn.nextInt();
										System.out.println("Pay now 1500rs");
										if(amt11==1500)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
									}
									break;
								}
								break;
							case 3:
								System.out.println("Welcom to 1 year subscription");
								System.out.println("Payment Method..!!");
								System.out.println("Press 1: Credit or Debit Card");
								System.out.println("Press 2: UPI");
								System.out.println("Press 3: Net Banking");
								System.out.println("-------------------------------");
								System.out.println("Enter your choice");
								int choice6=sn.nextInt();
								switch(choice6)
								{
								case 1:
									System.out.println("Enter detail of credit or debit card");
									System.out.println("Enter card holder name");
									String hname=sn.next();
									System.out.println("Enter card validity date");
									int vdate=sn.nextInt();
									System.out.println("Enter CVV number");
									int cno=sn.nextInt();
									System.out.println("Enter your amount");
									int amt1=sn.nextInt();
									if(amt1==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
								case 2:
									
									System.out.println("Enter detail of UPI payment");
									System.out.println("Enter your UPI Id");
									String id=sn.next();
									System.out.println("Enter your amount");
									int amt12=sn.nextInt();
									if(amt12==299)
									{
										System.out.println("Successfully payment done...!!");
									}
									else
									{
										System.out.println("Invalid");
									}
								case 3:
									System.out.println("Bank list");
									System.out.println("Press 1: SBI");
									System.out.println("Press 2: ICICI");
									System.out.println("-------------------------------");
									System.out.println("Enter your choice");
									int choice4=sn.nextInt();
									switch(choice4)
									{
									case 1:
									    System.out.println("Welcom to SBI Bank");
										System.out.println("Enter your Detail : ");
										System.out.println("Enter your Account no :");
										Long acc=sn.nextLong();
										System.out.println("Enter your Confirm account no :");
										Long cacc=sn.nextLong();
										System.out.println("Enter amount");
										int amt=sn.nextInt();
										System.out.println("Pay now 3199rs");
										if(amt==3299)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
										
									case 2:
										System.out.println("Welcom to ICICI Bank");
										System.out.println("Enter your Detail : ");
										System.out.println("Enter your Account no :");
										Long acc1=sn.nextLong();
										System.out.println("Enter your Confirm account no :");
										Long cacc1=sn.nextLong();
										System.out.println("Enter amount");
										int amt11=sn.nextInt();
										System.out.println("Pay now 3199rs");
										if(amt11==3199)
										{
											System.out.println("Successfully payment done...!!");
										}
										else
										{
											System.out.println("Invalid");
										}
										break;
									}
									break;
								}
								break;
							}
						}else {
							System.out.println("Invalid username and password");
						}
						break;
					
					default:
						System.out.println("Invalid Request...!");
						break;
					} 
					System.out.println("Do you want to continue...(y)");
					ch=sn.next();
					break;
					
		
					
					
				
	}

		}
	
	while(ch.equalsIgnoreCase("y"));
		System.out.println("Thank you");
	}	
	}
	
	