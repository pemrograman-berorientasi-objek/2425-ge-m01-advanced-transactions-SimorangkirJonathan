package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Transaction {

    private String transactionid;
    private String accountname;
    private double amount;
    private String type;
    private String postedat;


    public Transaction (String transactionid, String accountname, double amount, String type, String postedat){
        this.transactionid=transactionid;
        this.accountname=accountname;
        this.amount = amount;
        this.postedat = postedat;
        this.type = type;


    }

    public String getTransactionid() {
        return transactionid;
    
    }

    public String getAccountname(){ 
        return accountname;
    }

    public double getAmount(){
        return amount;
    }

    public String getPostedat(){

        return postedat;
}
    public String getType (){
        return type;
    }

    @Override
    public String toString() {
        return this.transactionid + "|" + this.accountname + "|" + this.amount + "|" + this.postedat + "|" + this.type;}
    }
    

