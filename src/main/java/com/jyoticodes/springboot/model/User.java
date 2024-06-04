package com.jyoticodes.springboot.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 @Builder annotation is used to generate a builder class for the User class.
@Getter and @Setter annotations are used to generate getter and setter methods for the fields.
@NoArgsConstructor annotation generates a no-argument constructor.
With @Builder, you can create instances of User like this:
User user = User.builder()
                .id(1L)
                .username("john_doe")
                .email("john@example.com")
                .build();
This creates a new User instance with the specified values for its fields. Using the builder pattern 
can make your code cleaner and more readable, especially when dealing with classes with many fields or 
optional parameters.
 */
@Entity(name="user")
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
     @Id
     @Column(unique=true, nullable=false)
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    @Getter(AccessLevel.NONE)
    private String password;
    @Column(length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private String phoneNumber;

    @Getter(value = AccessLevel.NONE)
    // information
    private boolean enabled = true;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // SELF, GOOGLE, FACEBOOK, TWITTER, LINKEDIN, GITHUB
    @Enumerated(EnumType.STRING)
    private Providers provider = Providers.SELF;
    private String providerUserId;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Contact> contacts = new ArrayList<>();

    

    
  
}
