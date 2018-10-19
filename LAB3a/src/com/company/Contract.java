package com.company;

import java.util.Arrays;

public class Contract implements Storable
{
    Course[] courses = new Course[10];
    int noCourses = 0;

    public void addCourse(Course addv)
    {
        this.courses[this.noCourses] = addv;
        this.noCourses++;
    }

    public void deleteCourse()
    {
        this.noCourses--;
    }

    public void display()
    {
        for(int i=0; i<this.noCourses; i++)
        {
            courses[i].display();
        }
    }

    public void sort()
    {
        Arrays.sort(courses, 0, noCourses);
    }


}
