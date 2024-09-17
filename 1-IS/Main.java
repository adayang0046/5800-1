

public class Main {
    // Part 1: Read and store all the input data
    public static void main(String[] args) {
        SalariedEmployee se1 = new SalariedEmployee("Joe","Jones","111-11-1111",2500);
    
        SalariedEmployee se2 = new SalariedEmployee("Renwa","Chanel","555-55-5555",1700);
    
        HourlyEmployee he1 = new HourlyEmployee("Stephanie","Smith","222-22-2222",25,32);
    
        HourlyEmployee he2 = new HourlyEmployee("Mary","Quinn","333-33-3333",19,47);
   
        CommisionEmployee ce1 = new CommisionEmployee("Nicole","Dior","444-44-4444",15,50000);
        
        CommisionEmployee ce2 = new CommisionEmployee("Mahnaz","Vaziri","777-77-7777",22,40000);
    
        BaseEmployee be = new BaseEmployee("Mike","Davenport","666-66-6666", 95000);
   
        se1.printInfo();
        he1.printInfo();
        he2.printInfo();
        ce1.printInfo();
        se2.printInfo();
        be.printInfo();
        ce2.printInfo();


    }
   
}