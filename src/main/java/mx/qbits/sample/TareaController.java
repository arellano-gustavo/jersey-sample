package mx.qbits.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("tarea")
public class TareaController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String procesa(@QueryParam("source") String source) {
        boolean res = construye(source);
        return "{\"resultado\" : \""+res+"\"}";
    }
    
    public boolean construye(String fuente) {
        String tmp = fuente + fuente;
        return tmp.substring(1, tmp.length()-1).contains(fuente); 
    }
}
