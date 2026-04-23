package com.nonsyncbobbal.jobappliaction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class JobPost {
    private int postId;
    private  String postTitle;
    private String postDesc;
    private int reqExp;
    private List<String> techStack;

}
