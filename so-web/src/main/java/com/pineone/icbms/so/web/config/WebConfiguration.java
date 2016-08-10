package com.pineone.icbms.so.web.config;

import com.pineone.icbms.so.bizcontext.BizContextApplication;
import com.pineone.icbms.so.contextinformation.ContextInformationApplication;
import com.pineone.icbms.so.contextmodel.ContextModelApplication;
import com.pineone.icbms.so.device.DeviceApplication;
import com.pineone.icbms.so.service.ServiceApplication;
import com.pineone.icbms.so.util.UtilApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Created by existmaster on 2016. 8. 9..
 */
@Import({BizContextApplication.class, ContextInformationApplication.class,
        ContextModelApplication.class, DeviceApplication.class,
        ServiceApplication.class, UtilApplication.class})
@EnableAutoConfiguration
@ComponentScan("com.pineone.icbms.so")
public class WebConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(WebConfiguration.class, args);
    }

}
