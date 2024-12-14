package OgrenciDersProgramiUygulamasi;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("1-Matematik");
        System.out.println("2-Edebiyat");
        System.out.print("Seçmek istediğiniz dersi seçiniz(1/2): ");
        int secim=scanner.nextInt();
        Bilgiler secilenDers;

        switch (secim){
            case 1:
                secilenDers=new Matematik();
                break;
            case 2:
                secilenDers = new Edebiyat();
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }
        System.out.println("Seçtiğiniz dersin bilgileri: ");
        secilenDers.dersBilgileriniGoster();
        }
    }

