package dev.kieuanh.SpringBootFullSkill.controller;

import dev.kieuanh.SpringBootFullSkill.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/{userId}")
    public UserRequestDTO getUser(@PathVariable("userId") int id){
        return new  UserRequestDTO("kieuanh", "dev", "2004", "kieuanh.dev@gmao");
    }

    @GetMapping("/list")
    public List<UserRequestDTO> getAllUsers(@RequestParam(defaultValue = "0") int pageNO, @RequestParam(defaultValue = "10") int pageSize){
        return List.of(new  UserRequestDTO("kieuanh", "dev", "2004", "kieuanh.dev@gmao"),
                new  UserRequestDTO("kieuwanh", "dev", "2004", "kieuanh.dev@gmao"));
    }

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
    public String deleteUser(@PathVariable("userId") int id){
        return "Deleted User" + id;
    }


}
