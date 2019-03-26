package love.programming;

public class Dog extends Animal {

    public Dog(){

    }


        //System.out.println("I am a Dog");
        @Override
        public void printInfo(){
            System.out.println(getAnimalName() + getNumlegs());

        }

}



