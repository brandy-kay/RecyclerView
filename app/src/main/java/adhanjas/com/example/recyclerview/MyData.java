package adhanjas.com.example.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class MyData {
    private static List<Chat_model> data=new ArrayList<>();
    public static List<Chat_model> createData(){
        data.add(new Chat_model(R.drawable.ic_launcher_background,"kenya","good people"));
        data.add(new Chat_model(R.drawable.ic_launcher_background,"uganda","good people"));
        data.add(new Chat_model(R.drawable.ic_launcher_background,"tz","good people"));
        data.add(new Chat_model(R.drawable.ic_launcher_background,"Rwanda","good people"));
        data.add(new Chat_model(R.drawable.ic_launcher_background,"kenya","good people"));
        return data;
    }
}
