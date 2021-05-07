package spring.config.serverprivategit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServerPrivateGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerPrivateGitApplication.class, args);
	}

}
