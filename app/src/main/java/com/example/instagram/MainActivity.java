package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapters.PostAdapter;
import Adapters.StoryAdapter;
import Models.PostModel;
import Models.StoryModel;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView post_recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.story_recyclerView);
        post_recyclerview = findViewById(R.id.post_recyclerView);

        ArrayList<StoryModel> list = new ArrayList<>();

        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));
        list.add(new StoryModel(R.drawable.imdanielsimmons,"Daniel"));



        StoryAdapter adapter = new StoryAdapter(list,this);
        recyclerView.setAdapter(adapter);


        ArrayList<PostModel> list1 =  new ArrayList<>();
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));
        list1.add(new PostModel(R.drawable.styledweler,"styledweller"));

        PostAdapter adapter1 = new PostAdapter(list1,this);
        post_recyclerview.setAdapter(adapter1);
    }
}