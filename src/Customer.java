import java.util.Objects;

public class Customer implements DiscountRate{
    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType){
        this.customerName = customerName;
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
      /*  switch (customerType){
            case "Premium":
                return 0.20;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.10;
            default:
                return 0;
        }*/
        if (customerType.equalsIgnoreCase("Premium")) {
            return 0.20;
        } else if (customerType.equalsIgnoreCase("Gold")) {
            return 0.15;
        }else if(customerType.equalsIgnoreCase("Silver"))
        {
            return 0.10;
        }
        else
            return 0;
    }

    @Override
    public double getProductMemberDiscount() {
     /*   switch (customerType){
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.10;
            default:
                return 0;
        }*/
        if(customerType.equalsIgnoreCase("Premium" ) || customerType.equalsIgnoreCase("Gold")||
                customerType.equalsIgnoreCase("Silver")){
            return 0.10;
        }else return 0;
    }
}

