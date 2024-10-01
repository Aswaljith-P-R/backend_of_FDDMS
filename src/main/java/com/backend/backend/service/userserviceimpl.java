// package com.backend.backend.service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;
// import com.yourprojectname.model.User;  // Adjust the import to your actual User model
// import com.yourprojectname.repository.UserRepository; // Adjust to your actual repository

// @Service
// public class userserviceimpl implements UserService {

//     @Autowired
//     private UserRepository userRepository;

//     @Autowired
//     private PasswordEncoder passwordEncoder;

//     @Override
//     public User registerUser(String username, String password) {
//         if (userRepository.findByUsername(username) != null) {
//             throw new RuntimeException("User already exists with username: " + username);
//         }

//         User user = new User();
//         user.setUsername(username);
//         user.setPassword(passwordEncoder.encode(password));
//         return userRepository.save(user);
//     }

//     @Override
//     public User findUserByUsername(String username) {
//         return userRepository.findByUsername(username);
//     }

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = userRepository.findByUsername(username);
//         if (user == null) {
//             throw new UsernameNotFoundException("User not found with username: " + username);
//         }
//         return org.springframework.security.core.userdetails.User.builder()
//                 .username(user.getUsername())
//                 .password(user.getPassword())
//                 .roles("USER")
//                 .build();
//     }
// }

