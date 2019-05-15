package com.learningstuff.dataconverttochartdata.controller;

import com.learningstuff.dataconverttochartdata.model.Data;
import com.learningstuff.dataconverttochartdata.model.Hloc;
import com.learningstuff.dataconverttochartdata.model.Vl;
import com.learningstuff.dataconverttochartdata.model.XSeries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Date: 5/15/19
 * Time: 2:30 PM
 */

@RestController
public class DemoController {

    @GetMapping("")
    public String test() {

        return "Ok";
    }

    @GetMapping("data")
    public Data getData() {

        List<int[]> listHloc = new ArrayList<>();
        listHloc.add(new int[]{1, 4, 5, 6});
        listHloc.add(new int[]{7, 2, 5, 6});
        listHloc.add(new int[]{5, 8, 5, 9});
        listHloc.add(new int[]{4, 5, 6, 9});

        Hloc hloc = new Hloc(listHloc);

        Vl vl = new Vl(Arrays.asList(11, 22, 33, 44));
        XSeries xSeries = new XSeries(Arrays.asList(55, 66, 77, 88));

        Data data = new Data(
                hloc,
                vl,
                xSeries
        );

        return data;
    }

}
