package fintech.driver;

import fintech.model.Account;
import java.util.Scanner;
import fintech.model.Transaction;

/**
 * @author 12S23030-SimorangkirJonathan
 * @author 12S23046-Anastasya T.B Siahaan
 */
public class Driver1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] account = new Account[100];
        Transaction[] transactions = new Transaction[100];
        int AccountCount = 0;
        int TransactionCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
        }
        String[] parts = input.split("#");
        if (parts.length > 0) {
            String command = parts[0];
            switch (command) {
                case "create-account":
                    if (parts.length == 4) {
                        String owner = parts[1];
                        String accountname = parts[2];
                        double balance = parts[3];
                        account[AccountCount++] = new account(owner, accountname, balance);
                    }
                    break;
                case "create-transaction":
                    if (parts.length == 6) {
                        String transactionid = parts[1];
                        String accountname = parts[2];
                        double amount = parts[3];
                        String postedat = parts[4];
                        String type = parts[5];
                        transactions[TransactionCount++] = new transaction(transactionid, accountname, amount, postedat,type);
                    }
                    break;
                case "show-account":
                    if(parts.length == 2) {
                        String accountname = parts [1];
                    }

            for (int i = 0; i < TransactionCount; i++) {
                System.out.println(transactions[i].toString());
            }
                

            }
        }

        for (int i = 0; i < AccountCount; i++) {
            System.out.println(accounts[i].toString());

            for (int j= 0; j < TransactionCount; i++) {
                System.out.println(transactions[i].toString());
            }
        }
   }
}