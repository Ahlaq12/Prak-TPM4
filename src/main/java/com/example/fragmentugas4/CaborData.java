package com.example.fragmentugas4;

import java.util.ArrayList;

public class CaborData {private static String[] nama = new String[] {"Bulu tangkis","Sepak bola","Tenis","Bola Basket","Bola Voli","Tenis Meja","Atletik","Dayung","Tinju","Berkuda"};
    private static int[]thunail = new int[] {R.drawable.bulutangkis,R.drawable.sepakbola,R.drawable.tenis,R.drawable.basket,R.drawable.voli,R.drawable.tenismeja,R.drawable.atletik,R.drawable.dayung,R.drawable.tinju,R.drawable.berkuda};
    private static String[]preview = new String[] {"Bulu tangkis atau disebut juga badminton adalah salah satu cabang olahraga raket yang dimainkan oleh dua orang pada sektor tunggal atau dua pasangan pada sektor ganda. Permainan bulu tangkis bertujuan untuk memukul bola yang disebut juga dengan kok atau shuttlecock.",
            "Sepak bola adalah salah satu olahraga permainan yang menggunakan bola dan dimainkan oleh dua tim yang masing-masing beranggotakan 11 orang. Satu orang bertugas sebagai penjaga gawang dan lainnya menjadi pemain, di mana ada yang menempati posisi bertahan dan menyerang",
            "Tenis, sama halnya sepeti bulu tangkis, adalah olahraga yang dimainkan antara dua pemain untuk sektor tunggal atau antara dua pasangan untuk sektor ganda yang tentu saja saling berlawanan.",
            "Bola basket adalah salah satu cabang olahraga bola yang berkelompok. Setiap tim bola basket terdiri dari 5 orang. Kelima orang ini akan bekerja sama untuk memasukkan bola sebanyak-banyaknya ke ring dari tim lawan. Tim yang dapat mencetak poin lebih banyak pada ring lawan akan keluar sebagai pemenangnya.",
            "Bola voli merupakan olahraga permainan yang dimainkan oleh dua tim yang masing-masing tim terdiri dari 6  orang.  Ada juga variasi permainan bola voli ini. Variasi tersebut adalah voli pantai. Bedanya, voli pantai tidak dimainkan oleh 6 orang, tetapi hanya 2 orang saja.",
            "Tenis meja, atau yang juga sering disebut dengan ping pong, merupakan olahraga yang dimainkan oleh dua orang baik untuk permainan tunggal atau dua pasangan pada sektor ganda secara berlawanan. Permainan tenis meja ini menggunakan bat. Bat adalah sebuah raket kecil yang terbuat dari papan kayu dan bat sendiri dilapisi olaeh bahan karet diluarnya.",
            "Atletik adalah salah satu dari cabang olahraga yang juga dipertandinggkan di ajang bergengsi internasional seperti Asian Games atau Olimpiade. Atletik dibagi menjadi beberapa nomor. Yang pertama dalah nomor lari, yang kedua adalah nomor lempar, yang ketiga adalah nomor jalan dan yang terakhir adalah nomor lompat.",
            "Ketangkasan dan kekompakan sangat dibutuhkan dalam salah satu cabang olahraga ini. Olahraga dayung adalah olahraga yang menggerakkan perahu dengan cara dikayuh atau didayung di atas air. Tempat dari olahraga dayung ini dapat dilakukan di sungai, di danau maupun di laut, tergantung pada jenis perlombaan yang diselenggarakan. Lomba ini membutuhkan stamina dan tenaga yang kuat, keahlian berperahu dengan baik, keahlian individu sendiri dan keahlian berkelompok.",
            "Tinju adalah salah satu perpaduan antara olahraga dan seni bela diri yang mempertandingkan dua peserta dengan berat dan kelas yang sama untuk bertanding satu sama lain dengan menggunakan tinju mereka dalam rangkaian ronde. Pengertian ronde di sini adalah pertandingan berinterval satu atau tiga menit. Dalam pertandingan tinju, atlet menghindari pukulan lawan mereka sambil berupaya agar dapat  mendaratkan pukulan mereka sendiri ke arah lawannya.",
            "Berkuda adalah suatu olahraga yang menuntut suatu skill atau keahlian tertentu antara lain keterampilan, kebugaran fisik, stamina yang kuat, konsentrasi yang lebih dan penerapan teknik-teknik berkuda yang baik dan benar walaupun barangkali hal ini tidak terlalu di tekankan kepada atlit. \n"
    };
    public static ArrayList<CaborModel> getListData(){
        CaborModel caborModel = null;
        ArrayList<CaborModel> list = new ArrayList<>();
        for (int i =0; i<nama.length; i++){
            caborModel = new CaborModel();
            caborModel.setNamaCabor(nama[i]);
            caborModel.setLogoCabor(thunail[i]);
            caborModel.setPrivew(preview[i]);
            list.add(caborModel);
        }
        return list;
    }
}
