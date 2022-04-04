package com.strgzr.rfidlib.rest;

import com.strgzr.rfidlib.interfaces.IGoogleAPIService;
import com.strgzr.rfidlib.model.googleapi.GoogleApiModel;
import com.strgzr.rfidlib.service.GoogleAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class GoogleApiController {

    @Autowired
    private IGoogleAPIService apiService;

    @RequestMapping(value = "/getGoogleApi/{query}" , produces = "application/json", method = RequestMethod.GET)
    @ResponseBody
    public List<GoogleApiModel> getGoogleApi(@PathVariable String query) throws IOException {
        return apiService.getGoogleApiModel(query);
    }


}
