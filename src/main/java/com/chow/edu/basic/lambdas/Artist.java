package com.chow.edu.basic.lambdas;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 *
 * @author shelvin
 * @date 6/10/16 at 01:22
 */

public class Artist
{
    private String name;
    private int age;
    private String place;
    private List<Artist> members;

    public Stream<Artist> getMembers()
    {
        return members.stream();
    }

    public boolean isSolo()
    {
        return members.isEmpty();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPlace()
    {
        return place;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }

    public boolean isFrom(String place)
    {
        if (place.equals(this.getPlace()))
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Artist artist = (Artist) o;
        return age == artist.age &&
                Objects.equals(name, artist.name) &&
                Objects.equals(place, artist.place) &&
                Objects.equals(members, artist.members);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, age, place, members);
    }
}
