package com.looksin;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import javafx.scene.chart.PieChart;

public interface HelloRequest {


    static Template newBuilder() {
        return null;
    }

    String getName();
    String name = String.valueOf(1);

}
