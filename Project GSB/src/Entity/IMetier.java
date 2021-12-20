/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

public interface IMetier 
{
    public Utilisateur VerifierIdentifiants (String login,String mdp);
    
    public ArrayList<Praticien>getAllPraticiens();
    
    public ArrayList<Specialite>getAllSpecialite();
    
    public ArrayList<Activite>getAllActivite();
    
    public void insererSpecialite(int spe_code,String libelle);
    
    public ArrayList<Specialite> getAllSpecialiteByPra_num(int unNum);
}
