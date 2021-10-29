/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeSet;


public class Session {

    private String nom;
    private Date date;
    private String typeSession;
    private Videos video;
    private Evenement evenement;
    private TreeSet<Animateur> animateurs;
     
    
    public Session(String n, Date d) {
        nom = n;
        date = d;
    }
    
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the video
     */
    public Videos getVideo() {
        return video;
    }

    /**
     * @param video the video to set
     */
    public void setVideo(Videos video) {
        this.video = video;
    }

    /**
     * @return the evenement
     */
    public Evenement getEvenement() {
        return evenement;
    }

    /**
     * @param evenement the evenement to set
     */
    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
    
    public void ajouterAnimateur(Animateur a) {
        if (!animateurs.contains(a)) {
            animateurs.add(a);
        }
    }
    
    public void suppAnimateur(Animateur a) {
        animateurs.remove(a);
    }
    
    
    
}
