package com.example.ormawapolines;

import java.util.ArrayList;

public class HmjData {

    public static String [][] data = new String[][] {
            {"0","HMJ Teknik Elektro", "HMJ Elektro terdiri dari 5 program studi, " +
                    "diantaranya yaitu Teknik Informatika, D3-Teknik Telekomunikasi, " +
                    "D4-Teknik Telekomunikasi, Teknik Listrik, Teknik Elektronika",
                    "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ Sipil", "HMJ Teknik Sipil terdiri dari 4 program studi, " +
                    "diantaranya yaitu D4-Teknik Perawatan dan Perbaikan Gedung, D4-Perancangan Jalan dan Jembatan, " +
                    "D3-Konstruksi Gedung, D3-Konstruksi Sipil",
                    "https://i.postimg.cc/yxBXSxYw/hms.jpg"
            },
            {"2","HMJ Teknik Mesin", "HMJ Teknik Mesin terdiri dari 4 program studi, " +
                    "diantaranya yaitu D4-Teknik Mesin Produksi dan Perawatan, D4-Teknologi Rekayasa Pembangkit Energi, " +
                    "D3-Teknik Mesin, Teknik Konversi Energi",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"
            },
            {"3","HMJ Akuntansi", "HMJ Teknik Mesin terdiri dari 5 program studi, " +
                    "diantaranya yaitu D4-Analisis Keuangan, Akutansi Manajerial, " +
                    "D4-Perbankan Syariah, D4-Komputerisasi Akuntasi, Akutansi, Keuangan dan Perbankan",
                    "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"
            },
            {"4","HMJ Akuntansi", "HMJ Teknik Mesin terdiri dari 4 program studi, " +
                    "diantaranya yaitu TAdministrasi Bisnis, Manajemen Pemasaran, " +
                    "D4-Manajemen Bisnis Internasional, D4- Administrasi Bisnis Terapan",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"
            }
    };

    public static ArrayList<Hmj> getListData() {
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data) {
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
