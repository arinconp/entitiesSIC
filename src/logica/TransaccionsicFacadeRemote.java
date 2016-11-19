/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import entities.Transaccionsic;
import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author sala-a
 */
@Remote
public interface TransaccionsicFacadeRemote {

    void create(Transaccionsic transaccionsic);

    void edit(Transaccionsic transaccionsic);

    void remove(Transaccionsic transaccionsic);

    Transaccionsic find(Object id);

    List<Transaccionsic> findAll();

    List<Transaccionsic> findRange(int[] range);

    int count();
    
    void getTransaccionesALI(String fecha);
    
}
