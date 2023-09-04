public class Main {
    public static void main(String[] args) {
        System.out.println(GetSeason(10));
    }

    public static String GetSeason(int month) {
        String season;

        String[] months = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "October",
                "November", "December"};

        int monthIndex = month - 1;

        switch (monthIndex) {
            case 0:
            case 1:
            case 12:
                season ="winter";
                break;
            case 2:
            case 3:
            case 4:
                season ="spring";
                break;
            case 5:
            case 6:
            case 7:
                season ="summer";
                break;
            case 8:
            case 9:
            case 10:
                season ="autumn";
                break;
            default:
                season ="It's not a month number, try again";
        }
        return season;
    }
}