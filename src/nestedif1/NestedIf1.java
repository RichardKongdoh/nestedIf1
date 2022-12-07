package nestedif1;

import java.util.Scanner;

public class NestedIf1 {

    public static void main(String[] args) {
        String printer, ukuran;
        int harga, lembar;
        
        Scanner input = new Scanner(System.in);
        
        //inputan jenis printer
        System.out.print("Pilih jenis printer :\n1. Hitam\n2. Warna\n3. Gambar\n= ");
        printer = input.next();
        
        //cek kondisi jenis printer
        if ("hitam".equalsIgnoreCase(printer) ){
            
            //jika inputan benar sesuai kondisi pertama
            //akan dikerjakan instruksi yang ada di dalam kondisi "hitam"
            //inputan jenis ukuran
            System.out.print("Pilih jenis ukuran :\n1. A4\n2. F4\n= ");
            ukuran = input.next();
            
            //cek kondisi inputan ukuran
            if ("A4".equalsIgnoreCase(ukuran)){
                
                //jika inputan benar sesuai kondisi pertama
                //akan dikerjakan instruksi yang ada di dalam kondisi ukuran "A4"
                //input berapa banyak lembar
                System.out.print("Berapa banyak lembar = ");
                lembar = input.nextInt();
                
                    //cek harga sesuai dengan inputan lembar dengan menggunakan operator pembanding
                    if (lembar > 50){
                        harga = lembar * 750;
                        System.out.println("Harga yang harus dibayar = Rp." + harga);
                    } else if (lembar <= 50 && lembar >= 1){
                        harga = lembar * 1000;
                        System.out.println("harga yang harus dibayar = Rp." + harga);
                    }
                    
              //jika kondisi ukuran pertama salah      
            } else if ("F4".equalsIgnoreCase(ukuran)){
                
                System.out.print("Berapa banyak lembar = ");
                lembar = input.nextInt();
                
                    if (lembar > 50){
                        harga = lembar * 1000;
                        System.out.println("Harga yang harus dibayar = Rp." + harga);
                }   else if (lembar <= 50 && lembar >= 1){
                        harga = lembar * 1250;
                        System.out.println("harga yang harus dibayar = Rp." + harga);
                } 
                    
              //jika jenis ukuran tidak ada yang benar
            } else {
                System.out.println("Tidak ada pada daftar");
            } 
            
        } else if ("Warna".equalsIgnoreCase(printer)){
            
            System.out.print("Pilih jenis ukuran :\n1. A4\n2. F4\n= ");
            ukuran = input.next();
            
            if ("A4".equalsIgnoreCase(ukuran)){
                
                System.out.print("Berapa banyak lembar = ");
                lembar = input.nextInt();
                
                    if (lembar > 30){
                        harga = lembar * 1100;
                        System.out.println("Harga yang harus dibayar = Rp." + harga);
                    } else if (lembar <= 30 && lembar >= 1){
                        harga = lembar * 1500;
                        System.out.println("harga yang harus dibayar = Rp." + harga);
                    } 
            } else if ("F4".equalsIgnoreCase(ukuran)){
                
                System.out.print("Berapa banyak lembar = ");
                lembar = input.nextInt();
                
                    if (lembar > 30){
                        harga = lembar * 1550;
                        System.out.println("Harga yang harus dibayar = Rp." + harga);
                    } else if (lembar <= 30 && lembar >= 1){
                        harga = lembar * 1750;
                        System.out.println("harga yang harus dibayar = Rp." + harga);
                    }      
            } else {
                System.out.println("Tidak ada pada daftar");
            } 
                   
        } else if ("gambar".equalsIgnoreCase(printer)){
            
            System.out.print("Pilih jenis ukuran :\n1. A4\n2. F4\n= ");
            ukuran = input.next();
            
            if ("A4".equalsIgnoreCase(ukuran)){
                
                System.out.print("Berapa banyak lembar = ");
                lembar = input.nextInt();
                
                    if (lembar > 20){
                        harga = lembar * 1700;
                        System.out.println("Harga yang harus dibayar = Rp." + harga);
                    } else if (lembar <= 20 && lembar >= 1){
                        harga = lembar * 2000;
                        System.out.println("harga yang harus dibayar = Rp." + harga);
                    }
                    
            } else if ("F4".equalsIgnoreCase(ukuran)){
                
                System.out.print("Berapa banyak lembar = ");
                lembar = input.nextInt();
                
                    if (lembar > 20){
                        harga = lembar * 2100;
                        System.out.println("Harga yang harus dibayar = Rp." + harga);
                    } else if (lembar <= 20 && lembar >= 1){
                        harga = lembar * 2250;
                        System.out.println("harga yang harus dibayar = Rp." + harga);
                    }      
            }  else {
                System.out.println("Tidak ada pada daftar");
            }
            
           //cek kondisi jenis printer
        } else {
                System.out.println("Tidak ada pada daftar");
            } 
        
    }
        
        
}
    

