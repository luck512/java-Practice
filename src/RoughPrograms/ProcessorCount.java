package RoughPrograms;

public class ProcessorCount {
    public static void main(String[] args) {
        // Get the number of available processors
        int processors = Runtime.getRuntime().availableProcessors();

        System.out.println("Number of available processors: " + processors);
    }
}
