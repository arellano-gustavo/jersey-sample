package mx.qbits.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("datos")
public class DatoController {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "json" media type.
     *
     * @return Dato[] that will be automatically translated & returned as a json response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Dato[] getIt() {
        // Instead of this, we should invoke a service, 
        // but for the sake of clarity, the raw code is typed here
        Dato varios[] = new Dato[3];
        varios[0] = new Dato("gustavo", 51);
        varios[1] = new Dato("adolfo", 23);
        varios[2] = new Dato("luis", 17);
        return varios;
    }
}
