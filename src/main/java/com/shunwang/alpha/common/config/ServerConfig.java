package com.shunwang.alpha.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class ServerConfig {
    private AvamarServer avamarServer = new AvamarServer();

    public AvamarServer getAvamarServer() {
        return avamarServer;
    }

    public void setAvamarServer(AvamarServer avamarServer) {
        this.avamarServer = avamarServer;
    }

    public static class AvamarServer {
        private String urlPrefix;

        private String cert;

        private String tokenUrl;

        private String username;

        private String password;

        public String getUrlPrefix() {
            return urlPrefix;
        }

        public void setUrlPrefix(String urlPrefix) {
            this.urlPrefix = urlPrefix;
        }

        public String getCert() {
            return cert;
        }

        public void setCert(String cert) {
            this.cert = cert;
        }

        public String getTokenUrl() {
            return tokenUrl;
        }

        public void setTokenUrl(String tokenUrl) {
            this.tokenUrl = tokenUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

}
