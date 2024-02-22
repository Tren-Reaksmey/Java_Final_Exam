public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Reaksmey", "Gold");
        Sale sale = new Sale(customer, "22-02-2024");
        sale.setServiceExpense(100.0);
        sale.setProductExpense(100.0);
        sale.DisplayInfo();
    }
}