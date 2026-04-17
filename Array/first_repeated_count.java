package Array;

public class first_repeated_count {
    public static void main(String[] args) {
        
        int[] arr = { 5, 7, 5, 8, 3,3, 9};
        boolean found = false;

        System.out.println("Repeated elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                    found=true;
                    break;
            }
            
        }
        if (found) break; 
        }

        if (!found) {
            System.out.println("No repeated element found.");
        }
    }

    
    }