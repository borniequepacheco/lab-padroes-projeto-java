package one.digtalinnovation.gof;

/**
 * Singleton "Lazy Holder"
 *
 * @author borniequepacheco
 */
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){

        return InstanceHolder.instancia;
    }
}
