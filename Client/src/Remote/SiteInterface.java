package Remote;

import java.rmi.Remote;

public interface SiteInterface extends Remote {
    String choose (int menu) throws Exception;
}
