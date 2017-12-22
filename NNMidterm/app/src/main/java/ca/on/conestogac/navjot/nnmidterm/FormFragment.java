package ca.on.conestogac.navjot.nnmidterm;


import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/**
 * A simple {@link Fragment} subclass.
 */
public class FormFragment extends Fragment{
    private Button submit;
    private EditText edName;
    private EditText edComment;
    private Toast validation;
    private Toast nameAndComment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_form, container, false);
        submit = (Button)view.findViewById(R.id.idSubmit);
        edName = (EditText)view.findViewById(R.id.idName);
        edComment = (EditText)view.findViewById(R.id.idComment);

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                validation();
            }
        });

        return view;
    }

    public void validation(){
        String nameString = edName.getText().toString().trim();
        String commentString = edComment.getText().toString().trim();
        if(nameString.equals("") || commentString.equals(""))
        {
            validation = Toast.makeText(getActivity().getApplicationContext(), "all fields are required", Toast.LENGTH_SHORT);
            validation.show();
        }
        else
        {
            nameAndComment = Toast.makeText(getActivity().getApplicationContext(), nameString + "-" + commentString, Toast.LENGTH_SHORT);
            nameAndComment.show();
        }
    }

}
