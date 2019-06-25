package guy.azdo.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class CalculateService implements ICalculateService {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @SuppressWarnings("Duplicates")
    @Override
    public Integer add(Integer a, Integer b) {
        LOGGER.info("Addition");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        LOGGER.info("a : {}",a);
        LOGGER.info("b : {}",b);
        try {
            LOGGER.info("result : {}",a + b);
            return a + b;
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            throw e;
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Integer sub(Integer a, Integer b) {
        LOGGER.info("Subtract");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        LOGGER.info("a : {}",a);
        LOGGER.info("b : {}",b);
        try {
            LOGGER.info("result : {}",a - b);
            return a - b;
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            throw e;
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Integer mul(Integer a, Integer b) {
        LOGGER.info("Multiple");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        LOGGER.info("a : {}",a);
        LOGGER.info("b : {}",b);
        try {
            LOGGER.info("result : {}",a * b);
            return a * b;
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            throw e;
        }
    }

    @SuppressWarnings("Duplicates")
    @Override
    public Integer div(Integer a, Integer b) {
        LOGGER.info("Divide");
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        LOGGER.info("a : {}",a);
        LOGGER.info("b : {}",b);
        try {
            LOGGER.info("result : {}",a / b);
            return a / b;
        }catch (Exception e){
            LOGGER.error(e.getMessage());
            throw e;
        }
    }
}
