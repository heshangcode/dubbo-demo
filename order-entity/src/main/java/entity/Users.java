package entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @BelongsProject: lagou-dubbo
 * @Author: GuoAn.Sun
 * @CreateTime: 2020-07-27 17:34
 * @Description: 用户实体类
 */
@Data
@Builder
public class Users implements Serializable {
    private int uid;
    private String username;
    private String phone;


}
