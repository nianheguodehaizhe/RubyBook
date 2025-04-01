package com.nianheguodehaizhe.rubybook.auth;

import com.nianheguodehaizhe.framework.common.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class RubyBookAuthApplicationTests {

    private final UserDOMapper userDOMapper;
    public RubyBookAuthApplicationTests(@Autowired UserDOMapper userDOMapper) {
        this.userDOMapper = userDOMapper;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        UserDO userDO = UserDO.builder()
                .id(1L)
                .username("nianheguodehaizhe")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();
        userDOMapper.insert(userDO);
    }

    @Test
    void testSelect() {
        // 查询主键 ID 为 4 的记录
        UserDO userDO = userDOMapper.selectByPrimaryKey(1L);
        log.info("User: {}", JsonUtils.toJsonString(userDO));
    }

}
