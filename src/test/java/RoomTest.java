import org.junit.Before;
import org.junit.Test;
import rooms.Rooms;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Rooms room;

    @Before
    public void before(){
        room = new Rooms();
    }

    @Test
    public void testRandomiser(){
        room.roomContents();
    }
}
