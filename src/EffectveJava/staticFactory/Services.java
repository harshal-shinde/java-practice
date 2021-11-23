package EffectveJava.staticFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//Non instantiable class for service registration and access
public class Services {

  //Prevents instantiation
  private Services () {}

  //Maps service names to services
  private static final Map<String, Provider> providers = 
    new ConcurrentHashMap<String, Provider>();
    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    //provider registration API
    public static void registerDefaultProvider(Provider provider) {
      registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name , Provider provider) {
      providers.put(name, provider);
    }

    //Service access API
    public static Service newInstance() {
      return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
      Provider p = providers.get(name);

      if(p==null) {
        throw new IllegalArgumentException("No provider register with name : " + name);
      }
      return p.newService();
    }
}