package com.vsii.soap2.demo.endpoint;
import java.text.SimpleDateFormat;

import java.util.Calendar;


import com.vsii.soap2.demo.model.GetIccRequest;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Component
public class IccEndpoint {

    static private final Logger logger = LoggerFactory.getLogger(IccEndpoint.class);

    public static String IccRequestSOAPRequest(GetIccRequest request)

    {

        logger.info("Calling Icc with GetIccRequest " +request.getRoom());
        String requestXml =" <gs:getEmployeesRequest xmlns:gs=\"http://localhost:8080/soap\">"+
                "  <gs:room>"+request.getRoom()+"</gs:room> "+
                " </gs:getEmployeesRequest>";

        return requestXml;

    }

}
