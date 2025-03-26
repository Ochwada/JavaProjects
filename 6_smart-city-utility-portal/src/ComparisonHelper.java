public class ComparisonHelper {

    public static boolean isHigherUsage(int user1Units, int user2Units) {
        // Use relational and logical operators to compare usage
        return (user1Units > user2Units) || (user1Units == user2Units) && user1Units > 100;
    }


}
