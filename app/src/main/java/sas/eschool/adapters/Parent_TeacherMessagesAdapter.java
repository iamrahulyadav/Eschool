package sas.eschool.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.List;

import sas.eschool.R;
import sas.eschool.pojo.NewMessage;
import sas.eschool.pojo.currentuser;

/**
 * Created by anarose on 11/14/17.
 */

public class Parent_TeacherMessagesAdapter extends RecyclerView.Adapter<Parent_TeacherMessagesAdapter.MessageViewHolder> {

    Activity context1;
    List<NewMessage> messages;

    public Parent_TeacherMessagesAdapter(Activity context, List<NewMessage> messages) {

        this.context1 = context;
        this.messages = messages;
    }

    @Override
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_messages, parent, false);
        return new MessageViewHolder(v);
    }


    @Override
    public void onBindViewHolder(MessageViewHolder holder, final int position) {
        if(messages.get(position).getFrom().equals("teacher")){
            holder.mesg_positioner.setGravity(Gravity.LEFT);
            holder.name.setText(currentuser.INSTANCE.getTeachername());
        }else{
            holder.mesg_positioner.setGravity(Gravity.RIGHT);
            holder.name.setText(currentuser.INSTANCE.getParentname());
        }
        holder.message.setText(messages.get(position).getMessage());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder {

        TextView message,name;
        LinearLayout mesg_positioner;

        public MessageViewHolder(View itemView) {
            super(itemView);

            message = itemView.findViewById(R.id.msg);
            name = itemView.findViewById(R.id.name);
            mesg_positioner = itemView.findViewById(R.id.card_newmsg_positioner);
        }
    }
}
