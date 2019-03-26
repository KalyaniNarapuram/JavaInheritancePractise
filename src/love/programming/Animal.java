package love.programming;

public class Animal implements JavaAnimalInterface{

    String animalName;
    int numlegs;


    public int getNumberOfEyes() {
        return NUMBER_OF_EYES;
    }

    public void setAnimalName(String animalName)
    {
        this.animalName = animalName;
    }

    public void setNumlegs(int numlegs)
    {
        this.numlegs = numlegs;
    }

    public String getAnimalName()
    {
        return animalName;
    }

    public int getNumlegs() {
        return numlegs;
    }

    public void printInfo(){

    }
    /*public Animal(){
        System.out.println("I am animal");
    }*/




    }

