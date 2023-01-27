public class Mars{

    public static void main(String[] args) throws InterruptedException {

        String colonyName = "ZYX";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

        System.out.println("the colony name is: " + colonyName);
        System.out.println("the ship population is: " + shipPopulation);
        System.out.println("the number of meals is: " + meals);
        System.out.println("In the process of landing: " + landing);
        boolean landed = landingCheck(23);
        System.out.println("Landed: " + landed);

        new FindingsList();
        new GuessingGame();
        new MarsExpedition();
    }

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if(minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 2 == 0){
                System.out.println("Right");
            } else if (minute % 3 == 0){
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Landed");
        return false;
    }

}
