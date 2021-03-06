package com.lviv.spark;

import com.lviv.spark.io.CsvField;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 14.04.2017.
 */
public class FootballAction implements Serializable, Cloneable {
    @Getter @Setter @CsvField
    int code;
    @Getter @Setter @CsvField
    String from;
    @Getter @Setter @CsvField
    String to;
    @Getter @Setter @CsvField
    String eventTime;
    @Getter @Setter @CsvField
    String stadion;
    @Getter @Setter @CsvField
    String startTime;

    @Getter @Setter @CsvField
    String teamName;
    @Getter @Setter @CsvField
    String codeName;
    @Getter @Setter @CsvField
    Integer timeNumber;

    @Getter @Setter
    List<String> validationErrors;
    public FootballAction() {
        validationErrors = new ArrayList<>();
    }

    public FootballAction publicClone() throws CloneNotSupportedException {
        return (FootballAction)this.clone();
    }
}
