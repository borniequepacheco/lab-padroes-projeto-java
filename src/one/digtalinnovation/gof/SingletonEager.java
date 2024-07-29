package one.digtalinnovation.gof;

/**
 * Singleton "apressado"
 *
 * @author borniequepacheco
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
