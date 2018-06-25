package org.arna.log;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class LogController {
    @RequestMapping(
            method=RequestMethod.POST,
            value="/log",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> publish (@RequestBody LogMessage contents) {
        System.out.print(contents.getDate() + contents.getMessage());
        return ResponseEntity.ok().build();
    }

    @RequestMapping(
            method=RequestMethod.GET,
            value="/log",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    LogMessage getlog() {
        Date date = new Date();
        return new LogMessage(date, "Test Message");
    }

    @RequestMapping(
            method=RequestMethod.GET,
            value="/status")
    public ResponseEntity<Object> healthCheck() {
        return new ResponseEntity<>("Service is up and running", null, HttpStatus.OK);
    }

}