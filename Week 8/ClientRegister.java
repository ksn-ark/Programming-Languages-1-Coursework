public class ClientRegister {
    public static void main(String args[]) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4"); 
           
        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);
        
        System.out.println(client2);
        System.out.println(client3);

        System.out.println(client4.returnName());
    }
}

class Client {
    String clientName;
    String clientID;
    String clientAddress;

    public Client(String name, String id, String address) {
        this.clientName=name;
        this.clientID=id;
        this.clientAddress=address;
    }

    public Client(String name, String id) {
        this.clientName=name;
        this.clientID=id;
    }

    public String returnName() {
        return clientName;
    }

    public String returnID() {
        return clientID;
    }
}

class CashClient extends Client {
    public CashClient(String name, String id) {
        super(name, id);
    }

    public void payCash(int sum) {
        String name = returnName();
        String id = returnID();
        System.out.println(name+"("+id+"): Amount paid " + sum + " euros.");
    } 
}

class AccountClient extends Client {
    float balance;

    public AccountClient(String name, String id) {
        super(name, id);
        this.balance=0;
    }

    public AccountClient(String name, String id, String address) {
        super(name, id, address);
        this.balance=0;
    }

    public void deposit(int amount) {
        balance+=amount;
    }

    public void withdraw(int amount) {
        balance-=amount;
    }

    public String toString() {
        String name = returnName();
        String id = returnID();
        String output = name+"("+id+"): "+ balance;
        return output;
    }
}