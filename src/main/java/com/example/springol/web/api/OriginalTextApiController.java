package com.example.springol.web.api;

import com.example.springol.data.OriginalTextService;
import com.example.springol.entity.OriginalText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/api/originaltexts", produces = "application/json")
//@CrossOrigin(origins = {"http://oldlanguages:8080", "http://oldlanguages.com"})
public class OriginalTextApiController {

    @Autowired
    private OriginalTextService originalTextService;
  /*  public OriginalTextApiController(OriginalTextService originalTextService) {
        this.originalTextService = originalTextService;
    } */

    @GetMapping(params = "recent")
    public List<OriginalText> allOriginalTexts() {
        List<OriginalText> texts = originalTextService.findAll();
        return texts;
    }

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public OriginalText postOrder(@RequestBody OriginalText text) {
        Optional<OriginalText> savedText = originalTextService.save(text);
        return savedText.get();
    }

    @DeleteMapping("/{origTextId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable("origTextId") Long origTextId) {
        try {
            originalTextService.deleteByOrigTextId(origTextId);
        } catch (EmptyResultDataAccessException ex) {
            //log.error(ex.toString());
        }
    }
}

