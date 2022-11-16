package com.ascend.memphis.app;


import io.jmix.ui.component.formatter.Formatter;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.Locale;


@Component("ui_PercentFormatter")
public class PercentageFormatter implements Formatter<Double> {

    @Override
    public String apply(Double value) {
        return NumberFormat.getPercentInstance(Locale.getDefault()).format(value);
    }
}