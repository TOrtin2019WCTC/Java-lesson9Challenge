/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab2.student;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author tim
 */
public interface Album extends Product {
      @Override
      public String getTitle();
      @Override
       public double getCost();

      @Override
    public int getQuantityOnHand();

      @Override
    public LocalDate getReleaseDate();
 public String getArtist();

      @Override
    public void order(int quantity);
 public Duration getPlayingTime();

      @Override
    public String getFormattedReleaseDate();
}
