/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pornchitar.reportproject;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class ArtistService {
    public  List<ArtistReport> getArtistByTotalPrice(){
        ArtistDao artistDao = new ArtistDao();
        return artistDao.getArtistByTotalPrice(10);
    }
}
