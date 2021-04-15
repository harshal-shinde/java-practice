package EffectveJava;

//Service Provider framework sketch

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Service Interface
interface Service {
    // Service-specific methods go here
}

//Service provider interface
interface Provider {
    Service newService();
}

//Non instantiable class for service registration and access
public class Services {
    private Services() {
    }

    //Maps service names to services

    private static final Map<String, Provider> providers =
            new ConcurrentHashMap<String, Provider>();
    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //Provider registration API
    public static void registerDefaultProvider(Provider p) {
        registerDefaultProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerDefaultProvider(String name, Provider p) {
        registerDefaultProvider(DEFAULT_PROVIDER_NAME, p);
    }

    //Service access API
    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException(
                    "No provider registered with name:" + name
            );
        }
        return p.newService();
    }

}
