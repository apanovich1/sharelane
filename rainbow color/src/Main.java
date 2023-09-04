public class Main {
    public static void main(String[] args) {

        GetColor(1);
    }

    public static void GetColor(int color) {
        if(color == 1){
            System.out.println("red");
        }
        if(color == 2){
            System.out.println("orange");
        }
        if(color == 3){
            System.out.println("yellow");
        }
        if(color == 4){
            System.out.println("green");
        }
        if(color == 5){
            System.out.println("blue");
        }
        if(color == 6){
            System.out.println("indigo");
        }
        if(color == 7){
            System.out.println("violet");
        }
        else{System.out.println("this is not a rainbow color number, try again");
        }
    }
}
