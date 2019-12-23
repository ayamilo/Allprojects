package day11;

public class TargetOption {
    public static void main(String[] args) {
      /*  Create class called WarmUp1_LightOnOff
                Create a variable  targetOption as String and assign one of below options  for example bd
        You have 4 switches in your home to turn on
        Bd — bedroom
        Lr  — living room
        ki  — kitchen
        Ha— Hallway
        Use switch statement to write a program to print which room light is turned on
        For example if Bd was targetOption
        then print  you have turned on bedroom light*/


        String targetOption="Ha";
        switch (targetOption){
            case "bd":
                System.out.println("switch bed room light");
                break;
            case "Lr":
                System.out.println("switch the living room light");
                break;
            case "Ki":
                System.out.println("switch the kitchin light");
                break;
            case "Ha":
                System.out.println("switch the hall way light");
                break;
            default:
                System.out.println("wrong option");
                break;
        }
    }
}
