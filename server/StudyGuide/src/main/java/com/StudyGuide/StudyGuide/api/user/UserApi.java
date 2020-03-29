package com.StudyGuide.StudyGuide.api.user;

import com.StudyGuide.StudyGuide.dto.user.UserDto;
import com.StudyGuide.StudyGuide.service.user.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;


@RestController
@RequestMapping("/api/user")
public class UserApi {
    @Autowired
    private UserService userService;

    @PostMapping(value="", produces="application/json")
    @ApiOperation(value="creates user")
    @ApiResponses(value = {
            @ApiResponse(code=200, message="Successfully created user", response= UserDto.class),
            @ApiResponse(code=400, message="Request not valid")
    })
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
        try {
            return new ResponseEntity<>(userService.createUser(userDto), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(userDto, HttpStatus.BAD_REQUEST);
        }
        }

}
