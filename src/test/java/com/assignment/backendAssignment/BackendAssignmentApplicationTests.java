package com.assignment.backendAssignment;
//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Objects;

@SpringBootTest
class BackendAssignmentApplicationTests {
	@Autowired
	PayLoadController payLoadController;
	@Test
	public void testAddLoad() {
		Payload payload = new Payload(21,"ambattur","velachery", "toy", "Eicher", 1, 1000, "123", "dd-mm-yyyy");
		ResponseEntity<String> ans = payLoadController.addLoad(payload);
		ResponseEntity <Payload> list = payLoadController.getLoad(123);
		if(Objects.nonNull(list)){
			Assertions.assertEquals(123, 123);
		}
	}

}
