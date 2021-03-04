package Covid19_2;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Vector<CovidData> data;
        Vector<String> countries;
        Vector<CaseAggregationDTO> topCountriesByCases = new Vector<>();
        String path = "C:\\Users\\DCV\\IdeaProjects\\DCV_2021\\src\\Covid19_1\\input\\covid19.csv";
        String separator = ",";
        data = CovidData.convert(CSVFileReader.getCovidData(path, separator));
        countries = CovidData.getCountries(data);
        for (var country : countries) {
            topCountriesByCases.add(new CaseAggregationDTO(country));
        }
        for (var item : data) {
            for (var country : topCountriesByCases) {
                if (item.getCountry().equals(country.getCountry())) {
                    country.addCases(item.getCases());
                }
            }
        }
    }
}

