public class BankOffice {

    private String bankName;
    private String bankAddress;


    public BankOffice(String bankName, String bankAddress) {

        this.bankName = bankName;
        this.bankAddress = bankAddress;

    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }
}
