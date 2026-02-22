package in.sambhav.billingSoftware.service;

import in.sambhav.billingSoftware.io.UserRequest;
import in.sambhav.billingSoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUser();

    void deleteUser(String user);
}
