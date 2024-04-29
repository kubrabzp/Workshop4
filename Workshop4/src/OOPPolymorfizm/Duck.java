package OOPPolymorfizm;

public class Duck extends Animal{

    @Override
    public void sound(){
        System.out.println("Ördekler vak vak diye ses çıkarır");
    }

    @Override
    public void numberOfFeet(){
        System.out.println("Ördekler 2 ayaklıdır");
    }
}
