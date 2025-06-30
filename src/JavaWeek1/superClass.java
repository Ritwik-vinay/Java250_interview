package JavaWeek1;

public class superClass {
    public static class Bank{
        int Amount;
        String Branch;
        public int getAmount() {
            return Amount;
        }

        public void setAmount(int amount) {
            Amount = amount;
        }

        public String getBranch() {
            return Branch;
        }

        public void setBranch(String branch) {
            Branch = branch;
        }
        public void baseBranch(){
            String ZonalManager ="Ritwik Vinay";
            System.out.println("Zonal Manager "+ZonalManager);
        }


    }
    public static class SBI extends Bank{
        @Override
        public int getAmount() {
            return super.getAmount();
        }

        @Override
        public void setAmount(int amount) {
            super.setAmount(amount);
        }
        public void baseBranch(){
            String ZonalHead ="Lucky RV";
            System.out.println(ZonalHead);
        }

        @Override
        public String getBranch() {
            return super.getBranch();
        }

        @Override
        public void setBranch(String branch) {
            super.setBranch(branch);
        }
    }
    public static class ICICI extends Bank{
        public void baseBranch(){
            super.baseBranch();
        }

        @Override
        public int getAmount() {
            return super.getAmount();
        }

        @Override
        public void setAmount(int amount) {
            super.setAmount(amount);
        }

        @Override
        public String getBranch() {
            return super.getBranch();
        }

        @Override
        public void setBranch(String branch) {
            super.setBranch(branch);
        }
    }

    public static void main(String[] args) {
        Bank bank= new Bank();
        bank.setAmount(12000000);
        System.out.println(bank.getAmount());
        bank.setBranch("Kolkata");
        System.out.println(bank.getBranch());
        bank.baseBranch();
        SBI sbi = new SBI();
        sbi.setAmount(120000000);
        sbi.setBranch("Kolkata Dakhindari");
        System.out.println(sbi.getAmount());
        System.out.println(sbi.getBranch());
        sbi.baseBranch();
        ICICI icici = new ICICI();
        icici.setAmount(1500000000);
        icici.setBranch("Maniktala Kolata");
        System.out.println(icici.getAmount());
        System.out.println(icici.getBranch());
        icici.baseBranch();

    }
}
