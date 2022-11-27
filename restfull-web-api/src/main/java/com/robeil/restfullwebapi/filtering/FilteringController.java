package com.robeil.restfullwebapi.filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
//
//    @GetMapping("/filtering")
//    public SomeBean getBean(){
//        SomeBean someBean = new SomeBean("value1","value2","Value3");
////        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
////        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
////        FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanProvider",filter);
////        mappingJacksonValue.setFilters(filters);
//        return  someBean;
//    }
}
