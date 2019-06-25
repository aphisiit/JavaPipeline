package guy.azdo.app.controller;

import guy.azdo.app.service.ICalculateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ICalculateService calculateService;

    @GetMapping("/")
    public String Index(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1.Addition use /add<br>");
        stringBuilder.append("2.Subtract use /sub<br>");
        stringBuilder.append("3.Multiple use /mul<br>");
        stringBuilder.append("4.Divide use /div<br>");

        return stringBuilder.toString();
    }

    @GetMapping("/add")
    public Integer add(@RequestParam("a") Integer a,@RequestParam("b") Integer b){
        try {
            return calculateService.add(a,b);
        }catch (Exception e){
            LOGGER.error("{}",e.getMessage());
            return null;
        }
    }

    @GetMapping("/sub")
    public Integer sub(@RequestParam("a") Integer a,@RequestParam("b") Integer b){
        try {
            return calculateService.sub(a,b);
        }catch (Exception e){
            LOGGER.error("{}",e.getMessage());
            return null;
        }
    }

    @GetMapping("/mul")
    public Integer mul(@RequestParam("a") Integer a,@RequestParam("b") Integer b){
        try {
            return calculateService.mul(a,b);
        }catch (Exception e){
            LOGGER.error("{}",e.getMessage());
            return null;
        }
    }

    @GetMapping("/div")
    public Integer div(@RequestParam("a") Integer a,@RequestParam("b") Integer b){
        try {
            return calculateService.div(a,b);
        }catch (Exception e){
            LOGGER.error("{}",e.getMessage());
            return null;
        }
    }

}
