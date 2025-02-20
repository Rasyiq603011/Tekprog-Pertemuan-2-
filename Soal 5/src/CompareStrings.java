public class CompareStrings {
    public static void main(String[] args) {
        
        String A = "hello";
        String B = "java";

        int panjang = A.length() + B.length();

        System.out.println("Banyak kata : " + panjang);

        boolean Cek = (A.compareTo(B) > 0);

        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);


        System.out.println("Apakah termasuk lexicographically? : " + (Cek? "Yes" : "No")  );

        String Combine = A + " " + B;

        System.out.println(Combine);

    }
}
