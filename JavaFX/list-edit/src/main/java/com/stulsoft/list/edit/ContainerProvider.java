package com.stulsoft.list.edit;

import java.util.ArrayList;
import java.util.List;

public class ContainerProvider {
    public List<Container> loadContainers(){
        ArrayList<Container> containers = new ArrayList<>();
        for (int i = 0; i < /*5*/10; ++i) {
            var c = new Container("container " + i);
            containers.add(c);
        }

        return containers;
    }
}
