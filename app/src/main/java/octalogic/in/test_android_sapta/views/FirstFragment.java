package octalogic.in.test_android_sapta.views;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import octalogic.in.test_android_sapta.R;
import octalogic.in.test_android_sapta.adapters.BasicImageAdapter;

public class FirstFragment extends Fragment {

    private final String TAG = getClass().getName();

    public FirstFragment() {
    }

    private BasicImageAdapter mBasicImageAdapter;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    void setUpRecyclerView(View view) {
        final RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mBasicImageAdapter = new BasicImageAdapter();
        recyclerView.setAdapter(mBasicImageAdapter);
    }

}
