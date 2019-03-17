package com.vsii.soap.endpoint;

import com.vsii.soap.models.Employees;
import com.vsii.soap.models.GetEmployeesRequest;
import com.vsii.soap.models.GetEmployeesResponse;
import com.vsii.soap.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EmployeesEndpoint {
    private static final String NAMESPACE_URI = "http://localhost:8080/soap";
    @Autowired
    private EmployeesService employeesService;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetEmployeesRequest")
    @ResponsePayload
    public GetEmployeesResponse listEmployees(@RequestPayload GetEmployeesRequest request){
        GetEmployeesResponse response=new GetEmployeesResponse();
        response.setEmployees(employeesService.findById(request.getId()));
        return response;
}
}


