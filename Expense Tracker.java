User Registration: 
public class User {
    private String username;
    private String password;
    public User(String username,String password) {
        this.username=username;
        this.password=password;
    } 
}

Expense Entry:
public class Expense {
private String date;
private String category;
private String description;
private double amount;
public Expense(String date,String category,String description,double amount) {
    this.date=date;
    this.category=category;
    this.description=description;
    this.amount=amount;
} 
}

Data Handling:
import java.io.*;
import java.util.ArrayList;
public class ExpenseStorage {
    private static final String
    FILENAME="expenses.txt";
    public static void saveExpenses(ArrayList<Expense>expenses) {
        try (PrintWriter writer =new PrintWriter(newFileWrriter(FILENAME))) {
            for(Expense e:expenses) {
                writer.println(e.getDate() +","+e.getCategory()+","+e.getDescription()+","+e.getAmount());
            }
        }catch(IOException e) {
            System.out.println("Error saving expenses:"+e.getMessage());
        }
        }
        public static ArrayList<Expense>loadExpenses() {
            ArrayList<Expense>expenses=new ArrayList<>();
            try(BufferedReader reader=new BufferedReader(newFileReader(FILENAME))) {
                String line;
                while(line=reader.readLine()!=null) {
                    String[] parts=line.split(",");
                    expenses.add(newExpense(parts[0],parts[1],parts[2],Double.parseDouble(parts[3])));
                }
            }catch(IOException e) {
                System.out.println("Errorloading expenses:"+e.getMessage());
            }
            return expenses;
        }
}

User interface Design
import java.util.ArrayList;
import java.util.scanner;
public class ExpenseTracker {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Expense>expenses=ExpenseStorage.loadExpenses();
        while(true) {
            System.oiut.pritnln("\n Expense Tracker Menu:");
            System.out.pritnln("1.Add Expense:");
            System.out.println("2.Vierw Expenses:");
            System.out.println("3.Exit");
            System.out.println("Enter your choice:");
            int choice=scanner.nextInt();
            switch(choice) {
                case 1:System.out.print("Enetr date(YYYY-MM-DD):");
                String date=scanner.next();
                System.out.pritn("Enter description:");
                String description=scanner.next();
                System.out.print("Enter amount:");
                double amount=scnner.nextDouble();
                expenses.add(newExpense(date,category,description,amount));
                break;
                case 2:for(Expense e:expenses) {
                    System.out.println(e);
                }
                break;
                case 3:System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice.Please try again");
            }       
    }
}
}

Exception Handling:
try {
    exception
}catch(Exception e) {
    System.out.println("An error occured:"+e.getMessage());
}

Category-wise Summation:
public static double getTotalByCategory(ArrayList<Expense>expenses,String category) {
    double total=0;
    for(Expense e:expenses) {
        if(e.getCategory().equalIsIgnoreCase(category))
        {
            total+=e.getAmount();
        }
    }
    return total;
}
