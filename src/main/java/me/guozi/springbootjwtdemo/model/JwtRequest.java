package me.guozi.springbootjwtdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by chenyun on 2019-07-09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 7080470917121417971L;

    private String username;
    private String password;
}
