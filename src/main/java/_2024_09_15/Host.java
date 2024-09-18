package _2024_09_15;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;


@Component("hostBean")
public class Host {
    private String host;
    private int port;
    private String token;

    public Host(@Value("${host}") String host, @Value("${port}")int port, @Value("${token}") String token) {
        System.out.println("constructor");
        this.host = host;
        this.port = port;
        this.token = token;

    }

    @PostConstruct
    public void init(){
        System.out.println("init method");

    }

    public String createNewToken(){
        this.token = UUID.randomUUID().toString();
        return token;
    }

    @PreDestroy
    private void destroy(){
        System.out.println("destroy method");
        try {
            Files.writeString(Path.of("C:\\repos\\spring\\src\\main\\resources\\properties\\_2004_09_15.properties"),this.toString(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * host = "google.com"
     * port = 8088
     * token = "hi my Friend"
     * @return
     */
    @Override
    public String toString() {
        return
                "host=" + host + '\n' +
                        "port=" + port + '\n' +
                        "token='" + token + '\n';
    }
    }

