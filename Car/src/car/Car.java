package car;

public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeople = 6;
    
    //constructors
    
    public Car () {
        
    }
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }
    
    //getters and setters
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
}
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    public char getCondition() {
        return this.condition;
    }
    
    public String getNameOfCar() {
        return this.nameOfCar;
    }
    
    public double getMaxFuel() {
        return this.maxFuel;
    }
    
    public double getCurrentFuel() {
        return this.currentFuel;
    }
    
    public double getMPG() {
        return this.mpg;
    }
    
    public int getNumberOfPeopleInCar() {
        return this.numberOfPeopleInCar;
    }
    
    public int getMaxNumberOfPeople() {
        return this.maxNumberOfPeople;
    }
    
    
    
    //previous
    
    public void printVariables() {
        System.out.println("This is the max speed: " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
   
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() +10);
    }
    
    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeople) {
        numberOfPeopleInCar++;
        System.out.println("Someone got in.");
        } else {
            System.out.println("Car is full!");
        }
    }
    
    public void getOut() {
        //if there's people in the car
        if (this.numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in the car.");
        }
        System.out.println(numberOfPeopleInCar);
    } 
      
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
       
    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }
    
    public void turnTheCarOn() {
        //if the car isn't on...
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            //otherwise, print out the fact that its on
            System.out.println("The car is already on.");
        }
    }
    
    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
        
        
        
    }
    
}
