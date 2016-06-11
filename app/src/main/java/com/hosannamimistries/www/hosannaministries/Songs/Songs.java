package com.hosannamimistries.www.hosannaministries.Songs;

import java.util.ArrayList;

/**
 * Created by NARESH on 5/5/2016.
 */
public class Songs extends  SongIndexes{
    static Songs songDataObj = new Songs();
    private Songs(){}
    ArrayList<String> songs = new ArrayList<>();
    public  static Songs getSongDataInstance(){
        return songDataObj;
    }
    public void addSong(int index, String data ){
        this.songs.add(index,data);
    }
//    songDataObj.addSong(0,"పల్లవి||   కృపామయుడా - నీలోనా\n\t" +
//            "నివసింప జేసనిందునా\n\t" +
//            "ఇదిగో నా స్తుతుల్ సింహాసనిం - నీలో \n\n " +
//            "చ||    ఏ అపాయము నాగుడారము సమీపించనియయక\n\t" +
//            "నా మారగముల్నిిటిలో నీవే\n\tనా ఆశ్రయమైనిందున                                       ||కృపా ||" +
//            "\nచ||     చీకటి నిండి వెలుగులోనికి\n\tనని పలిచిన తేజోమయా\n\t" +
//            "రాజవింశములో - యాజకత్వము చేసెదన               ||కృపా||\n" +
//            "చ||     నీలో నిలిచి ఆత్మఫల్ములు\n\tఫలిించుట కొరకు\n\tనాపైన నిిండుగా - ఆత్మమ వరషము కుమమరించు||కృపా||\n " +
//            "చ||     ఏ యోగ్యత్ లేని నాకు\n\tజీవకిరీట మిచుుటకు\n\tనీ కృప నన వీడక - శాశవత్ కృపగా మారెన            ||కృప|| \n\n\n");

}
