
//Main.java

public class Main {
    public static void main(String[] args){
        Ship[] shipList = new Ship [3];
        shipList[0]= new Ship("Unnamed little ship","1991");
        shipList[1]= new CruiseShip("Small cruise ship","1845",200);
        shipList[2] =  new CargoShip ("Huge cargo ship","2000",3000000);

        for(Ship i: shipList){
            i.printInfo();
        }


    }
}
