package Learning;



public class Insurance {
    public static void main(String[] args) {
        Premium premium = new Premium()
        premium.calculate(10000, 5, 0);


    }
}

class Ins {
         double vehiclePrice;
         double driveExperience;
         double insurancePrice;
         double vehicleAge;
}

class Premium extends Ins {

    public void calculate(double vehiclePrice, double vehicleAge, double driveExperience) {
        insurancePrice = (vehiclePrice / vehicleAge) ;
        System.out.println("Your annual premium is: " +insurancePrice);
        if (driveExperience!=0){
            insurancePrice = insurancePrice - (driveExperience * 100);
            System.out.println("Your final premium after discounts is: " +insurancePrice);
        }

    }
}


