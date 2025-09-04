package dev.kieuanh.SpringBootFullSkill.controller;

import dev.kieuanh.SpringBootFullSkill.dto.request.UserRequestDTO;
import dev.kieuanh.SpringBootFullSkill.dto.respone.ResponseData;
import dev.kieuanh.SpringBootFullSkill.dto.respone.ResponseSuccess;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{userId}")
    public ResponseData<Integer> getUser(@PathVariable("userId") int id){
        return new  ResponseData<>(HttpStatus.CREATED.value(), "User successfully retrieved", id);
    }

    @GetMapping("/list")
    public List<UserRequestDTO> getAllUsers(@RequestParam(defaultValue = "0") int pageNO, @RequestParam(defaultValue = "10") int pageSize){
        return List.of(new  UserRequestDTO("kieuanh", "dev", "2004", "kieuanh.dev@gmao"),
                new  UserRequestDTO("kieuwanh", "dev", "2004", "kieuanh.dev@gmao"));
    }

//    @Operation(summary = "summary", description = "day la vi du", responses = {
//            @ApiResponse(responseCode = "201", description = "user added successfully",
//                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
//                            examples = @ExampleObject(name = "ex name", summary = "ex summary", value =
//                    """
//                            {
//                            "status" : 201.
//                            "message: add,
//                            "data":1
//                            }
//                            """)))
//    })
    @PostMapping(value = "/", headers = "apiKey=v1.0")
    public String addUser(@Valid @RequestBody UserRequestDTO userRequestDTO){
        return "Added User";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable("userId") int id,@Valid @RequestBody UserRequestDTO userRequestDTO){
        return "Updated User" + id;
    }

    @PatchMapping("/{userId}")
    public String patchUser(@PathVariable("userId") int id,@Valid @RequestBody UserRequestDTO userRequestDTO, @RequestParam(required = false) boolean status){
        return "Updated User" + id;
    }

    @DeleteMapping("/{userId}")
    public ResponseData<?> deleteUser(@PathVariable("userId") int id){
        return new ResponseData<>(HttpStatus.NO_CONTENT.value(), "delete sucse", id);
    }


}
