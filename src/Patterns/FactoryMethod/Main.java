package Patterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
            DeveloperFactory javaDeveloperFactory = new JavaDeveloperFactory();
            DeveloperFactory phpDeveloperFactory = new PhpDeveloperFactory();

            javaDeveloperFactory.createDeveloper().writeCode();
            phpDeveloperFactory.createDeveloper().writeCode();
    }
}
