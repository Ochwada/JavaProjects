

public class Rider {
    private String name;
    private String riderId;
    private String location;

    private static int riderCount = 0;

    private Rider(String name, String location){
        this.name = name;
        this.location = location;
        this.riderId = generateRiderId(); riderCount++;
    }
    public static Rider create(String name, String location){
        return new Rider(name, location);
    }

   private static String generateRiderId() {
       return "RID" + (1000 + riderCount);
   }

   public static int getRiderCount() {
        return riderCount;
   }
    @Override
public String toString() {
        return "Rider :" + name + " (" + riderId + "), Location: " + location;
    }
}
