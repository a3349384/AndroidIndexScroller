package cn.zmy.indexscrollerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import cn.zmy.IndexScroller;

public class MainActivity extends AppCompatActivity
    implements IndexScroller.OnSectionChangeListener
{
    private RecyclerView recyclerView;
    private IndexScroller scroller;
    private ArrayList<CityItem> cities;
    private Map<String,Integer> mapSection;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        scroller = (IndexScroller) findViewById(R.id.indexScroller);
        scroller.setOnSectionChangeListener(this);

        cities = new ArrayList<>(CityHelper.getAllCities());
        CitiesAdapter adapter = new CitiesAdapter(this,cities);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        mapSection = new HashMap<>();
        for (int i = 0; i < cities.size(); i++)
        {
            CityItem cityItem = cities.get(i);
            String section = String.valueOf(cityItem.getEnName().charAt(0));
            if (!mapSection.containsKey(section))
            {
                mapSection.put(section,i);
            }
        }
    }

    @Override
    public void changeTo(String selectionKey)
    {
        Integer position = mapSection.get(selectionKey);
        if (position == null)
        {
            return;
        }

        ((LinearLayoutManager)recyclerView.getLayoutManager()).scrollToPositionWithOffset(position,0);
    }
}
