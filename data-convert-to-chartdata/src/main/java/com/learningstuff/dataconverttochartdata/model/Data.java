package com.learningstuff.dataconverttochartdata.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Date: 5/15/19
 * Time: 2:07 PM
 */


@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
public class Data {

    private Hloc hloc;
    private Vl vl;
    private XSeries xSeries;
}
