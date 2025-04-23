package com.algos12_sorting;

import java.util.Comparator;

public class SortUsingComparator {
}

class Employee{
    String name;
    String city;
    int eid;
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
}

class  CustomSort implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee t1) {
        if(employee.getCount()>t1.getCount())
            return -1;
        else if (employee.getCount()<t1.getCount())
            return 1;
        else
            return 0;
    }
}

