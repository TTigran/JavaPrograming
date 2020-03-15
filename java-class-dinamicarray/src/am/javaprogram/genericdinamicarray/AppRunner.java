package am.javaprogram.genericdinamicarray;

public class AppRunner {
    public static void main(String[] args) {
        GenericDynamicArray<String> genericDynamicArray =
                new GenericDynamicArray<String>("Tigran", "Sevak");
        genericDynamicArray.add("Vazgen");
        genericDynamicArray.add("Davit");
        genericDynamicArray.removeByElement("Tigran");
        genericDynamicArray.printArray();
    }
}
