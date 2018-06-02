package mx.qbits.sample;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import java.io.IOException;
import java.net.URI;

public class Main {
    public static final String BASE_URI = "http://132.248.39.236:8080/jersey-sample/";

    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        // retrieve the server instance
        final HttpServer server = startServer();
        System.out.println(String.format("Jersey app started with WADL available at %sapplication.wadl\nHit enter to stop it...", BASE_URI));
        
        // just wait till any key is pressed...
        System.in.read();
        System.out.println("Jersey server stopped !!!");
        server.stop();
    }

    public static HttpServer startServer() {
        // create a resource config that scans for JAX-RS resources and providers
        // in mx.qbits.sample package
        final ResourceConfig rc = new ResourceConfig().packages("mx.qbits.sample");
        // create the server instance
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

}

