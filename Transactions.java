
public class Transactions {
	
	private int txnId;
	private int txnDate;
	private boolean isDebitOrCredit;
	private double amtInvolved;
	private String txnSummary;
	private String accountType;

	public Transactions() {
		super();
	}

	
	
	public int getTxnId() {
		return txnId;
	}



	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}



	public int getTxnDate() {
		return txnDate;
	}



	public void setTxnDate(int txnDate) {
		this.txnDate = txnDate;
	}



	public boolean isDebitOrCredit() {
		return isDebitOrCredit;
	}



	public void setDebitOrCredit(boolean isDebitOrCredit) {
		this.isDebitOrCredit = isDebitOrCredit;
	}



	public double getAmtInvolved() {
		return amtInvolved;
	}



	public void setAmtInvolved(double amtInvolved) {
		this.amtInvolved = amtInvolved;
	}



	public String getTxnSummary() {
		return txnSummary;
	}



	public void setTxnSummary(String txnSummary) {
		this.txnSummary = txnSummary;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public static void main(String[] args) {
		

	}

}
