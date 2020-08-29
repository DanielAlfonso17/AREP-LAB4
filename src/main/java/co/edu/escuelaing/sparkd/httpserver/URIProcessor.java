
package co.edu.escuelaing.sparkd.httpserver;

/**
 *
 * @author Daniel
 */
public interface URIProcessor {
    
    public void mapService(String command) throws Exception;
    public String executeService (String uri);
}
