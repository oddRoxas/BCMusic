package com.music.bcmusic.Service;

import com.alipay.api.AlipayApiException;
import com.music.bcmusic.domain.AlipayBean;

public interface PayService {

    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
