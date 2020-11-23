package com.forbitbd.androidutils.dialog.delete;


import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import com.forbitbd.androidutils.R;
import com.forbitbd.androidutils.utils.Constant;
import com.google.android.material.button.MaterialButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteDialog extends DialogFragment implements View.OnClickListener {


    private TextView tvContent,tvTitle;

    private MaterialButton btnCancel,btnYes;

    private String title = "";
    private String content = "";

    private DialogClickListener listener;


    public DeleteDialog() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        content = getArguments().getString(Constant.CONTENT);
        title = getArguments().getString(Constant.TITLE);
    }

    public void setListener(DialogClickListener listener){
        this.listener = listener;
    }



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.fragment_delete_dialog, null);
        initView(view);

        AlertDialog alertDialog = new AlertDialog.Builder(getActivity(), R.style.MyDialog).create();

        alertDialog.setView(view);
        return alertDialog;
    }

    private void initView(View view) {

        tvContent = view.findViewById(R.id.content);
        tvTitle = view.findViewById(R.id.title);
        btnCancel = view.findViewById(R.id.cancel);
        btnYes = view.findViewById(R.id.yes);

        btnCancel.setOnClickListener(this);
        btnYes.setOnClickListener(this);

        if(content!=null && !content.equals("")){
            tvContent.setText(content);
        }

        if(title!=null && !title.equals("")){
            tvTitle.setText(title);
        }
    }

    @Override
    public void onClick(View view) {
        if(view==btnCancel){
            dismiss();
        }else if(view==btnYes){
            if(listener!=null){
                listener.positiveButtonClick();
            }

        }
    }
}
