package com.blog.base.emailApi.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailContentEntity {
    private List<String> emails;
    private List<String> ccEmail;
    private String title;
    private String content;
    private List<EmailEnclosureDTO> enclosureList;
}
