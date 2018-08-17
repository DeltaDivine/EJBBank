/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.example.bean.AccountFacadeLocal;
import com.example.entity.Account;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author DeltaDivine
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    @EJB
    private AccountFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "account") Account account) {
        ejbRef.create(account);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "account") Account account) {
        ejbRef.edit(account);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "account") Account account) {
        ejbRef.remove(account);
    }

    @WebMethod(operationName = "find")
    public Account find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Account> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Account> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "Payment")
    public String Payment(@WebParam(name = "id") int id, @WebParam(name = "total") double total) {
        return ejbRef.Payment(id, total);
    }

    @WebMethod(operationName = "CheckAccount")
    public Account CheckAccount(@WebParam(name = "id") int id) {
        return ejbRef.CheckAccount(id);
    }
    
}
