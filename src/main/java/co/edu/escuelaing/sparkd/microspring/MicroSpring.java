
package co.edu.escuelaing.sparkd.microspring;


import co.edu.escuelaing.sparkd.httpserver.URIProcessor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel
 */
public class MicroSpring implements URIProcessor{
    
    Map<String, Method> services = new HashMap<>();
    
    public void mapService(String componentName) throws Exception{

      int nMethods = 0;

      for (Method m : Class.forName(componentName).getMethods()) {
          System.out.println("Revisando metodos: "+  m.getName());
         if (m.isAnnotationPresent(RequestMapping.class)) {
             System.out.println("Tiene anotacion @RequestMapping");
             RequestMapping rm = m.getAnnotation(RequestMapping.class);
             services.put(rm.value(), m);
             nMethods++;

     }}

      System.out.printf("No of web services: %d %n", nMethods);

   }
    

   public String executeService(String uri){
        try {
            return services.get(uri).invoke(null).toString();
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
   }
    
}
