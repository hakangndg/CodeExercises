package SmallScaled;
public class NumberOfDaysInMonth {

    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        int reversed = 0;
        int temp = number; 
        
        while(temp > 0){
            reversed *= 10;
            reversed += temp % 10;
            temp /= 10;
        }  
        if(number == reversed){
            return true;
        }
        return false;
    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    
    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12  || year < 1 || year > 9999){
            return -1;
        }
        if(isLeapYear(year)){
            if(month == 2){
                return 29;
            }
        }
        return switch(month){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> 28;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }

    public static void main(String args[]){
        System.out.println(isPalindrome(11));
    }
}