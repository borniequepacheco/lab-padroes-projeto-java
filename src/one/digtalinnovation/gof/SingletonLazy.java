package one.digtalinnovation.gof;

/**
 * Singleton "preguiçoso"
 *
 * @author borniequepacheco
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }


}
