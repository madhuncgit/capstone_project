package org.launchcode.hellocapstone.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.launchcode.hellocapstone.service.SubredditService;
import org.launchcode.hellocapstone.web.dto.SubredditDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subreddit")
@AllArgsConstructor
@Slf4j

public class SubredditController {

    private final SubredditService subredditService;
    @PostMapping
    public ResponseEntity<SubredditDto> createSubreddit(@RequestBody SubredditDto subredditDto){
    return ResponseEntity.status(HttpStatus.CREATED).
        body(subredditService.save(subredditDto));

    }
    @GetMapping
    public ResponseEntity<List<SubredditDto>> getAllSubreddits(){
        return ResponseEntity.status(HttpStatus.OK).body(subredditService.getAll());
    }
}
