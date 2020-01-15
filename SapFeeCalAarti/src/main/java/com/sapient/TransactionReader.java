package com.sapient;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.sapient.Constant.FILE_TYPE;

@FunctionalInterface
public interface TransactionReader {

    List<Transaction> read(String filePath) throws IOException;

     static List<Transaction> readFile(FILE_TYPE fileType, String filePath) throws IOException {
        
                return textTrxReader().read(filePath);
            
        }
    
    static TransactionReader textTrxReader() {
        return transactionFile -> {
            List<Transaction> list = new ArrayList<>();
            String line = "";
            String cvsSplitBy = ",";
            try (BufferedReader br = new BufferedReader(new InputStreamReader(TransactionReader.class.getClassLoader().getResourceAsStream(transactionFile)));) {
                while ((line = br.readLine()) != null) {
                    String[] transactionAttributes = line.split(cvsSplitBy);
                    Transaction transaction = Utils.getTransaction(transactionAttributes);
                    list.add(transaction);
                }
                return list;
            }
        };
    }

    

}
