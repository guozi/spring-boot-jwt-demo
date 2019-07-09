package me.guozi.springbootjwtdemo.dao;

import me.guozi.springbootjwtdemo.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenyun on 2019-07-09
 */
@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {

    UserInfo findByUsername(String username);
}
