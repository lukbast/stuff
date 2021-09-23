public class VipCustomer {

    private String name;
    private long creditLimit;
    public String email;


    public VipCustomer(){
        this.creditLimit=0;
        this.name="DefaultName";
        this.email="DefaulEmail@email.com";
        System.out.println(name+" "+creditLimit+" "+email);
    }

    public VipCustomer(String name,long creditLimit){
        this.creditLimit= creditLimit;
        this.name=name;
        this.email="DefaulEmail@email.com";
        System.out.println(name+" "+creditLimit+" "+email);

    }

    public VipCustomer(String name,long creditLimit, String email){
        this.creditLimit= creditLimit;
        this.name=name;
        this.email=email;
        System.out.println(name+" "+creditLimit+" "+email);
    }


}
