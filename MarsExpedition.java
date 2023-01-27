import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting...");
        Thread.sleep(1250);
        System.out.println("Booting up...");
        Thread.sleep(1250);
        System.out.println(".........");
        Thread.sleep(1250);
        System.out.println("...");
        Thread.sleep(1250);
        String ans = "";
        while (!ans.equals("yes")) {
            System.out.println("Ready? yes or no");
            ans = input.nextLine();
        }
        System.out.println("Ok. What's your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " - Welcome to the Expedition prep program. Are you ready to head out into the new world? Type yes or no." );
        String response = input.nextLine();
        if(response.equals("yes")){
            System.out.println("I knew it! such a leader.");
            Thread.sleep(1250);
        } else {
            System.out.println("Too bad, you are the team leader and you must go!");
            Thread.sleep(1250);
        }
        System.out.println("How many people do you want on your team?");
        int team = input.nextInt();
        if(team > 2){
            System.out.println("Too many extra people. you can only bring 2 more people!");
            team = 2;
            Thread.sleep(1250);
            System.out.println("TEAM SIZE SET TO 2");
            Thread.sleep(1250);
            Thread.sleep(1250);
        }
        if(team < 2){
            System.out.println("Come on, you need to bring 2 people with you.");
            team = 2;
            Thread.sleep(1250);
            System.out.println("TEAM SIZE SET TO 2");
            Thread.sleep(1250);
            Thread.sleep(1250);

        }
        if(team == 2){
            System.out.println("Perfect!");
            Thread.sleep(1250);

        }
        System.out.println("Bring a snack, let us know what it is though.");
        input.nextLine();
        String snack = input.nextLine();
        Thread.sleep(1250);

        System.out.println("You've chosen to bring some " + snack + "s with you");
        Thread.sleep(1250);

        System.out.println("Now please choose a whip. Your options are." + "\nA: Mazaratti" + "\nB: Lambo" + "\nC: Charizard");
        String vehicle = input.next();

        if(vehicle.equalsIgnoreCase("A")){
            vehicle ="a Mazaratti";
        } else if(vehicle.equalsIgnoreCase("b")){
            vehicle ="a Lamborghini";
        } else if(vehicle.equalsIgnoreCase("C")){
            vehicle ="a Charizard";
        } else {
            vehicle = "your feet";
        }
        Thread.sleep(1250);

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + team + " teammates." +
                "\nTo explore the surface of Mars using " + vehicle + " and you brought some " + snack + "s with you." +
                "\nExploration team heads out in");
        Thread.sleep(1250);


        System.out.println("5....");
        Thread.sleep(1250);
        System.out.println("4....");
        Thread.sleep(1250);
        System.out.println("3....");
        Thread.sleep(1250);
        System.out.println("2....");
        Thread.sleep(1250);
        System.out.println("1....");
        Thread.sleep(1250);
        System.out.println("GO GO GO!");

    }
}
