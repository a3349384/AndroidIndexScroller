package cn.zmy.indexscrollerdemo;

/**
 * Created by zmy on 2016/6/16 0016.
 */
public class CityItem
{
    private int id;
    private String name;
    private String enName;

    public CityItem(int id, String name, String enName)
    {
        this.id = id;
        this.name = name;
        this.enName = enName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEnName()
    {
        return enName;
    }

    public void setEnName(String enName)
    {
        this.enName = enName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof CityItem)
        {
            return this.id == ((CityItem) o).getId();
        }

        return false;
    }
}
