import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoridadeTest {

    @Test
    public void informalTest(){
        Autoridade autoridade = new Autoridade("Cesar", "Eduardo", new Informal());
        Assertions.assertEquals("Cesar", autoridade.getTratamento());
    }

    @Test
    public void respeitosoTest(){
        Autoridade autoridade = new Autoridade("Cesar", "Eduardo", new Respeitoso("masculino"));
        Assertions.assertEquals("Sr. Eduardo", autoridade.getTratamento());
    }

    @Test
    public void comTituloTest(){
        Autoridade autoridade = new Autoridade("Cesar", "Eduardo", new ComTitulo("Magnífico"));
        Assertions.assertEquals("Magnífico Cesar Eduardo", autoridade.getTratamento());
    }



}