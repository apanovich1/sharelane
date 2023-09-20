public class Main {
    public static void main(String[] args) {

        GetSeason(10);
    }

    public static void GetSeason(int month) {

        int monthIndex = month - 1;
        if(monthIndex == 0||monthIndex == 1||monthIndex == 12){
            System.out.println("winter");
        }
        if(monthIndex == 2||monthIndex == 3||monthIndex == 4){
            System.out.println("spring");
        }
        if(monthIndex == 5||monthIndex == 6||monthIndex == 7){
            System.out.println("summer");
        }
        if(monthIndex == 8||monthIndex == 9||monthIndex == 10){
            System.out.println("autumn");
        }
        else{System.out.println("this is not a month, try again");}
    }
}