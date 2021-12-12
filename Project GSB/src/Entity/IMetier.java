/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

public interface IMetier 
{
    //on ecrit ici toutes les methodes qpour aller chercher les données dans la base
    public ArrayList<Utilisateur>getAllUsers();
    //passer en parametre un id pour avoir tout ses tickets 
    public Utilisateur VerifierIdentifiants (String login,String mdp);
    
    public ArrayList<Praticien>getAllPraticiens();
    
    public ArrayList<Specialite>getAllSpecialite();
}
