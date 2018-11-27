package com.example.salsa.platform11mediaplayback;

public class SinetronModel {

    private String nama, durasi, videoRawId;

    public static final SinetronModel[] drama = {

            new SinetronModel("Wonder Woman", "02:51", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4"),
            new SinetronModel("Aquaman", "02:51", "aquaman"),
            new SinetronModel("Batman", "02:51", "batman"),
    };

    //nama, deskripsi dan gambar
    private SinetronModel(String nama, String durasi, String videoRawId){
        this.nama = nama;
        this.durasi = durasi;
        this.videoRawId = videoRawId;
    }

    public  String getNama(){
        return nama;
    }

    public  String getDurasi(){
        return durasi;
    }

    public  String getVideoRawId(){
        return videoRawId;
    }

    public String toString(){
        return this.nama;
    }
}
