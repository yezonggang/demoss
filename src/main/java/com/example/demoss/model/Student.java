package com.example.demoss.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Data
public class Student {
    public int ID;
    public String NAME;
    public int AGE;
    public String GENDER;
    public String CLASS;

}
