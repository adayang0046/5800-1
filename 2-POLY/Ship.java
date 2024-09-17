//Ship.java

 class Ship {
    String shipName, yearBuilt;

    public Ship(String shipName, String yearBuilt){
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getName() {return shipName;}
    public String getYear() {return yearBuilt;}
    
    public void setName(String shipName){
        this.shipName = shipName;
    }

    public void setYear(String shipYear){
        this.yearBuilt = shipYear;
    }

    public void printInfo(){
        System.out.println("Ship: " + shipName + ", Built in: " + yearBuilt);
        
    }

}

class CruiseShip extends Ship{
    int maxPassengers;

    public CruiseShip (String shipName, String yearBuilt, int maxPassengers){
        super(shipName, yearBuilt);
        this.maxPassengers = maxPassengers;

    }

    public int getMax() {return maxPassengers;}
    public void setMax (int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    @Override
    public void printInfo(){
        System.out.println("Cruise Ship: "+ getName()+", Max Pessagers: " + maxPassengers);

    }
}

class CargoShip extends Ship{
    int capacity;

    public CargoShip (String shipName, String yearBuilt, int capacity){
        super(shipName, yearBuilt);
        this.capacity = capacity;

    }

    public int getCpacity() {return capacity;}
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    @Override
    public void printInfo(){
        System.out.println("Cargo Ship: "+ getName()+", Cargo Capacity (in tons): " + capacity);

    }
}
