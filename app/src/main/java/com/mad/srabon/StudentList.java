package com.mad.srabon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.mad.srabon.adapter.MyAdapter;
import com.mad.srabon.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList extends AppCompatActivity {
    int[] pic={R.drawable.kambaiilogo,R.drawable.first_image,R.drawable.second_image,R.drawable.splashpic};
    List<Student> list;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        recyclerView=findViewById(R.id.studentListView);
        list=new ArrayList<>();
        Student student1=new Student("Srabon","01613162522","sfhdjah@gmail.com","fdjakfa");
        Student student2=new Student("Srabon","01613162522","sfhdjah@gmail.com","fdjakfa");
        Student student3=new Student("Srabon","01613162522","sfhdjah@gmail.com","fdjakfa");
        Student student4=new Student("Srabon","01613162522","sfhdjah@gmail.com","fdjakfa");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        MyAdapter myAdapter=new MyAdapter(list,pic,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdapter);
    }
}