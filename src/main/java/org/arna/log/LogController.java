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
@RequestMapping(value = "/log", produces = {
        MediaType.APPLICATION_JSON_VALUE
})
public class LogController {

    @PostMapping
    ResponseEntity<?> publish (@RequestBody LogMessage contents) {
        System.out.print(contents.getDate() + contents.getMessage());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    LogMessage getlog() {
        Date date = new Date();
        return new LogMessage(date, "Test Message");
    }

}