package com.hdfcergo.cattletagging.CattleTaggingFragments;


import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.hdfcergo.cattletagging.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by davesuda on 2/11/2016.
 */
public class StatusFragment extends Fragment {

    TextView tvPending,tvApprove;
    boolean isPending  = false;
    boolean isApprove = false;
    Context mContext;
    private View view;
    ImageView rightArrow;
    EditText edt_tagdate;
    Calendar myCalendar = Calendar.getInstance();
    int mYear, mMonth, mDay;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_status, container, false);
        rightArrow = (ImageView) view.findViewById(R.id.forward);
        edt_tagdate = (EditText) view.findViewById(R.id.edt_tagdate);
        initializeViews();
        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void initializeViews() {

        mContext = view.getContext();
        //spinner.setOnItemSelectedListener(mContext);
        rightArrow.setVisibility(View.VISIBLE);

        tvApprove= (TextView)view.findViewById(R.id.tv_approve);
        tvApprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isApprove) {
                    tvApprove.setTextColor(Color.parseColor("#ffffff"));
                    tvApprove.setBackgroundResource(R.drawable.curve_sharp);

                    tvPending.setTextColor(Color.parseColor("#838383"));
                    tvPending.setBackgroundResource(R.drawable.bg_greyish);

                    isApprove=true;
                    isPending=false;
                }
                else
                {
                    tvApprove.setTextColor(Color.parseColor("#838383"));
                    tvApprove.setBackgroundResource(R.drawable.bg_greyish);
                    isApprove=false;
                }
            }
        });

        tvPending= (TextView) view.findViewById(R.id.tv_pending);
        tvPending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isPending) {
                    tvPending.setTextColor(Color.parseColor("#ffffff"));
                    tvPending.setBackgroundResource(R.drawable.curve_sharp);

                    tvApprove.setTextColor(Color.parseColor("#838383"));
                    tvApprove.setBackgroundResource(R.drawable.bg_greyish);

                    isPending=true;
                    isApprove=false;
                }
                else
                {
                    tvPending.setTextColor(Color.parseColor("#838383"));
                    tvPending.setBackgroundResource(R.drawable.bg_greyish);
                    isPending=false;
                }
            }
        });

        edt_tagdate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
               /* new DatePickerDialog(getContext(), date, myCalendar
                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();*/

                datePicker(edt_tagdate);

            }


        });
    }

    //For datepicker Dialog
    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateEdittext();
        }
    };

    private void updateEdittext() {
        String myFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        edt_tagdate.setText(sdf.format(myCalendar.getTime()));
    }


    public void datePicker(final TextView txt) {
        Calendar mcurrentDate = Calendar.getInstance();
        mYear = mcurrentDate.get(Calendar.YEAR);
        mMonth = mcurrentDate.get(Calendar.MONTH);
        mDay = mcurrentDate.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog mDatePicker = new DatePickerDialog(getActivity(),android.R.style.Theme_Holo_Dialog_MinWidth, new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {
                // TODO Auto-generated method stub
                txt.setText(selectedday + "/" + selectedmonth + "/" + selectedyear);
            }
        }, mYear, mMonth, mDay);
        mDatePicker.setTitle("Select date");
        mDatePicker.show();
    }
}