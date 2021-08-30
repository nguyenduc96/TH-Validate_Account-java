public class AccountExampleTest {
    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        String[] validAccounts = {"nguyenduc", "duc1996", "duc_30_09_96", "30091996"};
        String[] invalidAccounts = {"duc12", "duc@123", "-_-T_T"};
        for (String account: validAccounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is "  + account + " is valid : " + isValid);
        }
        for (String account: invalidAccounts) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account is "  + account + " is valid : " + isValid);
        }
    }
}
