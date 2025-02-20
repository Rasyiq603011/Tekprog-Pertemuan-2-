// import java.util.*;
import java.math.*;

public class Datatype {
    public static void main(String[] args) {
        //====================== Menggunakan Input ============================
        // Scanner Input = new Scanner(System.in);
        // System.out.print("Masukan angka yang ingin di cek :");
        // BigInteger Nilai = Input.nextBigInteger();

        // fitted(Nilai);
        // Input.close();
        //====================== Menggunakan Input ============================

        //====================== Tanpa Input ============================

        BigInteger Nilai1 = new BigInteger("5");
        BigInteger Nilai2 = new BigInteger("-150");
        BigInteger Nilai3 = new BigInteger("150000");
        BigInteger Nilai4 = new BigInteger("1500000000");
        BigInteger Nilai5 = new BigInteger("213333333333333333333333333333333333");
        BigInteger Nilai6 = new BigInteger("-100000000000000");

        fitted(Nilai1);
        fitted(Nilai2);
        fitted(Nilai3);
        fitted(Nilai4);
        fitted(Nilai5);
        fitted(Nilai6);

        //====================== Tanpa Input ============================
    }

    public static void fitted(BigInteger cek){       
        if ((cek.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) && 
            (cek.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0)) 
        {
            System.out.println(cek + " dapat ditampung pada tipe data:");
            System.out.println("==> Byte");
            System.out.println("==> Short");
            System.out.println("==> Integer");
            System.out.println("==> Long");
        } 
        else if ((cek.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) && 
                (cek.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0)) 
        {
            System.out.println(cek + " dapat ditampung pada tipe data:");
            System.out.println("==> Short");
            System.out.println("==> Integer");
            System.out.println("==> Long");
        } 
        else if ((cek.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) && 
                (cek.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0)) 
        {
            System.out.println(cek + " dapat ditampung pada tipe data:");
            System.out.println("==> Integer");
            System.out.println("==> Long");
        } 
        else if ((cek.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) && 
                (cek.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0)) 
        {
            System.out.println(cek + " dapat ditampung pada tipe data:");
            System.out.println("==> Long");
        } 
        else 
        {
            System.out.println(cek + " can't be fitted anywhere");
        }

        // if ((cek >= Byte.MIN_VALUE) && (cek <= Byte.MAX_VALUE)){
        //     System.out.println(cek + " dapat ditampung pada tipe data :");
        //     System.out.println("==> Byte");
        //     System.out.println("==> Short");
        //     System.out.println("==> Integer");
        //     System.out.println("==> Long");
        // } 
        // else if((cek >= Short.MIN_VALUE) && (cek <= Short.MAX_VALUE)){
        //     System.out.println( cek + " dapat ditampung pada tipe data :");
        //     System.out.println("==> Short");
        //     System.out.println("==> Integer");
        //     System.out.println("==> Long");
    
        // }
        // else if((cek >= Integer.MIN_VALUE) && (cek <= Integer.MAX_VALUE)){
        //     System.out.println( cek +" dapat ditampung pada tipe data :");
        //     System.out.println("==> Integer");
        //     System.out.println("==> Long");
    
        // }
        // else if((cek >= Long.MIN_VALUE) && (cek <= Long.MAX_VALUE)){
        //     System.out.println( cek +" can't be fitted anywhere");
        // }

    }

 
}

 