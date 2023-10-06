package com.xl1.fsuserinfo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.xl1.fsuserinfo.dto.UserDTO;
import com.xl1.fsuserinfo.entity.User;
import com.xl1.fsuserinfo.mapper.UserMapper;
import com.xl1.fsuserinfo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    UserRepository userRepository;


    public UserDTO addUser(UserDTO userDTO) {
       User savedUser = userRepository.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
       return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);

    }

    public ResponseEntity<UserDTO> fetchUserDetailsById(Long id) {
         Optional<User> fetchedUser =  userRepository.findById(id);
         if(fetchedUser.isPresent())
             return new ResponseEntity<>(UserMapper.INSTANCE.mapUserToUserDTO(fetchedUser.get()), HttpStatus.OK);
         return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }
}
