package stringbufferprograms.comparestringbufferandstringbuilerwithconcatenation;

public class CompareStringUsingStringBuliderAndBuffer {
    public static void main(String[] args) {
        int iterations = 1000000;
        String str = " world";

        // Measure the performance of StringBuilder
        long stringBuilderTime = measurePerformanceUsingStringBuilder(iterations, str);
        System.out.println("StringBuilder Time Taken: " + stringBuilderTime + " ns");

        // Measure the performance of StringBuffer
        long stringBufferTime = measurePerformanceUsingStringBuffer(iterations, str);
        System.out.println("StringBuffer Time Taken: " + stringBufferTime + " ns");
    }

    // Function to measure performance using StringBuilder
    public static long measurePerformanceUsingStringBuilder(int iterations, String str) {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < iterations; i++) {
            sb.append(str);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Function to measure performance using StringBuffer
    public static long measurePerformanceUsingStringBuffer(int iterations, String str) {
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer("hello");
        for (int i = 0; i < iterations; i++) {
            sbf.append(str);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
