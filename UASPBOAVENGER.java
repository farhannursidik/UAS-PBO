/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.pbo.avenger;

/**
 *
 * @author MEX BRINGAS
 */
public class UASPBOAVENGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTAIN AMERIKA
        CAPTAIN_AMERIKA CAP = new CAPTAIN_AMERIKA();
        CAP.setnamaAvenger("CAPTAIN AMERIKA");
        CAP.setKarakter1("Kekuatan, kelincahan, kecepatan \n" +
        "Menguasai bela diri \n" +
        "Memegang perisai \n" +
        "Komandan ");
        System.out.println("NAMA AKTOR : "+CAP.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+CAP.getKarakter1());
        
        //IRON MAN
        IRON_MAN IRO = new IRON_MAN();
        IRO.setnamaAvenger("IRON MAN");
        IRO.setKarakter2("\n Sangat kuat dan berdaya tahan tinggi\n" +
        "Kecepatan terbang mencapai Mach 3\n" +
        "Regenerasi");
        System.out.println("NAMA AKTOR : "+IRO.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+IRO.getKarakter2());
        
        //HULK
        HULK HUL = new HULK();
        HUL.setnamaAvenger("HULK");
        HUL.setKarakter3("\n Kekuatan yang sangat kuat\n" +
        "Mempunyai Tubuh yang besar\n");
        System.out.println("NAMA AKTOR : "+HUL.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+HUL.getKarakter3());
        
        //SPIDERMAN
        SPIDERMAN SPI = new SPIDERMAN();
        SPI.setnamaAvenger("SPIDERMAN");
        SPI.setKarakter4("\n Kekuatan manusia super, kecepatan, stamina, ketangkasan, dan daya tahan\n" +
        "Kemampuan untuk menembakkan jaring laba-laba dari pergelangan tangan\n" +
        "Panca indera laba-laba\n");
        System.out.println("NAMA AKTOR : "+SPI.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+SPI.getKarakter4());
        
        //THOR
        THOR THO = new THOR();
        THO.setnamaAvenger("THOR");
        THO.setKarakter5("\n Dewa yang memiliki kekuatan hebat\n" +
        "Thor merupakan salah satu dewa Norwegia yang memiliki kekuatan besar\n" +
        "Dikenal sebagai Dewa petir");
        System.out.println("NAMA AKTOR : "+THO.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+THO.getKarakter5());
        
        //BLACK PANTER
        BLACK_PANTER BLA = new BLACK_PANTER();
        BLA.setnamaAvenger("BLACK_PANTER");
        BLA.setKarakter6("\n Akrobat terlatih, seniman bela diri dan pesenam \n" +
        "Indra Super Peningkatan kekuatan, kecepatan, ketangkasan, stamina, daya tahan, penyembuhan dan refleks Genius-level intelek\n" +
        "erlindungan alkimia terhadap serangan mistis dan deteksi Menggunakan seragam, sepatu bot dan peralatan vibranium ");
        System.out.println("NAMA AKTOR : "+BLA.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+BLA.getKarakter6());
        
        //DR. STRANGE
        DR_STRANGE DR = new DR_STRANGE();
        DR.setnamaAvenger("DR. STRANGE");
        DR.setKarakter7("\n bedah yang brilian tapi egois. \n" +
        "menghalangi kemampuannya untuk melakukan operasi, dia mencari bola untuk memperbaiki dan menemukan Ancient One.\n" +
        "Setelah menjadi salah satu murid Sorcerer Supreme, ia menjadi praktisi seni mistik maupun bela diri");
        System.out.println("NAMA AKTOR : "+DR.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+DR.getKarakter7());
        
        //BLACK WIDOW
        BLACK_WIDOW WID = new BLACK_WIDOW();
        WID.setnamaAvenger("BLACK WIDOW");
        WID.setKarakter8("\n Kuat dan lincah \n" +
        "Cantik dan mempesona \n");
        System.out.println("NAMA AKTOR : "+WID.getnamaaktor());
        System.out.println("KARAKTER AKTOR : "+WID.getKarakter8());
          
    }
    
}
