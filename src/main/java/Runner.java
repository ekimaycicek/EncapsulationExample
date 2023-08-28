public class Runner {

    public static void main(String[] args) {

        Vehicle vehicle1=new Vehicle("volvo xc60","gri",-200,2012);
        Vehicle vehicle2=new Vehicle("ford focus","lacivert",2000,-2015);
        Vehicle vehicle3=new Vehicle();

        vehicle3.setModel("connect");
        vehicle3.setEngine(1800);
        vehicle3.setYear(2008);
        vehicle3.getColour("karamel");


        System.out.println("vehicle1 = " + vehicle1);
        System.out.println("vehicle2 = " + vehicle2);
        System.out.println("vehicle3 = " + vehicle3);



    }
}
