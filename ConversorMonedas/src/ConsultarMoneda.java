import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Monedas buscarMoneda (String monedaBase, String monedaTarget){
        String direccion ="https://v6.exchangerate-api.com/v6/1f76ea4b8742f68115acb789/pair/"+monedaBase+"/"+monedaTarget;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
try {
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

    return new Gson().fromJson(response.body(),Monedas.class);
   // String json=response.body();
   // System.out.println(Gson);
   // Monedas miMoneda = gson().fromJson(json, Monedas.class);
    //   System.out.println(miMoneda);


}
catch (Exception e){
    throw new RuntimeException("No encontré moneda");
}
    }
}
