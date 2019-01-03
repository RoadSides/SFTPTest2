package cn.itcast.test.service;

import cn.itcast.test.model.SFTPConfig;
import cn.itcast.test.util.SFTPUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SftpService {

    @Value("${sftp.username}")
    private String username;

    @Value("${sftp.password}")
    private String password;

    @Value("${sftp.port}")
    private int port;

    @Value("${sftp.host}")
    private String host;


    public SFTPConfig testFtpConnect(String path) {

        SFTPUtil sftpUtil = new SFTPUtil(username, password, host, port);
        boolean login = sftpUtil.login();
        boolean check = sftpUtil.checkPath(path);
        boolean logout = sftpUtil.logout();
        return new SFTPConfig(username, password, port, host, login, logout, check);
    }
}
