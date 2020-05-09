public class Wolf {

    private String gender = "male";
    private String nickname = "Wolfhound";
    private int weight = 45;
    private int age = 3;
    private String color = "black";

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age ");
        } else {
            this.age = age;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void walk() {
        System.out.println("You walked 10 steps ");
    }
    public boolean sit() {
        System.out.println("You sat down ");
        return true;
    }
    public void run() {
        System.out.println("You ran kilometer ");
    }
    public String howl() {
        return "howl";
    }
    public String hunt() {
        return "hunt";
    }

}
