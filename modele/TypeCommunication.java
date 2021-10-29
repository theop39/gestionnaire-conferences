/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.uga.iut2.genconf.modele;

import java.util.ArrayList;

public class TypeCommunication {
    
    
    private String nomType;
    private ArrayList<String> idsVideos;
    private ArrayList<String> idsHtmls;
    private ArrayList<String> idsPdfs;
    private ArrayList<String> idsFichiers;

    
    public TypeCommunication(String nt) {
        nomType = nt;
        idsVideos = new ArrayList<>();
        idsHtmls = new ArrayList<>();
        idsPdfs = new ArrayList<>();
        idsFichiers = new ArrayList<>();
    }
    /**
     * @return the nomType
     */
    public String getNomType() {
        return nomType;
    }

    /**
     * @param nomType the nomType to set
     */
    public void setNomType(String nomType) {
        this.nomType = nomType;
    }

    /**
     * @return the idsVideos
     */
    public ArrayList<String> getIdsVideos() {
        return idsVideos;
    }

    /**
     * @return the idsHtmls
     */
    public ArrayList<String> getIdsHtmls() {
        return idsHtmls;
    }

    /**
     * @return the idsPdfs
     */
    public ArrayList<String> getIdsPdfs() {
        return idsPdfs;
    }

    /**
     * @return the idsFichiers
     */
    public ArrayList<String> getIdsFichiers() {
        return idsFichiers;
    }
    
    
    public void addFichier(String id) {
        idsFichiers.add(id);
    }
    
    public void addHtml(String id) {
        idsHtmls.add(id);
    }
    public void addVideo(String id) {
        idsVideos.add(id);
    }
    public void addPdf(String id) {
        idsPdfs.add(id);
    }
    
    


}
