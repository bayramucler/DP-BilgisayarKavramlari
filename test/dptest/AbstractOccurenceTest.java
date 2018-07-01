package dptest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import AbstractOccurence.Episode;
import AbstractOccurence.TvShow;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author uclerpc
 */
public class AbstractOccurenceTest {
    
    private TvShow theSopranos;
    
    
    @Before
    public void setUp(){
        theSopranos = new TvShow();
       
    }
    
    @Test
    public void EpisodeTest(){
        
        
        theSopranos.setName("The Sopranos");
        
        theSopranos.addEpisode(new Episode("Members Only", 1, 2006));
        theSopranos.addEpisode(new Episode("Join the Club", 2, 2006));
        theSopranos.addEpisode(new Episode("Mayham", 3, 2006));
        
        System.out.println(theSopranos.printEpisodes());
        
        assertEquals(String.class, theSopranos.printEpisodes().getClass());
        assertEquals(3, theSopranos.getEpisodeList().size());
        
        assertEquals("The Sopranos", theSopranos.getName());
        assertEquals("Members Only", theSopranos.getEpisodeList().get(0).getName());
        assertEquals(1, theSopranos.getEpisodeList().get(0).getNumber());
        assertEquals(2006, theSopranos.getEpisodeList().get(0).getYear());




    }

    
    
    
}
