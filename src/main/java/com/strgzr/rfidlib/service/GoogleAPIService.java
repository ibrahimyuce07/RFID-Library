package com.strgzr.rfidlib.service;

import com.google.gson.Gson;
import com.strgzr.rfidlib.interfaces.IGoogleAPIService;
import com.strgzr.rfidlib.model.googleapi.GoogleApiModel;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GoogleAPIService implements IGoogleAPIService {

    Logger logger = LoggerFactory.getLogger(GoogleAPIService.class);
    static Properties properties;

    @Override
    public List<GoogleApiModel> getGoogleApiModel(String query) throws IOException {

        List<GoogleApiModel> apiModels = new ArrayList<>();

        URL url = new URL(properties.getProperty("BOOK_API_URL") + query);
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            HttpGet request = new HttpGet(url.toString());
            request.addHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0");
            request.addHeader(HttpHeaders.ACCEPT, "application/json");
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    String result = EntityUtils.toString(entity);
                    GoogleApiModel fromJson = new Gson().fromJson(result, GoogleApiModel.class);
                    logger.info("GoogleApiModel: {}", fromJson);
                }
            } finally {
                response.close();
            }
        } catch (Exception e){
            logger.error("Error getting http response: {}", e.getMessage());
        } finally {
            httpClient.close();
        }
        return apiModels;
    }
}

