package win.prashant.nav_item_on_fragment_tablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }

    ListView listView;

    String countryname[] = {"Alex", "jon", "Paras" ,"Albin","Alex", "jon", "Paras" ,"Albin","Alex", "jon", "Paras" ,"Albin","Alex", "jon", "Paras" ,"Albin",};
    ArrayList<String> al;
    ArrayAdapter<String> aa;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_one,container,false);
        //return inflater.inflate(R.layout.fragment_fragment_one, container, false);

        listView = view.findViewById(R.id.listChat);
        al = new ArrayList<String>();
        aa = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1,countryname);
        listView.setAdapter(aa);

        //al.add();

        return view;
    }

}
