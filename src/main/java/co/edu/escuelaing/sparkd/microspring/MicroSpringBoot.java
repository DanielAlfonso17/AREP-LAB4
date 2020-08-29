/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.sparkd.microspring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import co.edu.escuelaing.sparkd.httpserver.URIProcessor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class MicroSpringBoot {
     
    public static void main(String[] args){
        try {
            URIProcessor microSpring = new MicroSpring();
            microSpring.mapService(args[0]);
            HttpServer server = new HttpServer(microSpring);
            server.start();
        } catch (Exception ex) {
            Logger.getLogger(MicroSpringBoot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
