package com.va.week10;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "webusers")
public class WebUser {

    @Id
    private String id;

    private String loginId;

    private String password;

    private UserState state;
}
