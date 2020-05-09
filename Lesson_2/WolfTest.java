public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Female");
        System.out.println("gender = " + wolfOne.getGender());

        wolfOne.setNickname("Bon");
        System.out.println("nickname = " + wolfOne.getNickname());

        wolfOne.setWeight(20);
        System.out.println("waight = " + wolfOne.getWeight());

        wolfOne.setAge(2);
        System.out.println("age = " + wolfOne.getAge());

        wolfOne.setColor("white");
        System.out.println("color = " + wolfOne.getColor());

        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}
