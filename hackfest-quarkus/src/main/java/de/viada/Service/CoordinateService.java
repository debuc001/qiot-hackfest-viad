package de.viada.Service;

import de.viada.DTO.CoordinatesDTO;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.InputStream;
import java.net.URL;

/**
 * Service to retrieve Coordinates.
 */


@ApplicationScoped
public class CoordinateService {

    private static final Logger LOG = Logger.getLogger(CoordinateService.class);

    public CoordinatesDTO getCoordinates(String address)
            throws Exception {
        CoordinatesDTO coordinatesDTO = null;
        StringBuffer query = null;
        String[] split = null;
        split = address.split(" ");
        query = new StringBuffer();
        query.append("https://nominatim.openstreetmap.org/search?q=");
        if (split.length == 0) {
            return null;
        }
        for (int i = 0; i < split.length; i++) {
            query.append(split[i]);
            if (i < (split.length - 1)) {
                query.append("+");
            }
        }
        query.append("&format=json&addressdetails=1");
        LOG.debug("Query:" + query);
        URL url = new URL(query.toString());
        try (InputStream is = url.openStream();
             JsonReader reader = Json.createReader(is)) {
            JsonArray jsonArray = reader.readArray();
            LOG.debug(jsonArray.toString());
            JsonObject jsonObject = jsonArray.getJsonObject(0);
            LOG.debug(jsonObject.toString());
            coordinatesDTO = new CoordinatesDTO();
            coordinatesDTO.setLongitude(Double
                    .parseDouble(jsonObject.getString("lon")));
            coordinatesDTO.setLatitude(Double
                    .parseDouble(jsonObject.getString("lat")));
            LOG.debug(coordinatesDTO.toString());
        }
        return coordinatesDTO;
    }
}

