import entity.Users;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author 微信公众号《和尚的破功之路》
 * @date 2021/11/15 11:23
 * version: 1.0
 */
@Service
public interface UserMapper {

    int register(Users users);
}
