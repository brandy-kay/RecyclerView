package adhanjas.com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.MyHolder> {

private List<Chat_model> list;

    public Recycler_Adapter(List<Chat_model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.message.setText(list.get(position).getText());
        holder.text.setText(list.get(position).getMessage());
        holder.imageView.setImageResource(list.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView text;
        TextView message;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView=itemView.findViewById(R.id.card_image);
            this.text=itemView.findViewById(R.id.text_name);
            this.message=itemView.findViewById(R.id.text_message);

        }
    }








}
