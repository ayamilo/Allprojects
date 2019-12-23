package day012;

public class CarShopping {
    public static void main(String[] args) {
        // buy corolla or tesla (only if it is within the budget)
        // there is only one car covered with cloth
        // we don't know what car is it and what is the price
        // we check whether its toyota ,if it is we buy it without checking the price
        // if it is not we check it is tesla and also check whether it is within the budget
        String carBrand = "tesla";
        int carPrice = 5000;
        int budget = 70000;
        if (carBrand.equals("corolla") || (carBrand.equals("tesla") && carPrice<=budget)){
            System.out.println("CAR ACQUIRED !!!!");

        }else{
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }
        //altenatively:
        if (carBrand.equals("corolla")){
            System.out.println("corolla car Cquired!!");

        }else if (carBrand.equals("tesla")&& carPrice<=budget){
            System.out.println("tesla car acquired");

        }else{
            System.out.println("not what i am looking for");
        }
    }
}
