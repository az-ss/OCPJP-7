package section.one.two.exercisetwo;

/**
 * Displayed the values of variables NumberHolder class
 */

public class Display {
    public static void main(String[] args) {
        NumberHolder aNumberHolder = new NumberHolder();
        aNumberHolder.setAnInt(1);
        aNumberHolder.setaFloat(2.3f);
        System.out.println(aNumberHolder.getAnInt());
        System.out.println(aNumberHolder.getaFloat());
    }
}
