package ważne_NALEŻY_ZNAĆ.records;

import java.time.LocalDate;

record CarRecord (
    String model,
    String producer,
    LocalDate dateOfProduction,
    boolean imported,
    String vinNumber
){

}


