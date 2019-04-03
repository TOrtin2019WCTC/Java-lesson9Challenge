/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab2.student;

import java.time.LocalDate;

/**
 *
 * @author tim
 */
public interface Book extends Product {
    @Override
    public String getTitle();

    public String getISBN();

    @Override
    public double getCost();

    @Override
    public int getQuantityOnHand();

    @Override
    public LocalDate getReleaseDate();

    public String getAuthor();
    @Override
    public void order(int quantity);

    public int getPages();
    
    @Override
    public String getFormattedReleaseDate();
}
