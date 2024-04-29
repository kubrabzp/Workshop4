package OOPPolymorfizm;

public class Cat extends Animal{

    @Override
    public void sound(){
        System.out.println("Köpekler hav hav diye ses çıkarır");
    }

    @Override
    public void numberOfFeet(){
        System.out.println("Köpekler 4 ayaklıdır");
    }
}
