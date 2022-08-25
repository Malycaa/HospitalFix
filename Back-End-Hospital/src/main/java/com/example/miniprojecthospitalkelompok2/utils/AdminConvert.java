package com.example.miniprojecthospitalkelompok2.utils;
import com.example.miniprojecthospitalkelompok2.payload.request.AdminRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminConvert {
    private AdminRequest request;
    private String userName;
    private String role;

    public AdminConvert(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }
}
