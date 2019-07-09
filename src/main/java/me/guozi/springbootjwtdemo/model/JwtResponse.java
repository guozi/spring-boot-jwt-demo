package me.guozi.springbootjwtdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by chenyun on 2019-07-09
 */
@Data
@AllArgsConstructor
public class JwtResponse implements Serializable {

    private static final long serialVersionUID = 6126433124857720877L;

    private final String token;
}
