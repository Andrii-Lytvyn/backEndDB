package de.ait.tracker.controllers;


import de.ait.tracker.controllers.api.UsersApi;
import de.ait.tracker.dto.UserDto;
import de.ait.tracker.services.UsersService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Builder
public class UsersController implements UsersApi {
    private final UsersService usersService;
    @Override
    public List<UserDto> getAllUsers() {
        return usersService.getAllUsers();
    }
}
