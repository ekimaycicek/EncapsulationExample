public class Vehicle {

    /*
   1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- ArabaMain isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
    */
    private String model;
    private String colour;
    private int engine;

    private int year;

    public Vehicle() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour(String karamel) {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        if (engine <1000){
            this.engine = 1001;
        }else  this.engine = engine;

    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine=" + engine +
                ", year=" + year +
                '}';
    }

    public void setYear(int year) {
        if (year < 0) {
            this.year = (-1)*year;
        }else  this.year = year;

    }

    public Vehicle(String model, String colour, int engine, int year) {
        this.model = model;
        this.colour = colour;
        setEngine(engine);
        setYear(year);
    }
}


