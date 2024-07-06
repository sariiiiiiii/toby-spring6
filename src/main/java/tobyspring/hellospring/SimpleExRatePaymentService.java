package tobyspring.hellospring;

import java.math.BigDecimal;

public class SimpleExRatePaymentService extends PaymentService{

    @Override
    BigDecimal getKRWExRate(String currency) {
        if ("USD".equals(currency)) {
            return BigDecimal.valueOf(1000);
        }
        throw new IllegalArgumentException("지원되지 않는 통화입니다");
    }

}
