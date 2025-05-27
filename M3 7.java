public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting

        System.out.println("Double value: " + myDouble);
        System.out.println("Casted to int: " + myInt);

        int anotherInt = 42;
        double castedDouble = anotherInt; // Implicit casting

        System.out.println("Int value: " + anotherInt);
        System.out.println("Casted to double: " + castedDouble);
    }
}