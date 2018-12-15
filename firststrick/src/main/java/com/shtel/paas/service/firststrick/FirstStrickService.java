package com.shtel.paas.service.firststrick;

import org.springframework.web.bind.annotation.GetMapping;

import com.shtel.paas.sdk.core.PaasBaseResponse;
import com.shtel.paas.sdk.core.PaasDefaultObject;
import com.shtel.paas.sdk.core.RefreshableRestController;

/**
 * 微服务返回json串
 * 
 * @author wjj
 *
 */
@RefreshableRestController
public class FirstStrickService {

    @GetMapping("/hello")
    public PaasBaseResponse<PaasDefaultObject> hello() {

        PaasDefaultObject paasDefaultObject = new PaasDefaultObject("hello world!");

        PaasBaseResponse<PaasDefaultObject> response = new PaasBaseResponse<>(paasDefaultObject);
        return response;
    }
}
