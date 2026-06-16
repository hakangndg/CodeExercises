public class MethodOverride {


    public static String getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("please enter valid duration");
            return null;
        }
        int hours = seconds / 3600;
        int remaining_seconds = seconds % 3600;
        int minutes = remaining_seconds / 60;
        int secondsLeft = remaining_seconds % 60;

        

        return hours+ " HH " + minutes + " MM " + secondsLeft + " SS"; 
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 ){
            System.out.println("minutes or seconds can not be less than 0");
            return null;
        }
        int total_seconds = (60 * minutes) + seconds;
        return getDurationString(total_seconds);
    }

    public static void main(String[] args) throws Exception {

        System.out.println(getDurationString( 3945));
        
    }
}
