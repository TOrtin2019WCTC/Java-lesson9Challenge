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
    public String getTitle();

    public String getISBN();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getAuthor();
    public void order(int quantity);

    public int getPages();
    public String getFormattedReleaseDate();
}
