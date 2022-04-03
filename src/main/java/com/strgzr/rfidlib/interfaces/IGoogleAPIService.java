package com.strgzr.rfidlib.interfaces;

import com.strgzr.rfidlib.model.googleapi.GoogleApiModel;

import java.io.IOException;
import java.util.List;

public interface IGoogleAPIService {

    List<GoogleApiModel> getGoogleApiModel(String query) throws IOException;
}
