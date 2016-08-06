package in.incubateapp.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import in.incubateapp.ImageShow;
import in.incubateapp.Model.Chat;
import in.incubateapp.R;

/**
 * Created by Brekkishhh on 06-08-2016.
 */
public class StudentChat extends Fragment {

    ListView listView;

    public StudentChat() {
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.student_chat,container,false);

        listView = (ListView) view.findViewById(R.id.chatsListView);

        List<Chat> list = new ArrayList<>();

        list.add(new Chat("Sumit Kumar","Hello Bro..","08:50"));
        list.add(new Chat("Virendra Yadav","Hello Bro..","09:10"));
        list.add(new Chat("Himani Kansal","Hello Bro..","08:10"));

        list.add(new Chat("Ankita Aggarwal","What is this..","08:50"));
        list.add(new Chat("Aman Yadav","i dont know..","05:50"));
        list.add(new Chat("Rajeev Yadav","you r best bro..","06:50"));
        list.add(new Chat("Rajnish Yadav","i can do it..","07:50"));
        list.add(new Chat("Mahesh Yadav","you dont know ..","01:50"));
        list.add(new Chat("Aman Kumar","what is known by this..","04:50"));
        list.add(new Chat("Nitin Yadav","this is going to be awesome..","03:50"));
        list.add(new Chat("Sumit Kumar","you can do anything..","09:50"));

        listView.setAdapter(new ChatAdapter(list));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ImageShow.class);
                startActivity(intent);
            }
        });

        return view;
    }


    class ChatAdapter extends BaseAdapter{

        List<Chat> list;

        public ChatAdapter(List<Chat> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_chat_list,parent,false);

            TextView textView = (TextView) view.findViewById(R.id.userName);
            TextView lastMess = (TextView) view.findViewById(R.id.lastChatMess);
            TextView time = (TextView) view.findViewById(R.id.timeStamp);

            textView.setText(list.get(position).user);
            lastMess.setText(list.get(position).lastMess);
            time.setText(list.get(position).time);

            return view;
        }
    }
}
