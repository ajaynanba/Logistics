package com.assignment.backendAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
@Repository
public class PayLoadRepository {
        @Autowired
        PayLoadService payLoadService;
       public HashMap<Integer, Payload> payLoadDB = new HashMap<>();

       public String addLoad(@RequestBody Payload payload){
           int id = payload.getLoadId();
           payLoadDB.put(id, payload);
           return "loads details added successfully";
       }

       public Payload getLoadList(Integer loadId){
           Payload list = payLoadDB.get(loadId);
           return list;
       }

       public List<Payload> getAllLoad(){
           List<Payload> list = new ArrayList<>();
           for(Payload payload : payLoadDB.values()){
               list.add(payload);
           }
           return list;
       }

       public Payload updateLoad(int id, Payload payload){
           if(payLoadDB.containsKey(id)){
               payload.setLoadId(id);
                payLoadDB.put(id, payload);
                return payLoadDB.get(id);
           }
           return null;
       }

       public String deleteLoad(int id){
           if(payLoadDB.containsKey(id)){
               payLoadDB.remove(id);
               return "Deleted Successfully";
           }
           return "Already doesn't exist";
       }

 }
