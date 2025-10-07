package Assignments;

public class LoanEligibilityCheck {

	public static void main(String[] args) {
		//based on below details, print whether user is eligible to get the loan or not
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		//A bank evaluates loan applicants based on the following criteria:
		if (creditScore>750) {
			System.out.println("Customer loan is approved because of good credit score");
		}
		else if (creditScore>650 && creditScore<750) {
			System.out.println("Need to check few extra parameter of customer");
			
			// checking the income of customer
			if (income >= 50000) {
				System.out.println("customer is eligibel to verify further details");
				// checking the customer is employed or not
				if (isEmployed) {
					System.out.println("Customer is eligible for further verification if customer is employed");
					// checking customer debt To Income Ratio
					if (debtToIncomeRatio < 40) {
						System.out.println("Customer is eligible on the basis of all the above parameters");	 
						//below one executed if customer debt To Income Ratio is greater than 40
					} else {
						System.out.println("Customer is not eligible to approve the loan as denbtToIncomeRation is greater than 40");
					}
				}
				// below one executed if customer  is not employed
				else {
						System.out.println("As customer is not employed loan should not be approve");
						
					}
			}
			//below one executed if customer having less than 50000 salary
			else {
				System.out.println("Loan should not be approved as customer having less than 50000 salary");
				
					
				}
		}
		//below one executed if customer having credit score less than 650
		else {
			System.out.println("Customer is not eligible to get loan because of credit score is less than 650");
			}
		}
			}
		