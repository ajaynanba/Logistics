package com.assignment.backendAssignment;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PayLoadService {
    @Autowired
    PayLoadRepository payLoadRepository;

    public String addLoad(@RequestBody Payload payload){
        String ans = payLoadRepository.addLoad(payload);
        return ans;
    }

    public Payload getLoadList(Integer loadId){
        Payload list = payLoadRepository.getLoadList(loadId);
        return list;
    }

    public List<Payload> getAllLoad(){
        List<Payload> list = payLoadRepository.getAllLoad();
        return list;
    }

    public Payload updateLoad(int id, Payload payload){
        return payLoadRepository.updateLoad(id, payload);
    }

    public String deleteLoad(int id){
        String ans = payLoadRepository.deleteLoad(id);
        return ans;
    }

}
