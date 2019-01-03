package cn.itcast.test.controller;

import cn.itcast.test.model.RestResult;
import cn.itcast.test.model.SFTPConfig;
import cn.itcast.test.service.SftpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SftpController {

    @Autowired
    private SftpService sftpService;

    @RequestMapping("/testFtpConnect")
    public RestResult testFtpConnect(@RequestParam String path){
        SFTPConfig sftpConfig = sftpService.testFtpConnect(path);
        return new RestResult(200,"success",sftpConfig);
    }
}
