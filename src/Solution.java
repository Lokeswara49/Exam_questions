import java.util.*;

import static java.util.stream.Collectors.joining;


// Create custom Exception
// Create Books Pojo here

class book {
    String[] bookName = { "Ulysses", "Don Quixote", "One Hundred Years of Solitude", "Hamlet",
            "In Search of Lost Time" };
    String[] authorName = { "James Joyce", "Miguel de Cervantes", "Gabriel Garcia Marquez", "William Shakespeare",
            "Marcel Prous" };
    String[] description = { "Ulysses by James Joyce", "Don Quixote by Miguel de Cervantes",
            "One Hundred Years of Solitude by Gabriel Garcia Marquez", "Hamlet by William Shakespeare",
            "In Search of Lost Time by Marcel Prous" };
    Integer[] bookId = { 0, 1, 2, 3, 4};

}

// Create User Pojo


class User {
    String[] userName = { "Adam Sandler", "Tom Hanks", "tom cruise", "Angelina Jolie", "Scarlett Johansson" };
    private String userId;
    private String emailId;
    private String password;
    Map<String, ArrayList<book>> booknames = new HashMap<String, ArrayList<book>>();
    Map<String, HashMap<String, String>> userData = new HashMap<String, HashMap<String, String>>();

    public void setdetails(String user) {
        HashMap<String, String> detail = new HashMap<String, String>();
        switch (user.toLowerCase()) {
            case "adam sandler":
                detail.put("New Books:", "Ulysses");
                detail.put("Favourite Books:", "Don Quixote,One Hundred Years of Solitude");
                detail.put("Completed Books:", "Hamlet");
                break;
            case "tom hanks":
                detail.put("New Books:", "One Hundred Years of Solitude");
                detail.put("Favourite Books:", "Ulysses,Hamlet");
                detail.put("Completed Books:", "In Search of Lost Time");
                break;
            case "tom cruise":
                detail.put("New Books:", "Don Quixote");
                detail.put("Favourite Books:", "One Hundred Years of Solitude");
                detail.put("Completed Books:", "Hamlet,In Search of Lost Time");
                break;
            case "angelina jolie":
                detail.put("New Books:", "Ulysses,In Search of Lost Time");
                detail.put("Favourite Books:", "Don Quixote");
                detail.put("Completed Books:", "Don Quixote,Hamlet");
                break;
            case "scarlett johansson":
                detail.put("New Books:", "In Search of Lost Time");
                detail.put("Favourite Books:", "Ulysses");
                detail.put("Completed Books:", "Hamlet");
                break;
        }

        userData.put(user, detail);

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}



class variables {
    public static String inputuser;
    public static String inputbook;
    public static String outputuser;
    public static Scanner sc = new Scanner(System.in);
    public static String conti="yes";
}




class MagicOfBooks {

    User user = new User();
    book Books = new book();

    // validate username
    public boolean checkUser() {
        int count = 0;

        for (String s : user.userName) {

            if (s.toLowerCase().equals(variables.inputuser.toLowerCase())) {
                variables.outputuser = variables.inputuser;
                count++;
            }

        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }

    }

    // User selection for operation
    public void opt() {
        try {
            System.out.println("************** MENU ***********");
            System.out.println("1. Print your books (new,favourite,completed)");
            System.out.println("2. Find book by bookId");
            System.out.println("0. Exit");
            System.out.println("Please enter your choice:");

            int opt = Integer.parseInt(variables.sc.nextLine());
            // If input is not 1-3
            opt++;
            while (opt > 3 | opt < 0) {
                System.out.println("Please enter your options between 1-3");
                System.out.println("Please enter your choice");
                opt = Integer.parseInt(variables.sc.nextLine());
            }
            switch (opt) {

                case 1:
                    info();
                    torun();
                    break;
                case 2:
                    findbookid();
                    torun();
                    break;
                case 0:
                    System.out.println("Thank You !");

                    break;


                default :
                    System.out.println("Invalid Option !");
                    torun();
                    System.out.println("Thank You !");
            }

        } catch (Exception e) {
            System.out.println("Wrong input!");
            System.exit(1);

        }
    }

    // Find if the book is in the list
    public void findbookid() {
        try {




            System.out.println("Book List");
            for(int k =0; k<5;k++)
            {
                System.out.println(Books.bookId[k]+" "+Books.bookName[k]);
            }




            int count = 0;
            System.out.println("Please enter the book id");
            int bookid = Integer.parseInt(variables.sc.nextLine());
            bookid++;
            // Searches for the book id in the collection
            for (int id : Books.bookId) {
                if (bookid == id) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Book Not Found!");
            } else {
                System.out.println("Book Name : "+Books.bookName[bookid-1]);
                System.out.println("Author Names : "+Books.authorName[bookid-1]);
                System.out.println("Description : "+Books.description[bookid-1]);
            }
        } catch (Exception e) {
            System.out.println("Wrong input!");
            System.exit(1);
        }

    }

    // prints users books
    public void info() {
        user.setdetails(variables.inputuser);
        // list new books, favourite books and completed books
        String[] newbook = user.userData.get(variables.inputuser).get("New Books:").split(",");
        String[] compbook = user.userData.get(variables.inputuser).get("Completed Books:").split(",");
        String[] favbook = user.userData.get(variables.inputuser).get("Favourite Books:").split(",");
        System.out.println("New Books:");
        for (String book : newbook)

        {
            System.out.println(book);
        }
        System.out.println("Favourite Books:");
        for (String book : favbook)

        {
            System.out.println(book);
        }
        System.out.println("Completed Books:");
        for (String book : compbook)

        {
            System.out.println(book);
        }

    }

    // Search for the book by book name
    public void findBook() {
        try {
            int i = 0;
            int count = 0;
            System.out.println("Enter book name: ");
            variables.inputbook = variables.sc.nextLine();
            // Search for the book name in the bookName collection
            for (String b : Books.bookName) {
                if (b.toLowerCase().equals(variables.inputbook.toLowerCase())) {
                    System.out.println("Author name: " + Books.authorName[i]);
                    System.out.println("Description: " + Books.description[i]);
                    count++;
                }
                i++;
            }
            if (count == 0) {
                System.out.println("Book not found!");
            }
        }
        // No input registered
        catch (Exception e) {
            System.out.println("Invalid Input!");
            System.exit(1);
        }

    }

    public void torun() {
        try {

            System.out.println("Do you want to continue?");
            variables.conti = variables.sc.nextLine();

            while (!variables.conti.toLowerCase().equals("yes") && !variables.conti.toLowerCase().equals("no")) {
                System.out.println("Do you wish to continue? (yes/no)");
                variables.conti = variables.sc.nextLine();
            }
            if (variables.conti.toLowerCase().equals("yes")) {
                Thread.currentThread().run();
            }
            else if(variables.conti.toLowerCase().equals("no")) {
                if(variables.inputuser.equalsIgnoreCase("adam sandler")) {
                    System.out.println("Thank You !");
                } else {
                    System.out.println("Thank You !");
                }
                System.exit(0);
            }
        }
        catch(Exception e)
        {
            System.out.println(" Invalid Input!");
        }

    }
}












class initialize implements Runnable {
    static MagicOfBooks magic = new MagicOfBooks();

    @Override
    public void run() {

        try {
            System.out.println("Please enter your username:");



            variables.inputuser = variables.sc.nextLine();

            boolean a = magic.checkUser();
            //if username is correct
            if (a) {
                System.out.println("Welcome " + variables.outputuser + "!");
                magic.opt();




            } else {
                System.out.println("User Name is invalid. Please Login again");
            }

        }
        //if input is not a string
        catch (Exception e) {
            System.out.println("Wrong input!");
            System.exit(1);
        }

    }

}

class Result {

    // Complete the 'Main' function below.

    public static void Main() {
        try {
            initialize init = new initialize(); // intialize object
            Thread thread = new Thread(init); //initialize the thread
            thread.start(); //start the thread

        } catch (Exception e) {
            System.out.println(e);
        }



    }

}

public class Solution {
    public static void main(String[] args) {

        Result.Main();

    }
}
