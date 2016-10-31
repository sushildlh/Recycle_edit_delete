package firebase.sushildlh.com.firebaseoperations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by blackgoogle on 10/29/16.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myHolder> {

    private Context context;
    private List<String> names;

    public CustomAdapter(Context context, List<String> names) {
        this.context = context;
        this.names = names;
    }

    @Override
    public myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new myHolder(LayoutInflater.from(context).inflate(R.layout.item_main, parent, false));
    }

    @Override
    public void onBindViewHolder(myHolder holder, int position) {
        holder.mName.setText(names.get(position));
    }

    public void addItem(String country) {
        names.add(country);
        notifyItemInserted(names.size());
    }

    public void removeItem(int position) {
        names.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, names.size());
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class myHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name)
        TextView mName;

        @BindView(R.id.email)
        TextView mEmail;

        @BindView(R.id.phone)
        TextView mPhone;

        public myHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
