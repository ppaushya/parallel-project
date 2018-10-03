import java.time.LocalDate;

public class Transactions {
	
	private int txnId;
	private LocalDate txnDate;
	private boolean isDebitOrCredit;
	private double amtInvolved;
	private String txnSummary;
	private String accountType;
	private Account account;




	public Transactions() {
		super();
	}

	
	public Transactions(int txnId, LocalDate txnDate, boolean isDebitOrCredit, double amtInvolved, String txnSummary,
			String accountType, Account account) {
		super();
		this.txnId = txnId;
		this.txnDate = txnDate;
		this.isDebitOrCredit = isDebitOrCredit;
		this.amtInvolved = amtInvolved;
		this.txnSummary = txnSummary;
		this.accountType = accountType;
		this.account = account;
	}


	@Override
	public String toString() {
		return "Transactions [txnId=" + txnId + ", txnDate=" + txnDate + ", isDebitOrCredit=" + isDebitOrCredit
				+ ", amtInvolved=" + amtInvolved + ", txnSummary=" + txnSummary + ", accountType=" + accountType
				+ ", account=" + account + "]";
	}



	public int getTxnId() {
		return txnId;
	}



	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}



	public LocalDate getTxnDate() {
		return txnDate;
	}



	public void setTxnDate(LocalDate txnDate) {
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
	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}







	public static void main(String[] args) {
		

	}

}
