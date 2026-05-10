class Program
{
    //Application execution starts here

    static void Main()
    {
        //display title
        System.Console.WriteLine("**************Harsha Bank******************");
        System.Console.WriteLine("::Login Page::");

        //declare variables to store username and password;
        string userName = null, password = null;

        //read userName from keyboard
        System.Console.Write("Username:");
        userName = System.Console.ReadLine();

        if(userName != null )
        {
            //read password from keyboard
            System.Console.Write("Password:");
            password = System.Console.ReadLine();
        }
        //check username and password
        if (userName == "system" && password == "manager")
        {
            int mainMenuChoice = -1;
            do
            {
                //declare variable to store menu choice

                System.Console.WriteLine("TO DO: Main menu here");
                System.Console.WriteLine("\n:::Main menu:::");
                System.Console.WriteLine("1. Customers");
                System.Console.WriteLine("2. Accounts");
                System.Console.WriteLine("3. Funds Transfer");
                System.Console.WriteLine("4. Funds Transfer Statement");
                System.Console.WriteLine("5. Account Statement");
                System.Console.WriteLine("0. Exit");

                System.Console.Write("Enter choice:");
                mainMenuChoice = int.Parse(System.Console.ReadLine());
                switch (mainMenuChoice)
                {
                    case 1:CustomersMenu();
                        break;
                    case 2:AccountsMenu();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;

                }
            } while (mainMenuChoice != 0);
        }
        else
        {
            System.Console.WriteLine("Invalid username or password");
        }
        //about to exit
        System.Console.WriteLine("Thank you! Visit again");
        System.Console.ReadKey();
    }

    static void CustomersMenu()
    {
        //variable to store customers menu choice
        int customerMenuChoice = -1;

        do
        {
            System.Console.WriteLine("\n:::Customers menu:::");
            System.Console.WriteLine("1.Add Customer");
            System.Console.WriteLine("2.Delete Customer");
            System.Console.WriteLine("3.Update Customer");
            System.Console.WriteLine("4.View Customer");
            System.Console.WriteLine("0.Back to Main Menu");

            System.Console.Write("Enter choice;");
            customerMenuChoice = System.Convert.ToInt32 (System.Console.ReadLine());

        }while (customerMenuChoice != 0);
    }
    static void AccountsMenu()
    {
        int AccountMenuChoice = -1;

        do
        {
            System.Console.WriteLine("\n:::Accounts menu:::");
            System.Console.WriteLine("1.Add Account");
            System.Console.WriteLine("2.Delete Account");
            System.Console.WriteLine("3.Update Account");
            System.Console.WriteLine("4.View Account");
            System.Console.WriteLine("0.Back to Main Menu");

            System.Console.Write("Enter choice;");
            AccountMenuChoice = System.Convert.ToInt32(System.Console.ReadLine());

        } while (AccountMenuChoice != 0);
    }
}