package com.lviv.spark.enrichment;

import com.lviv.spark.FootballAction;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Row;

/**
 * Created by Anatoliy on 14.04.2017.
 */
public interface DataEnrichmentService {
    JavaRDD<FootballAction> enrichData(JavaRDD<FootballAction> rdd);
}
