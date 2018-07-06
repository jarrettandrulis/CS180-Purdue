import javax.swing.JOptionPane;
public class FAFSAGUI {
	public static void main(String[] args)
	{
		while(true)
		{
			JOptionPane.showMessageDialog(null, "Welcome to the FAFSA!","Welcome",JOptionPane.INFORMATION_MESSAGE);
			int programAcceptance = JOptionPane.showConfirmDialog(null, "Have you been accepted into a degree or certificate program?", "Program Acceptance", JOptionPane.YES_NO_OPTION);
			int selectiveService =  JOptionPane.showConfirmDialog(null, "Are you registered for the selective service?", "Selective Service", JOptionPane.YES_NO_OPTION);
			int socialSecurity =  JOptionPane.showConfirmDialog(null, "Do you have a social security number?", "Social Security Number", JOptionPane.YES_NO_OPTION);
			int residency =  JOptionPane.showConfirmDialog(null, "Do you have a valid residency status?", "Residency Status", JOptionPane.YES_NO_OPTION);
			int age;
			System.out.println(programAcceptance);
			while(true)
			{
				age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?", "Age", JOptionPane.QUESTION_MESSAGE));
				if(age < 0)
					JOptionPane.showMessageDialog(null, "Age cannot be a negative number", "Error: Age", JOptionPane.ERROR_MESSAGE);
				else
					break;
			}
			int creditHours;
			while(true)
			{
				creditHours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many credit hours do you plan on taking?", "Credit Hours", JOptionPane.QUESTION_MESSAGE));
				if( creditHours > 24 || creditHours < 0)
					JOptionPane.showMessageDialog(null, "Credit hours must be between 1 and 24, inclusive", "Error: Credit Hours", JOptionPane.ERROR_MESSAGE);
				else
					break;
			}
			int studentIncome;
			while(true)
			{
				studentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your total yearly income?", "Student Income", JOptionPane.QUESTION_MESSAGE));
				if(studentIncome < 0)
					JOptionPane.showMessageDialog(null, "Income cannot be a negative number", "Error: Student Income", JOptionPane.ERROR_MESSAGE);
				else
					break;
			}
			int parentIncome;
			while(true)
			{
				parentIncome = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your parent's total yearly income?", "Student Income", JOptionPane.QUESTION_MESSAGE));
				if(parentIncome < 0)
					JOptionPane.showMessageDialog(null, "Income cannot be a negative number", "Error: Parent Income", JOptionPane.ERROR_MESSAGE);
				else
					break;
			}
			int dependency =  JOptionPane.showConfirmDialog(null, "Are you a dependent?", "Dependency", JOptionPane.YES_NO_OPTION);
			String[] choices = {"Freshman", "Sophomore", "Junior", "Senior", "Graduate"};
			String year = (String)JOptionPane.showInputDialog(null,"What is your current class standing", "Class Standing", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0] );
			if(!year.equals("Graduate"))
				year = "Undergraduate";
			FAFSA fafsa = new FAFSA(programAcceptance == 0, selectiveService == 0, socialSecurity == 0, residency ==0, dependency ==0, age, creditHours,studentIncome, parentIncome, year);
			double loans = fafsa.calcStaffordLoan();
			double grants = fafsa.calcFederalGrant();
			double workStudy = fafsa.calcWorkStudy();
			double total = fafsa.calcFederalAidAmount();
			String message = String.format("Loans: $%.2f \nGrants: $%.2f \nWork Study: $%.2f\n--------------------" +
                    "\nTotal: $%.2f \n",loans,grants,workStudy,total);
			JOptionPane.showMessageDialog(null, message, "FAFSA Results", JOptionPane.INFORMATION_MESSAGE);
            if(JOptionPane.showConfirmDialog(null, "Would you like to complete another Application?", "Continue",
                    JOptionPane.YES_NO_OPTION) == 1)
                break;
		}

	}
}
