import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    private Task task;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        //перед каждым тестом создаем новый объект класса Task
        //старый объект класса Task будет удален GG по наступлению соответствующего трешхолда
        task = new Task();
    }

    @org.junit.jupiter.api.Test
    void setCount() {
        task.setCount(5);

        assertEquals(5, task.getCount());
    }
}