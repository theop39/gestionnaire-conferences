package fr.uga.iut2.genconf.modele;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.validator.routines.EmailValidator;
import java.util.ArrayList;


public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;  // nécessaire pour la sérialisation
    private String email;
    private String nom;
    private String prenom;
    private final Map<String, Conference> conferencesAdministrees;  // association qualifiée par le nom
    
    private ArrayList<String> animateur;
    private ArrayList<String> correspondant;
    private ArrayList<String> orateur;

    public Utilisateur(String email, String nom, String prenom) {
        assert EmailValidator.getInstance(false, false).isValid(email);
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.conferencesAdministrees = new HashMap<>();
        this.animateur = new ArrayList<>();
        this.correspondant = new ArrayList<>();
        this.orateur = new ArrayList<>();
    }

    public String getEmail() {
        return this.email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void ajouteConferenceAdministree(Conference conf) {
        assert !this.conferencesAdministrees.containsKey(conf.getNom());
        this.conferencesAdministrees.put(conf.getNom(), conf);
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    /**
     * @return the animateur
     */
    public ArrayList<String> getAnimateurs() {
        return animateur;
    }

    /**
     * @return the correspondant
     */
    public ArrayList<String> getCorrespondants() {
        return correspondant;
    }

    public String getOrateur (String titre) { // retourne la communication de titre "titre"
       int i = -1;
       
       i = orateur.indexOf(titre);
       
       //i vaut -1 si la liste orateur ne contient pas la communication
       
       if (i != -1) {
           return orateur.get(i);
       }
       else 
       {
           throw new IllegalArgumentException("La communication de titre: " + titre + " n'existe pas"); 
       }
    }

    /**
     * @return the orateur
     */
    public ArrayList<String> getOrateurs() {
        return orateur;
    }
    
    public void addOrateur(String or) {
        orateur.add(or);

         if (!orateur.contains(or)) {
             orateur.add(or);
        }
    }
   
    public void addCorrespondant(String co) {

        if (!correspondant.contains(co)) {
            correspondant.add(co);
        }
    }
    
    public void addAnimateur(String an) {
        if (!animateur.contains(an)) {
             animateur.add(an);
        }
    }
    
    public void supprimerConference(Conference c) {
        conferencesAdministrees.remove(c.getNom(), c);
    }  

    
}
