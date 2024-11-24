package com.example.varunhotel.service.interfac;

import com.example.varunhotel.dto.LoginRequest;
import com.example.varunhotel.dto.Response;
import com.example.varunhotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}

