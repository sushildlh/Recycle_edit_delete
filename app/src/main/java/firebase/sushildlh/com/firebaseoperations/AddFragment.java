package firebase.sushildlh.com.firebaseoperations;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {

    @BindViews({R.id.first,R.id.last,R.id.email,R.id.phone,R.id.password})
    List<EditText> mEdits;



    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        return view;
    }

}
