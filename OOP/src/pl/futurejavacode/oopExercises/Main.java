package pl.futurejavacode.oopExercises;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.add(2.0f, 3.0f));
        System.out.println(Calculator.add(2.0,9.0));
        System.out.println(Calculator.add(23l,35l));

        System.out.println(StringConcatenator.concatenate("Ala","Ma"));
        System.out.println(StringConcatenator.concatenate("Ala","Ma","Kota"));
        System.out.println(StringConcatenator.concatenate(5,"Ala"));
        System.out.println(StringConcatenator.concatenate("Ala","Ma","Kota","Psa","Kanarka","Krokodyla","Itd"));
        System.out.println(StringConcatenator.concatenate(new String[]{"Ala","Ma","Kota","Psa","Kanarka","Rybki","Niez³y","Cyrk"}));
    }
}
