/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.modele;

import java.util.TreeSet;

public class Evenement {
    
    private String libelle;
    private String couleur;
    private TreeSet<Session> sessions;
    
    public Evenement(String lib, String coul) {
        libelle=lib;
        couleur=coul;
        sessions = new TreeSet<>();
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * @return the sessions
     */
    public TreeSet<Session> getSessions() {
        return sessions;
    }
    
    public Session getSession(String nom) {
        int index;
        for(Session s : sessions) {
            if (s.getNom().equals(nom)) {
               return s;
            } 
        }
        throw new IllegalArgumentException("Aucune session au nom : " + nom);
    }
    
    public void addSession(Session s) {
        sessions.add(s);
    }
    
    public void suppSession(Session s) {
        
        sessions.remove(s);
    }
    
    
}
