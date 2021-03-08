/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas20202021;

import java.util.List;
import modelo.HibernateUtil;
import modelo.Trabajadorbbdd;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class Sistemas20202021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;

        try{
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();

            String consultaHQL = "FROM Trabajadorbbdd t WHERE t.nifnie = :param1";

            Query query = sesion.createQuery(consultaHQL);
            String dni = "71542130D";
            //String dni2 = "09741138V";
            query.setParameter("param1", dni);
            //query.setParameter("param2", dni2);
            List<Trabajadorbbdd> lista = query.list();

            for(Trabajadorbbdd tbd:lista){
                System.out.println("Nombre:" + tbd.getNombre());
                System.out.println("NIF:" + tbd.getNifnie());
                System.out.println("******************************");
            }

            HibernateUtil.shutdown();

        }catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

}

