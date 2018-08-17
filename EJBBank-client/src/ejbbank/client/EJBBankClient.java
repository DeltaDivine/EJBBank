/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbbank.client;

/**
 *
 * @author DeltaDivine
 */

import demo.NewWebService_Service;
import demo.NewWebService;
/**
 *
 * @author DeltaDivine
 */
public class EJBBankClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewWebService_Service service = new NewWebService_Service();
        NewWebService newWebService = service.getNewWebServicePort();
        String status = newWebService.payment(2, 100000);
        System.out.println(status);
    }
    
}
