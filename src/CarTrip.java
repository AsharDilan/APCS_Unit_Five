public class CarTrip
{
    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip()
    {
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0.0; 
        myGallonsUsed = 0.0;
    }
    public CarTrip(int myStartOdometer, int myEndOdometer, double myTime, double myGallonsUsed){
        this.myStartOdometer = myStartOdometer;
        this.myEndOdometer = myEndOdometer;
        this.myTime = myTime;
        this.myGallonsUsed = myGallonsUsed;
    }

    public int getMyEndOdometer() {
        return myEndOdometer;
    }

    public int getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyStartOdometer(int myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public int getTripDistance()
    {
        return myEndOdometer-myStartOdometer;
    }
    public double getAverageSpeed()
    {
        return getTripDistance()/myTime;
    }
    public double getGasMileage()
    {
        return getTripDistance()/myGallonsUsed;
    }
    public double getTotalGasPrice(double pricePerGallon)
    {
        return myGallonsUsed*pricePerGallon;
    }
    public String toString()
    {
        return "Distance Traveled:" + getTripDistance() + "miles";
    }
    public static void main(String[] args)
    {
        CarTrip trip = new CarTrip();
        System.out.println(trip.myStartOdometer);
        System.out.println(trip.myEndOdometer);
        System.out.println(trip.myTime);
        System.out.println(trip.myGallonsUsed);
    }
}
