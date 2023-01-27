import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back, here's what you found.");
        ArrayList<String> rockList = new ArrayList<>();
        System.out.println("Rock data downloaded.");

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);

        System.out.println("Wait a second that last one is no rock, we need to delete that one from the list.");

        rockList.remove("not rock");

        System.out.println(rockList);

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("data downloaded");
        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)? \nBird, Fish, Tooth, ");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine() + " Fossil";

        if (fossilChoice.equalsIgnoreCase("Bird Fossil") || fossilChoice.equalsIgnoreCase("Fish Fossil") || fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun gun");
        supplies.add("Insta-Heal Capsules");


        System.out.println("SUPPLIES AFTER EXPEDITION");
        Iterator itr = supplies.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}