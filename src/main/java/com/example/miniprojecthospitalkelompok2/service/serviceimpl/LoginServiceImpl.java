package com.example.miniprojecthospitalkelompok2.service.serviceimpl;

import com.example.miniprojecthospitalkelompok2.entity.Users;
import com.example.miniprojecthospitalkelompok2.payload.request.LoginRequest;
import com.example.miniprojecthospitalkelompok2.payload.response.CommonResponse;
import com.example.miniprojecthospitalkelompok2.repository.UserRepository;
import com.example.miniprojecthospitalkelompok2.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    
    private final UserRepository userRepository;

    public LoginServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public ResponseEntity<Object> login(LoginRequest loginRequest){
        try {
            Users user = userRepository.findByUserName(loginRequest.getUserName()).orElse(null);
            if (user == null) {
                return CommonResponse.fail("User not found");
            }
            if (!loginRequest.getPassword().equals(user.getPassword())) {
                return CommonResponse.fail("Password do not match");
            }
            return CommonResponse.common("OK", HttpStatus.OK, user);
        } catch (Exception e) {
            return CommonResponse.fail(e.getMessage());
        }
    }

}
