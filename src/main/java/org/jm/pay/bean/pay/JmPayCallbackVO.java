package org.jm.pay.bean.pay;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author kong
 */
@Data
@Accessors(chain = true)
public class JmPayCallbackVO {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 商家订单号
     */
    private String outTradeNo;

    /**
     * 支付平台 wx ali
     */
    private String payPlatform;

    /**
     * 支付时间
     */
    private String payTime;
}
