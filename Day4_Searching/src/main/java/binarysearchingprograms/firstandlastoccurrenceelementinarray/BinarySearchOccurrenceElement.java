package binarysearchingprograms.firstandlastoccurrenceelementinarray;

public class BinarySearchOccurrenceElement {

        // Function to find the first occurrence of the target
        public static int findFirstOccurrence(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            int firstIndex = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    firstIndex = mid; // Target found, but continue to search left for the first occurrence
                    right = mid - 1;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return firstIndex;
        }

        // Function to find the last occurrence of the target
        public static int findLastOccurrence(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;
            int lastIndex = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    lastIndex = mid; // Target found, but continue to search right for the last occurrence
                    left = mid + 1;
                } else if (arr[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return lastIndex;
        }

        // Function to find both first and last occurrences of the target
        public static int[] findFirstAndLast(int[] arr, int target) {
            int[] result = {-1, -1};

            // Find the first occurrence
            result[0] = findFirstOccurrence(arr, target);

            // If first occurrence is found, find the last occurrence
            if (result[0] != -1) {
                result[1] = findLastOccurrence(arr, target);
            }

            return result;
        }

        public static void main(String[] args) {
            // Example sorted array
            int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 6};
            int target = 2;

            // Get the first and last occurrence of the target
            int[] occurrences = findFirstAndLast(arr, target);

            if (occurrences[0] == -1) {
                System.out.println("Target " + target + " not found in the array.");
            } else {
                System.out.println("First occurrence of target " + target + " is at index: " + occurrences[0]);
                System.out.println("Last occurrence of target " + target + " is at index: " + occurrences[1]);
            }
        }

}
