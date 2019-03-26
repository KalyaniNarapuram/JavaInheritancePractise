package love.programming;

public class MyMainMethod {
    public static void main(String[] args) {
        Husky myanimal = new Husky();
        GermanShepherd myanimal2 = new GermanShepherd();
        Dog myanima3 = new Dog();
        Animal myanimal1 = new Animal();

        //myanimal1.printInfo();
        myanima3.printInfo();

        myanimal1.setAnimalName("Elephant");
        myanimal1.setNumlegs(4);

        System.out.println(myanimal1.getAnimalName());
        System.out.println(myanimal1.getNumlegs());
        System.out.println(myanimal1.getNumberOfEyes());
    }
}