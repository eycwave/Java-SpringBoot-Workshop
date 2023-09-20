package com.archisacademy.openai.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    // Class name must be singular.

    private String role;
    private String content;


}
