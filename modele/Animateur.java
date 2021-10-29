/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.modele;

import java.util.TreeSet;

public class Animateur {
    
    
    private Utilisateur utilisateur;
    private Communication communication;
    private TreeSet<Session> sessions;
    
    public Animateur(Utilisateur u, Communication c) {
        utilisateur = u;
        communication = c;
        sessions = new TreeSet<>();
    } 
}
