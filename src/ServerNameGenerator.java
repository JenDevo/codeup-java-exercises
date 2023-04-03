import java.util.Random;

public class ServerNameGenerator {

    public static String randomName(String[] arr){
        Random randomWord = new Random();
        int wordIndex = randomWord.nextInt(arr.length);
        return arr[wordIndex];
    }

    public static void main(String[] arr){
        String[] adjectives = {"busy", "cautious", "adventurous", "calm", "hilarious", "grotesque", "helpful", "kind", "precious", "wild"};
        String[] nouns = {"law", "nature", "idea", "temperature", "power", "language", "security", "movie", "organization", "teacher"};


        String randomAdjective = randomName(adjectives);
        String randomNoun = randomName(nouns);

        System.out.println("Here is your server name: ");
        System.out.printf("%s %s", randomAdjective, randomNoun);
    }

}
