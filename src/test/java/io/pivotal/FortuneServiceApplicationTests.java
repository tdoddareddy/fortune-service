package io.pivotal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FortuneServiceApplication.class)
public class FortuneServiceApplicationTests {

    @Test
    public void contextLoads() throws Exception {

    }

    @Autowired
    private JdbcTemplate template;

    @Test
    public void testDefaultSettings() throws Exception {
        assertThat(this.template.queryForObject("SELECT COUNT(*) FROM fortune",
                Integer.class)).isEqualTo(7);
    }

}
