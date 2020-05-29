package com.music.bcmusic.Service.impl;

import com.alipay.api.AlipayApiException;
import com.music.bcmusic.Service.PayService;
import com.music.bcmusic.config.service.Alipay;
import com.music.bcmusic.domain.AlipayBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.print.Pageable;

public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }
}
