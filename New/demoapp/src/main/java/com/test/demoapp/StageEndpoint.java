package com.test.demoapp;

//create  own actuator - we can do tasks in the run time like manupulating

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component //create a bean //can d the same with service or repository annotaion
@Endpoint(id="stage") //this is what we use in actuator/id in URL
public class StageEndpoint {

    Map<String,Stage> stages=new ConcurrentHashMap<>();


    @ReadOperation //HTTP Get call will come and map here
    public Map<String, Stage> getAllStages() {
        return stages;
    }

    @ReadOperation
    public Stage getStage(@Selector String name){ //selector tells that I want to operate this based on this values

        return stages.get(name); //get of stages will operate based on name
    }

    /*@WriteOperation
    public void setValue(@Selector String name, Stage stage){ //have to pass stage object, not the int value, can only pass the string values
        stages.put(name, stage); //have to pass as {"name":"st001","stage":"100" }

    }*/

    @WriteOperation
    public void setValue(@Selector String name, int stage){ //now can pass int parameter values {"name":"st001","stage":100 }
        stages.put(name, new Stage(stage));

    }


    /*static class Stage{
        String value; //changed value to string and passed as "100" so it took the parameters

        public Stage(String value) { //every stage shoud have a threshold value
            this.value = value;
        }

        public String getValue() {
            return value; //return all stages we have
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
*/
    static class Stage{
        int value; //rest controller cannot identify complex data types

        public Stage(int value) { //every stage shoud have a threshold value
            this.value = value;
        }

        public int getValue() {
            return value; //return all stages we have
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
