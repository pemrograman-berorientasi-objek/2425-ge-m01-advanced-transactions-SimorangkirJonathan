package fintech.model;

/**
 * @author 12S23030-Simorangkir Jonathan
 * @author 12S23046-Anastasya T.B Siahaan
 */
public class Account {
    private String owner;
    private String accountname;
    private double balance;

        public Account(String _owner, String _accountname) {
            this.owner = _owner;
            this.accountname = _accountname;
            this.balance = 0.0;
        }

        public String getowner() {
            return owner;

        }
        public String getaccountname() {
            return accountname;
        
        }

        public double getbalance (){
            return balance;
        }


        @Override
        public String toString(){
            return this.accountname + "|" + this.owner + "|" +   this.balance;      }

}