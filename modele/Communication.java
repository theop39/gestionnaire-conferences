/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Communication {
    private String titre;
    private Date date;
    private TypeCommunication typeComm;
    private HashMap<String, Videos> videos;
    private HashMap<String, Pdfs> pdfs;
    private HashMap<String, Htmls> htmls;
    private HashMap<String, Fichier> fichiers;
    private Session session;
    
    
    
    public Communication(String t, Date d, TypeCommunication tc) {
        titre = t;
        date = d;
        typeComm = tc;
        videos = new HashMap<>();
        pdfs = new HashMap<>();
        fichiers = new HashMap<>();
        
        if(tc.getIdsFichiers() != null) {
            for(String s : tc.getIdsFichiers()) {
                fichiers.put(s, null);
            }
        }
        
        if(tc.getIdsPdfs()!= null) {
            for(String s : tc.getIdsPdfs()) {
                pdfs.put(s, null);
            }
        }
        
       if(tc.getIdsHtmls()!= null) {
            for(String s : tc.getIdsHtmls()) {
                htmls.put(s, null);
            }
        }
       
       if(tc.getIdsVideos()!= null) {
            
            for(String s : tc.getIdsVideos()) {
                videos.put(s, null);
            }
        }
    }
    
    public Pdfs getPdf(String id) {
        return pdfs.get(id);
    }
    
    public void setPdf(String id, Pdfs pdf) {
        pdfs.replace(id,pdf);
    }
    
    public Videos getVideo(String id) {
        return videos.get(id);
    }
    
    public void setVideo(String id, Videos video) {
        videos.replace(id,video);
    }
    
    public Fichier getFichier(String id) {
        return fichiers.get(id);
    }
    
    public void setFichier(String id, Fichier fichier) {
        fichiers.replace(id,fichier);
    }
    
    public Htmls getHtml(String id) {
        return htmls.get(id);
    }
    
    public void setHtml(String id, Htmls html) {
        htmls.replace(id,html);
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
}
