package com.example.miniprojecthospitalkelompok2.service;

import com.example.miniprojecthospitalkelompok2.payload.request.LoginRequest;
import org.springframework.http.ResponseEntity;

public interface LoginService {

    ResponseEntity<Object> login (LoginRequest loginRequest);
}
