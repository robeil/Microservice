package com.robeil.restfullwebapi.Versioning.controller;

import com.robeil.restfullwebapi.Versioning.entity.Name;
import com.robeil.restfullwebapi.Versioning.entity.PersonV1;
import com.robeil.restfullwebapi.Versioning.entity.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersingPersonController {

    /**
     * version using uri -- Twitter
     * @return
     */
    @GetMapping("/v1/person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Bob King");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Bob","King"));
    }

    /**
     * version using params -- Amazon
     * @return
     */
    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequest(){
        return new PersonV1("Bob King from version 1");
    }
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequest(){
        return new PersonV2(new Name("Bob","King From Version 2"));
    }
    /**
     * version using header -- Microsoft
     * @return
     */
    @GetMapping(path = "/person", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonHeaderRequest(){
        return new PersonV1("Bob King from header 1");
    }
    @GetMapping(path = "/person", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonHeaderRequest(){
        return new PersonV2(new Name("Bob","King From Header 2"));
    }
    /**
     * version using media type -- GitHub
     */
    @GetMapping(path = "/person", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPersonProducesRequest(){
        return new PersonV1("Bob King from produces 1");
    }
    @GetMapping(path = "/person", produces = "application/vnd.company.app-v2+json")
    public PersonV1 getSecondVersionOfPersonProducesRequest(){
        return new PersonV1("Bob King from produces 2");
    }
}
