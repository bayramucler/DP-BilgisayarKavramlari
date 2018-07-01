package AbstractOccurence;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uclerpc
 */
public class TvShow {
    
    private String name;
    private String producer;
    
    private ArrayList <Episode> episodeList;
    private StringBuffer stringBuffer;
    
    public TvShow(){
        episodeList = new ArrayList();
        stringBuffer = new StringBuffer();
    }
    
    public TvShow(String name, String producer){
        this.name=name;
        this.producer=producer;
        episodeList = new ArrayList();
        stringBuffer = new StringBuffer();
    }
    
    
    
    public void addEpisode(Episode episode){
       episodeList.add(episode);
    }
    
    public String printEpisodes(){
        
        for(int i = 0; i<episodeList.size(); i++){
            stringBuffer.append("Name: "+episodeList.get(i).getName() + ", Episode: " +episodeList.get(i).getNumber() + ", Year: " + episodeList.get(i).getYear()+"\n");
        }
        return stringBuffer.toString();
    }
    
    public String printEpisodesForNo(int no){

        for( int i = 0; i< episodeList.size();i++){
            
            if(episodeList.get(i).getNumber()==no){
                stringBuffer.append("Name: "+episodeList.get(i).getName() + ", Episode: " +episodeList.get(i).getNumber() + ", Year: " + episodeList.get(i).getYear()+"\n");
      
            }
                
        }
        return stringBuffer.toString();
    }
    
    public void removeEpisodeForNo(int no){
        for(int i= 0; i< episodeList.size();i++){
            if(episodeList.get(i).getNumber()==no){
                episodeList.remove(i);
            }
        }
    }

    public ArrayList <Episode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(ArrayList <Episode> episodeList) {
        this.episodeList = episodeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    
}
