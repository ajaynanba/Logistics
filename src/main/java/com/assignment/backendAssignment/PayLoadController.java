package com.assignment.backendAssignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/load")
public class PayLoadController {
    @Autowired
    PayLoadService payLoadService;
    @PostMapping("/addLoad")
    public ResponseEntity<String> addLoad(@RequestBody Payload payload){
        String ans = payLoadService.addLoad(payload);
        return new ResponseEntity<>(ans, HttpStatus.CREATED);
    }

    @GetMapping("/getLoad")
    public ResponseEntity<Payload> getLoad(@RequestParam("loadId") Integer loadId){
        Payload list = payLoadService.getLoadList(loadId);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getAllLoad")
    public ResponseEntity<List<Payload>> getAlLoad(){
        List<Payload> list = payLoadService.getAllLoad();
        if(list!=null){
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Payload> updateLoad(@PathVariable Integer id, @RequestBody Payload payload){
        Payload load = payLoadService.updateLoad(id, payload);
        if(load!=null) return new ResponseEntity<>(load, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLoad(@PathVariable Integer id){
        String ans = payLoadService.deleteLoad(id);
        if(ans != null){
            return new ResponseEntity<>(ans, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
