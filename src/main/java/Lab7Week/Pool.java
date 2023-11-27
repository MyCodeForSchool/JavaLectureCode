package Lab7Week;

public class Pool {
    private String name; //field or variable; instance variables
    private double length; //another field
    private String address;
    private double maxDepth;

    public Pool(String poolName, double poolLength) {
        name = poolName;
        length = poolLength;
    }
    //instance method (Instance is another word for object)
    //a Pool object is an instance of the Pool class
    public double distanceForLaps (int laps) {
        //10 laps of pool of length 50
        double total = laps * length;
        return total;
    }

@Override
    public String toString() {
        String desc = name + " pool is " + length + " meters long.";
        return desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000) {
            return;
        }
        this.length = length;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        this.maxDepth = maxDepth;
    }
}
