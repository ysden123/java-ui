package com.stulsoft.list.edit;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerProvider {
    public List<Container> loadContainers() {
        ArrayList<Container> containers = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            containers.addAll(Arrays.asList(objectMapper.readValue(new File("containers.json"),
                    Container[].class)));
        }catch (Exception exception) {
            exception.printStackTrace();
        }
        return containers;
    }

    public void saveContainers(List<Container> containers){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            Container[] array = containers.toArray(new Container[0]);
            objectMapper.writeValue(new File("c:/work/containers2.json"), array);
        }catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
