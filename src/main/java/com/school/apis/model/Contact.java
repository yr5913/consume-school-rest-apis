package com.school.apis.model;

import lombok.Data;

@Data
public class Contact{

    private int contactId;
    private String name;
    private String mobileNum;
    private String contact_email;
    private String subject;
    private String message;
    private String status;

}
