import java.util.Scanner;
public class Main {
    static int sum(int num1, int num2){
        int result = num1+num2;
        System.out.println("Sonuç ="+result);
        return result;
    }
    static int minus(int num1 , int num2){
        int result = num1-num2;
        System.out.println("Sonuç ="+result);
        return result;

    }
    static int multiply(int num1,  int num2){
        int result=num1*num2;
        System.out.println("Sonuç ="+result);
        return result;
    }

    static int divided(int num1 ,int num2){
        int result=num1/num2;
        System.out.println("Sonuç ="+result);
        return result;
    }

    static int faktoriyel(int num1, int num2){
        int result=1;
        for(int i=1; i<=num2;i++){
            result*=num1;
        }
        return result;
    }

    static int mod(int num1, int num2){
        int result=num1%num2;
        System.out.println("Sonuç ="+result);
        return result;
    }

    static int dikdortgen_hesaplama(int num1,int num2){
        int alan=num1*num2;
        int cevre=(num1+num2)*2;
        System.out.println("Alan = "+ alan + "Çevre = " + cevre);
        return alan;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,secim;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Faktoriyel Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while(true) {
            System.out.println(menu);
            System.out.println("Yapmak istediğiniz işlemi seçiniz :");
            secim = input.nextInt();
            if(secim==7){
                System.out.println("Kısa kenar için birinci sayı uzun kenar için ikinci sayıyı tercih ediniz.");
            }
            if(secim==0){
                break;
            }
            System.out.println("ilk sayıyı giriniz:");
            num1 = input.nextInt();
            System.out.println("İkinci sayıyı giriniz:");
            num2 = input.nextInt();

            switch (secim){
                case 1:
                    sum(num1,num2);
                    break;
                case 2:
                    minus(num1,num2);
                    break;
                case 3:
                    multiply(num1,num2);
                    break;
                case 4:
                    divided(num1,num2);
                    break;
                case 5:
                    faktoriyel(num1,num2);
                    break;
                case 6:
                    mod(num1,num2);
                    break;
                case 7:
                    dikdortgen_hesaplama(num1,num2);
                    break;

        }
        }
    }}
