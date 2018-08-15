package security;

import java.io.IOException;
import java.util.Properties;

import org.mule.modules.security.placeholder.SecurePropertyPlaceholderModule;
import org.mule.util.IOUtils;

public class CustomSecurePropertyPlaceholderModule extends SecurePropertyPlaceholderModule {

        public void setKeyFilePath(String keyFilePath) throws IOException {
                Properties prop = new Properties();
                prop.load(IOUtils.getResourceAsStream(keyFilePath, this.getClass()));
                super.setKey(prop.getProperty("secure.key"));
        }

}