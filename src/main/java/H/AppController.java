package H;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AppController {
    @GetMapping("/")
    public String index(@RequestParam("loadId") String robotId,
                        @RequestParam("x") long x,
                        @RequestParam("y") long y
                        ) {
        Logic logic = new Logic();
        Result result = new Result();
        try {
            result = logic.cal(robotId, x, y);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.toJSONString(result);
    }
}
