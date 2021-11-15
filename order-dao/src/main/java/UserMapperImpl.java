import entity.Users;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author 微信公众号《和尚的破功之路》
 * @date 2021/11/15 11:26
 * version: 1.0
 */
@Slf4j
public class UserMapperImpl implements UserMapper {
    @Override
    public int register(Users users) {
        log.error("进入 dao 层");
        return 0;
    }
}
