package adhanjas.com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler;
    private Recycler_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler=findViewById(R.id.recycler_view);
        addDataSet();
    }
    public void addDataSet(){
        List<Chat_model> chatlist=MyData.createData();
        adapter=new Recycler_Adapter(chatlist);
        recycler.setAdapter(adapter);
    }
}