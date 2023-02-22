import java.util.Scanner;
public class DaireAlanveCevreHesaplama {
    public static void main(String[] args) {
        int r;
        double pi=3.14, alan, cevre;

        Scanner input= new Scanner(System.in);
        System.out.print("Dairenin yari capini giriniz :");
        r= input.nextInt();

        alan= pi * r *r ;
        cevre=2 * pi *r ;

        System.out.println("Dairenin Alani = "+alan);
        System.out.println("Dairenin Cevresi ="+cevre);



    }
}
