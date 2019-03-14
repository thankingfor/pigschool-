package com.pigschool.xyzshow.model.vo;


import com.pigschool.xyzshow.model.XyzMessage;
import com.pigschool.xyzshow.model.XyzUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class MessageList {

    private XyzMessage message;

    private XyzUser user;
}
