public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setMark(" Mark-3");
        System.out.println("mark = " + jaegerOne.getMark());

        jaegerOne.setYearOfIssue(2017);
        System.out.println("yearOfIssue" +  jaegerOne.getMark() + "  = " + jaegerOne.getYearOfIssue());

        jaegerOne.setStatus("Destroyed");
        System.out.println("status" +  jaegerOne.getMark() + " = " + jaegerOne.getStatus());

        jaegerOne.setOriginal("United States of America");
        System.out.println("original" +  jaegerOne.getMark() + " = " + jaegerOne.getOriginal());

        jaegerOne.setHeight(260);
        System.out.println("height" +  jaegerOne.getMark() + " = " + jaegerOne.getHeight());

        jaegerOne.setWeight(1.98);
        System.out.println("weight" +  jaegerOne.getMark() + " = " + jaegerOne.getWeight());

        jaegerOne.setSpeed(7);
        System.out.println("spead" +  jaegerOne.getMark() + " = " + jaegerOne.getSpeed());

        jaegerOne.setStrength(8);
        System.out.println("strength" +  jaegerOne.getMark() + " = " + jaegerOne.getStrength());

        System.out.println("You use chain swords " + jaegerOne.useChainSwords());
        System.out.println("You filled in the coolant  " + jaegerOne.pourCoolant());

        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setMark(" Mark-5");
        System.out.println("mark = " + jaegerTwo.getMark());

        jaegerTwo.setYearOfIssue(2019);
        System.out.println("yearOfIssue" +  jaegerTwo.getMark() + "  = " + jaegerTwo.getYearOfIssue());

        jaegerTwo.setStatus("Destroyed");
        System.out.println("status" +  jaegerTwo.getMark() + " = " + jaegerTwo.getStatus());

        jaegerTwo.setOriginal("Australia");
        System.out.println("original" +  jaegerTwo.getMark() + " = " + jaegerTwo.getOriginal());

        jaegerTwo.setHeight(250);
        System.out.println("height" +  jaegerTwo.getMark() + " = " + jaegerTwo.getHeight());

        jaegerTwo.setWeight(1.85);
        System.out.println("weight" +  jaegerTwo.getMark() + " = " + jaegerTwo.getWeight());

        jaegerTwo.setSpeed(10);
        System.out.println("spead" +  jaegerTwo.getMark() + " = " + jaegerTwo.getSpeed());

        jaegerTwo.setStrength(10);
        System.out.println("strength" +  jaegerTwo.getMark() + " = " + jaegerTwo.getStrength());

        System.out.println("You use chain swords " + jaegerTwo.useChainSwords());
        System.out.println("You filled in the coolant  " + jaegerTwo.pourCoolant());


    }
}
