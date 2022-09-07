import java.util.Scanner;

public class ArtıkYıl {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Yil Giriniz:");
        a = sc.nextInt();
        if(a%100==0)
        {
           if(a%400==0){System.out.println(a+" artık yıldır.");}
           else{System.out.println(a+" artık yıl degıldır.");}
        }
        else
        {
           if(a%4==0){System.out.println(a+" artık yıldır.");}
           else{System.out.println(a+" artık yıl degildir.");}
        }
    }
}