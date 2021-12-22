import java.util.*;

class TSA {
    static int totalComparison = 0;
    static int ternarySearch(int s, int e, int key, int ar[]) {
        if (e >= s) {
            totalComparison++;
            
            int mid1 = s + (e - s) / 3;
            int mid2 = e - (e - s) / 3;
            
            if (ar[mid1] == key) {
                totalComparison++;
                System.out.println("Total Comparison by TSA: " + totalComparison);
                return mid1;
            }
            if (ar[mid2] == key) {
                totalComparison++;
                System.out.println("Total Comparison by TSA: " + totalComparison);
                return mid2;
            }
           
            if (key < ar[mid1]) {
                totalComparison++;
               
                return ternarySearch(s, mid1 - 1, key, ar);
            } else if (key > ar[mid2]) {
                totalComparison++;
               
                return ternarySearch(mid2 + 1, e, key, ar);
            } else {
                
                return ternarySearch(mid1 + 1, mid2 - 1, key, ar);
            }
        }
        
        System.out.println("Total Comparison by TSA: " + totalComparison);
        return -1;

    }
    static int[] listGenetor(int n) {
        int[] arr = new int[n];
        System.out.printf("\n\n");
        for (int i = 0; i < n; i++) {
            arr[i] = ((i+i+1)*12)/3;
            System.out.printf(arr[i]+" ");
        }
        System.out.printf("\n\n");
        return arr;
    }

    public static void main(String args[])
    {
        int s, e, p, key;
        Scanner input= new Scanner(System.in);
        System.out.printf("Enter the length of array you want to generate: ");
        s = 0;
        int inp = input.nextInt();
        e = inp -1;
        int[] ar = listGenetor(inp);
        System.out.printf("Enter the number you want to search: ");
        key = input.nextInt();
        p = ternarySearch(s, e, key, ar);
        if (p==-1){
            System.out.println(key + " is not present in list.");
        }
        else{
            System.out.println("Index of " + key + " is " + p);
        }
    }
} 
