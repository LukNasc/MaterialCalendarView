package com.example.calendarview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

public class MainActivity extends AppCompatActivity {
    private MaterialCalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);

       /* calendarView.state().edit().setMinimumDate(CalendarDay.from(2015,1,1))
        .setMaximumDate(CalendarDay.from(2022,1,1));*/
       CharSequence[] meses = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
       calendarView.setTitleMonths(meses);

        CharSequence[] semanas = {"Seg","Ter","Qua","Qui","Sex","Sab","Dom"};
        calendarView.setWeekDayLabels(semanas);


        calendarView.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
                Log.i("CalendarView","Data: "+(date.getMonth() + 1)+"/"+date.getYear());
            }
        });

       /* calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                Log.i("CalendarView","Data: "+date);
            }
        });*/
    }
}
